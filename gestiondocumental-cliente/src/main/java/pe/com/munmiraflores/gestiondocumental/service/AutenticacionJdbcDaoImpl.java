package pe.com.munmiraflores.gestiondocumental.service;

import javax.sql.DataSource;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
import org.springframework.stereotype.Repository;

import pe.com.munmiraflores.gestiondocumental.dao.UsuarioDao;
import pe.com.munmiraflores.gestiondocumental.domain.Usuarios;

@Repository("userLoginService")
public class AutenticacionJdbcDaoImpl extends JdbcDaoImpl{

	private Logger logger = Logger.getLogger(AutenticacionJdbcDaoImpl.class);
	
	@Autowired
	public AutenticacionJdbcDaoImpl(DataSource dataSource){
		setDataSource(dataSource);
	}
	
	@Autowired
	private UsuarioDao usuarioDao;
	
	@Override
	public UserDetails loadUserByUsername(String username) {
		try {
			
			this.setUsersByUsernameQuery("SELECT u.usrlog as username,u.clave as password, u.estado as enabled  FROM nsbusr01 u WHERE u.usrlog = ?");
			this.setAuthoritiesByUsernameQuery("SELECT  username ,authority FROM authorities WHERE username = ?");
			
			UserDetails user = super.loadUserByUsername(username);
			logger.debug("usuario login "+user.toString());
			Usuarios usuario =  usuarioDao.obtenerUsuarioPorUsername(username);
			
			Usuarios ubean = new Usuarios(usuario.getUsername(), usuario.getPassword(), usuario.isEnabled(), usuario.getAuthorities() );
			ubean.setUsrlog(user.getUsername());
			ubean.setClave(user.getPassword());
		//	ubean.setUsrnombrevh(usuario.getUsrnombrevh());
		//	ubean.setUsrapepaternovh(usuario.getUsrapepaternovh());
		//	ubean.setUsrapematernovh(usuario.getUsrapematernovh());
		//	ubean.setUsrfechanacimientodt(usuario.getUsrfechanacimientodt());
			ubean.setEstado( user.isEnabled()==true?1:0);
			logger.debug("*********"+ubean.toString());
			return ubean;	
		} catch (Exception e) {
			e.printStackTrace();
			throw new UsernameNotFoundException("No hay notaria relacionada a este usuario");
		}
	}

	
}

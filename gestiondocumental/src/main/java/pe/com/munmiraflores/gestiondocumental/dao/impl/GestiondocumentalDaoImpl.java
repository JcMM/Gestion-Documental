package pe.com.munmiraflores.gestiondocumental.dao.impl;

import java.util.List;
import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.munmiraflores.gestiondocumental.dao.GestiondocumentalDao;
import pe.com.munmiraflores.gestiondocumental.domain.Documentos;


@Service("gestiondocumentalDaoImpl")
@Transactional
public class GestiondocumentalDaoImpl implements GestiondocumentalDao {

	protected static Logger logger = Logger.getLogger("service");
	
	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;

	public List<Documentos> getDatosGenerales(Integer docanonum, Integer doccor, String tpodoccod) throws Exception {
		logger.debug("Recuperando todos los Datos Generales");
		Session session = null;
		Query query = null;
		try {
			session = sessionFactory.getCurrentSession();
			query = session.createQuery("SELECT tpodoccod, doccor, docanonum, docfchcre, estados.stsdsc, docsolncmp, personas.dni, personas.ruc, docasu, docnumfol, documentosPk.docuoactco, unidadOrganica.uniorgnom, documentosPk.doccaractc, cargo.cardsc, docdirfisc, docdircorc, dvigucdir, docobs, docflghc, docflganx, docflgarc, docusrcre, usuariosa.usrlog, docfchcre, docusrmod, usuariosb.usrlog, docfchmod FROM Documentos WHERE documentosPk.docstscod=estados.stscod AND docsolcon=personas.con AND documentosPk.docuoactco=unidadOrganica.unidadOrganicaPk.uniorgcod AND documentosPk.doccaractc=cargo.carcod AND docusrcre=usuariosa.usuariosPk.usrcod AND docusrmod = usuariosb.usuariosPk.usrcod AND docanonum="+docanonum+" AND doccor="+doccor+" AND tpodoccod="+tpodoccod);
			//query = session.createQuery("FROM Documentos");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return  query.list();
	}

}


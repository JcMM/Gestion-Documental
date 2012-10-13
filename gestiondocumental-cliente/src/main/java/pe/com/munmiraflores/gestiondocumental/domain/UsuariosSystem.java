package pe.com.munmiraflores.gestiondocumental.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

public class UsuariosSystem extends User{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer usrcod;
	private String usrapepat;
	private String usrapemat;
	private String usrnom;
	private String usrlog;
	private String usrclv;
	private String usrenc;
	private Integer usrstsreg;
	private String usrufclv;
	private String usrfchmod;
	private Integer usrmod;
	private String usrhramod;
	private String usrmai;
	private String usrfchcrc;
	private Integer usrcrc;
	private String usrhracrc;
	private String usrfchlog;
	private Integer trbcod;
	private String usrwkscre;
	private String usrwksmod;
	private String usrclv3;
	private String usrclv2;
	private Integer usrvcrono;

	
	//usrlog -> useername
	private String clave;
	private Integer estado;
	
	 public static UsuariosSystem getUsuarioBean() {
		 UsuariosSystem nu = (UsuariosSystem)(SecurityContextHolder.getContext().getAuthentication().getPrincipal());
         if(nu != null) {
             return nu;
         }
         else return null;
	 }
	 
	 public static List<GrantedAuthority> uno(){
         List<GrantedAuthority> oo = new ArrayList<GrantedAuthority>(); 
         oo.add(new GrantedAuthorityImpl("IS_AUTHENTICATED_ANONYMOUSLY") );
         return oo;
	 }		 
	 
	 public UsuariosSystem(){
		super("default", "default", true, true, true, true , uno() );
	 }
	 
	public UsuariosSystem(String username, String password, boolean enabled, Collection<GrantedAuthority> authorities) {
		  super(username, password, enabled, true, true, true, authorities);
          this.estado = enabled==true ? 1 : 0;
          this.usrlog = username;
          this.clave = password;
          
	}
			
	public UsuariosSystem(String username, String password, boolean enabled,List<GrantedAuthority> authorities,
			Integer usrcod, String usrapepat, String usrapemat,
			String usrnom, String usrlog, String usrclv, String usrenc,
			Integer usrstsreg, String usrufclv, String usrfchmod,
			Integer usrmod, String usrhramod, String usrmai, String usrfchcrc,
			Integer usrcrc, String usrhracrc, String usrfchlog, Integer trbcod,
			String usrwkscre, String usrwksmod, String usrclv3, String usrclv2,
			Integer usrvcrono) {
		super(username, password, enabled, true, true, true, authorities);
		this.estado = enabled==true ? 1 : 0;
        this.usrlog = username;
        this.clave = password;
        
		this.usrcod = usrcod;
		this.usrapepat = usrapepat;
		this.usrapemat = usrapemat;
		this.usrnom = usrnom;
		this.usrlog = usrlog;
		this.usrclv = usrclv;
		this.usrenc = usrenc;
		this.usrstsreg = usrstsreg;
		this.usrufclv = usrufclv;
		this.usrfchmod = usrfchmod;
		this.usrmod = usrmod;
		this.usrhramod = usrhramod;
		this.usrmai = usrmai;
		this.usrfchcrc = usrfchcrc;
		this.usrcrc = usrcrc;
		this.usrhracrc = usrhracrc;
		this.usrfchlog = usrfchlog;
		this.trbcod = trbcod;
		this.usrwkscre = usrwkscre;
		this.usrwksmod = usrwksmod;
		this.usrclv3 = usrclv3;
		this.usrclv2 = usrclv2;
		this.usrvcrono = usrvcrono;
	}

	public Integer getUsrcod() {
		return usrcod;
	}

	public void setUsrcod(Integer usrcod) {
		this.usrcod = usrcod;
	}

	public String getUsrapepat() {
		return usrapepat;
	}

	public void setUsrapepat(String usrapepat) {
		this.usrapepat = usrapepat;
	}

	public String getUsrapemat() {
		return usrapemat;
	}

	public void setUsrapemat(String usrapemat) {
		this.usrapemat = usrapemat;
	}

	public String getUsrnom() {
		return usrnom;
	}

	public void setUsrnom(String usrnom) {
		this.usrnom = usrnom;
	}

	public String getUsrlog() {
		return usrlog;
	}

	public void setUsrlog(String usrlog) {
		this.usrlog = usrlog;
	}

	public String getUsrclv() {
		return usrclv;
	}

	public void setUsrclv(String usrclv) {
		this.usrclv = usrclv;
	}

	public String getUsrenc() {
		return usrenc;
	}

	public void setUsrenc(String usrenc) {
		this.usrenc = usrenc;
	}

	public Integer getUsrstsreg() {
		return usrstsreg;
	}

	public void setUsrstsreg(Integer usrstsreg) {
		this.usrstsreg = usrstsreg;
	}

	public String getUsrufclv() {
		return usrufclv;
	}

	public void setUsrufclv(String usrufclv) {
		this.usrufclv = usrufclv;
	}

	public String getUsrfchmod() {
		return usrfchmod;
	}

	public void setUsrfchmod(String usrfchmod) {
		this.usrfchmod = usrfchmod;
	}

	public Integer getUsrmod() {
		return usrmod;
	}

	public void setUsrmod(Integer usrmod) {
		this.usrmod = usrmod;
	}

	public String getUsrhramod() {
		return usrhramod;
	}

	public void setUsrhramod(String usrhramod) {
		this.usrhramod = usrhramod;
	}

	public String getUsrmai() {
		return usrmai;
	}

	public void setUsrmai(String usrmai) {
		this.usrmai = usrmai;
	}

	public String getUsrfchcrc() {
		return usrfchcrc;
	}

	public void setUsrfchcrc(String usrfchcrc) {
		this.usrfchcrc = usrfchcrc;
	}

	public Integer getUsrcrc() {
		return usrcrc;
	}

	public void setUsrcrc(Integer usrcrc) {
		this.usrcrc = usrcrc;
	}

	public String getUsrhracrc() {
		return usrhracrc;
	}

	public void setUsrhracrc(String usrhracrc) {
		this.usrhracrc = usrhracrc;
	}

	public String getUsrfchlog() {
		return usrfchlog;
	}

	public void setUsrfchlog(String usrfchlog) {
		this.usrfchlog = usrfchlog;
	}

	public Integer getTrbcod() {
		return trbcod;
	}

	public void setTrbcod(Integer trbcod) {
		this.trbcod = trbcod;
	}

	public String getUsrwkscre() {
		return usrwkscre;
	}

	public void setUsrwkscre(String usrwkscre) {
		this.usrwkscre = usrwkscre;
	}

	public String getUsrwksmod() {
		return usrwksmod;
	}

	public void setUsrwksmod(String usrwksmod) {
		this.usrwksmod = usrwksmod;
	}

	public String getUsrclv3() {
		return usrclv3;
	}

	public void setUsrclv3(String usrclv3) {
		this.usrclv3 = usrclv3;
	}

	public String getUsrclv2() {
		return usrclv2;
	}

	public void setUsrclv2(String usrclv2) {
		this.usrclv2 = usrclv2;
	}

	public Integer getUsrvcrono() {
		return usrvcrono;
	}

	public void setUsrvcrono(Integer usrvcrono) {
		this.usrvcrono = usrvcrono;
	}
	
	@Override
    public String toString() {
        return String.format("{codigo=%s,nombre=%s}", usrcod, usrnom + " " +
        		usrapepat + " " + usrapemat) ;
    }

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

}

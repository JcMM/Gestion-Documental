package pe.com.munmiraflores.gestiondocumental.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "NSBUSR01")
public class Usuarios implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UsuariosPk usuariosPk;
	
	@Column(name = "USRAPEPAT")
	private String usrapepat;
	
	@Column(name = "USRAPEMAT")
	private String usrapemat;
	
	@Column(name = "USRNOM")
	private String usrnom;
	
	@Column(name = "USRLOG")
	private String usrlog;
	
	@Column(name = "USRCLV")
	private String usrclv;
	
	@Column(name = "USRENC")
	private String usrenc;
	
	@Column(name = "USRSTSREG")
	private Integer usrstsreg;
	
	@Column(name = "USRUFCLV")
	private String usrufclv;
	
	@Column(name = "USRFCHMOD")
	private String usrfchmod;
	
	@Column(name = "USRMOD")
	private Integer usrmod;
	
	@Column(name = "USRHRAMOD")
	private String usrhramod;
	
	@Column(name = "USRMAI")
	private String usrmai;
	
	@Column(name = "USRFCHCRC")
	private String usrfchcrc;
	
	@Column(name = "USRCRC")
	private Integer usrcrc;
	
	@Column(name = "USRHRACRC")
	private String usrhracrc;
	
	@Column(name = "USRFCHLOG")
	private String usrfchlog;
	
	@Column(name = "USRWKSCRE")
	private String usrwkscre;
	
	@Column(name = "USRWKSMOD")
	private String usrwksmod;
	
	@Column(name = "USRCLV3")
	private String usrclv3;
	
	@Column(name = "USRCLV2")
	private String usrclv2;
	
	@Column(name = "USRVCRONO")
	private Integer usrvcrono;

	public Usuarios() {}

	public Usuarios(UsuariosPk usuariosPk, String usrapepat, String usrapemat,
			String usrnom, String usrlog, String usrclv, String usrenc,
			Integer usrstsreg, String usrufclv, String usrfchmod,
			Integer usrmod, String usrhramod, String usrmai, String usrfchcrc,
			Integer usrcrc, String usrhracrc, String usrfchlog,
			String usrwkscre, String usrwksmod, String usrclv3, String usrclv2,
			Integer usrvcrono) {
		this.usuariosPk = usuariosPk;
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
		this.usrwkscre = usrwkscre;
		this.usrwksmod = usrwksmod;
		this.usrclv3 = usrclv3;
		this.usrclv2 = usrclv2;
		this.usrvcrono = usrvcrono;
	}

	public UsuariosPk getUsuariosPk() {
		return usuariosPk;
	}

	public void setUsuariosPk(UsuariosPk usuariosPk) {
		this.usuariosPk = usuariosPk;
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

}

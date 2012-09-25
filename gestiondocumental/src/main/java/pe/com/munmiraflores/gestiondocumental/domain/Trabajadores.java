package pe.com.munmiraflores.gestiondocumental.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "RHDTRB01")
public class Trabajadores implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private TrabajadoresPk trabajadoresPk;
	
	@Column(name = "TRBFINIREL")
	private String trbfinirel;
	
	@Column(name = "TRBFFINREL")
	private String trbffinrel;
	
	@Column(name = "TRBSTSREG")
	private Integer trbstsreg;

	@Column(name = "TRBAPENOM")
	private String trbapenom;
	
	@Column(name = "TRBUSRCRE")
	private Integer trbusrcre;
	
	@Column(name = "TRBUSRMOD")
	private Integer trbusrmod;
	
	@Column(name = "TRBFCHCRE")
	private String trbfchcre;
	
	@Column(name = "TRBFCHMOD")
	private String trbfchmod;
	
	@Column(name = "TRBHRACRE")
	private String trbhracre;
	
	@Column(name = "TRBHRAMOD")
	private String trbhramod;
	
	@Column(name = "TRBWKSCRE")
	private String trbwkscre;
	
	@Column(name = "TRBWKSMOD")
	private String trbwksmod;

	public Trabajadores() {}

	public Trabajadores(TrabajadoresPk trabajadoresPk, String trbfinirel,
			String trbffinrel, Integer trbstsreg, String trbapenom,
			Integer trbusrcre, Integer trbusrmod, String trbfchcre,
			String trbfchmod, String trbhracre, String trbhramod,
			String trbwkscre, String trbwksmod) {
		this.trabajadoresPk = trabajadoresPk;
		this.trbfinirel = trbfinirel;
		this.trbffinrel = trbffinrel;
		this.trbstsreg = trbstsreg;
		this.trbapenom = trbapenom;
		this.trbusrcre = trbusrcre;
		this.trbusrmod = trbusrmod;
		this.trbfchcre = trbfchcre;
		this.trbfchmod = trbfchmod;
		this.trbhracre = trbhracre;
		this.trbhramod = trbhramod;
		this.trbwkscre = trbwkscre;
		this.trbwksmod = trbwksmod;
	}

	public TrabajadoresPk getTrabajadoresPk() {
		return trabajadoresPk;
	}

	public void setTrabajadoresPk(TrabajadoresPk trabajadoresPk) {
		this.trabajadoresPk = trabajadoresPk;
	}

	public String getTrbfinirel() {
		return trbfinirel;
	}

	public void setTrbfinirel(String trbfinirel) {
		this.trbfinirel = trbfinirel;
	}

	public String getTrbffinrel() {
		return trbffinrel;
	}

	public void setTrbffinrel(String trbffinrel) {
		this.trbffinrel = trbffinrel;
	}

	public Integer getTrbstsreg() {
		return trbstsreg;
	}

	public void setTrbstsreg(Integer trbstsreg) {
		this.trbstsreg = trbstsreg;
	}

	public String getTrbapenom() {
		return trbapenom;
	}

	public void setTrbapenom(String trbapenom) {
		this.trbapenom = trbapenom;
	}

	public Integer getTrbusrcre() {
		return trbusrcre;
	}

	public void setTrbusrcre(Integer trbusrcre) {
		this.trbusrcre = trbusrcre;
	}

	public Integer getTrbusrmod() {
		return trbusrmod;
	}

	public void setTrbusrmod(Integer trbusrmod) {
		this.trbusrmod = trbusrmod;
	}

	public String getTrbfchcre() {
		return trbfchcre;
	}

	public void setTrbfchcre(String trbfchcre) {
		this.trbfchcre = trbfchcre;
	}

	public String getTrbfchmod() {
		return trbfchmod;
	}

	public void setTrbfchmod(String trbfchmod) {
		this.trbfchmod = trbfchmod;
	}

	public String getTrbhracre() {
		return trbhracre;
	}

	public void setTrbhracre(String trbhracre) {
		this.trbhracre = trbhracre;
	}

	public String getTrbhramod() {
		return trbhramod;
	}

	public void setTrbhramod(String trbhramod) {
		this.trbhramod = trbhramod;
	}

	public String getTrbwkscre() {
		return trbwkscre;
	}

	public void setTrbwkscre(String trbwkscre) {
		this.trbwkscre = trbwkscre;
	}

	public String getTrbwksmod() {
		return trbwksmod;
	}

	public void setTrbwksmod(String trbwksmod) {
		this.trbwksmod = trbwksmod;
	}
	
}

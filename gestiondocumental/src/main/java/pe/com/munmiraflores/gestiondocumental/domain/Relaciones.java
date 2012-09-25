package pe.com.munmiraflores.gestiondocumental.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TDDRDO01")
public class Relaciones implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private RelacionesPk relacionesPk;
	
	@Column(name = "TRELCOD")
	private Integer trelcod;
	
	@Column(name = "RELDOCFINI")
	private String reldocfini;
	
	@Column(name = "RELDOCFFIN")
	private String reldocffin;
	
	@Column(name = "RELDOCOBS")
	private String reldocobs;
	
	@Column(name = "RELDOCUSRC")
	private Integer reldocusrc;
	
	@Column(name = "RELDOCFCHC")
	private String reldocfchc;
	
	@Column(name = "RELDOCHRAC")
	private String reldochrac;
	
	@Column(name = "RELDOCUSRM")
	private Integer reldocusrm;
	
	@Column(name = "RELDOCFCHM")
	private String reldocfchm;
	
	@Column(name = "RELDOCHRAM")
	private String reldochram;
	
	@Column(name = "RELDOCTPO")
	private String reldoctpo;
	
	@Column(name = "RELDOCPCSI")
	private Integer reldocpcsi;
	
	@Column(name = "RELDOCSTSR")
	private Integer reldocstsr;

	public Relaciones() {}

	public Relaciones(RelacionesPk relacionesPk, Integer trelcod,
			String reldocfini, String reldocffin, String reldocobs,
			Integer reldocusrc, String reldocfchc, String reldochrac,
			Integer reldocusrm, String reldocfchm, String reldochram,
			String reldoctpo, Integer reldocpcsi, Integer reldocstsr) {
		this.relacionesPk = relacionesPk;
		this.trelcod = trelcod;
		this.reldocfini = reldocfini;
		this.reldocffin = reldocffin;
		this.reldocobs = reldocobs;
		this.reldocusrc = reldocusrc;
		this.reldocfchc = reldocfchc;
		this.reldochrac = reldochrac;
		this.reldocusrm = reldocusrm;
		this.reldocfchm = reldocfchm;
		this.reldochram = reldochram;
		this.reldoctpo = reldoctpo;
		this.reldocpcsi = reldocpcsi;
		this.reldocstsr = reldocstsr;
	}

	public RelacionesPk getRelacionesPk() {
		return relacionesPk;
	}

	public void setRelacionesPk(RelacionesPk relacionesPk) {
		this.relacionesPk = relacionesPk;
	}

	public Integer getTrelcod() {
		return trelcod;
	}

	public void setTrelcod(Integer trelcod) {
		this.trelcod = trelcod;
	}

	public String getReldocfini() {
		return reldocfini;
	}

	public void setReldocfini(String reldocfini) {
		this.reldocfini = reldocfini;
	}

	public String getReldocffin() {
		return reldocffin;
	}

	public void setReldocffin(String reldocffin) {
		this.reldocffin = reldocffin;
	}

	public String getReldocobs() {
		return reldocobs;
	}

	public void setReldocobs(String reldocobs) {
		this.reldocobs = reldocobs;
	}

	public Integer getReldocusrc() {
		return reldocusrc;
	}

	public void setReldocusrc(Integer reldocusrc) {
		this.reldocusrc = reldocusrc;
	}

	public String getReldocfchc() {
		return reldocfchc;
	}

	public void setReldocfchc(String reldocfchc) {
		this.reldocfchc = reldocfchc;
	}

	public String getReldochrac() {
		return reldochrac;
	}

	public void setReldochrac(String reldochrac) {
		this.reldochrac = reldochrac;
	}

	public Integer getReldocusrm() {
		return reldocusrm;
	}

	public void setReldocusrm(Integer reldocusrm) {
		this.reldocusrm = reldocusrm;
	}

	public String getReldocfchm() {
		return reldocfchm;
	}

	public void setReldocfchm(String reldocfchm) {
		this.reldocfchm = reldocfchm;
	}

	public String getReldochram() {
		return reldochram;
	}

	public void setReldochram(String reldochram) {
		this.reldochram = reldochram;
	}

	public String getReldoctpo() {
		return reldoctpo;
	}

	public void setReldoctpo(String reldoctpo) {
		this.reldoctpo = reldoctpo;
	}

	public Integer getReldocpcsi() {
		return reldocpcsi;
	}

	public void setReldocpcsi(Integer reldocpcsi) {
		this.reldocpcsi = reldocpcsi;
	}

	public Integer getReldocstsr() {
		return reldocstsr;
	}

	public void setReldocstsr(Integer reldocstsr) {
		this.reldocstsr = reldocstsr;
	}

}

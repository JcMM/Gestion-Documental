package pe.com.munmiraflores.gestiondocumental.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "trabajadores")
public class Trabajadores {

	private Integer trbcod;
	private String trbtdi;
	private String trbcon;
	private String trbfinirel;
	private String trbffinrel;
	private Integer trbstsreg;
	private String trbapenom;
	private Integer trbusrcre;
	private Integer trbusrmod;
	private String trbfchcre;
	private String trbfchmod;
	private String trbhracre;
	private String trbhramod;
	private String trbwkscre;
	private String trbwksmod;

	public Trabajadores() {}

	public Trabajadores(Integer trbcod, String trbtdi, String trbcon,
			String trbfinirel, String trbffinrel, Integer trbstsreg,
			String trbapenom, Integer trbusrcre, Integer trbusrmod,
			String trbfchcre, String trbfchmod, String trbhracre,
			String trbhramod, String trbwkscre, String trbwksmod) {
		this.trbcod = trbcod;
		this.trbtdi = trbtdi;
		this.trbcon = trbcon;
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

	public Integer getTrbcod() {
		return trbcod;
	}

	public void setTrbcod(Integer trbcod) {
		this.trbcod = trbcod;
	}

	public String getTrbtdi() {
		return trbtdi;
	}

	public void setTrbtdi(String trbtdi) {
		this.trbtdi = trbtdi;
	}

	public String getTrbcon() {
		return trbcon;
	}

	public void setTrbcon(String trbcon) {
		this.trbcon = trbcon;
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

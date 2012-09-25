package pe.com.munmiraflores.gestiondocumental.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "cargo")
public class Cargo {
	
	private Integer carcod;
	private String cardsc;
	private Integer carstsreg;
	private Integer carblegcod;
	private String carfchini;
	private String carfchfin;
	private String carfchcre;
	private String carhracre;
	private Integer carusrcre;
	private String carfchmod;
	private String carhramod;
	private Integer carusrmod;
	private Integer careqvsam;
	private String carwkscre;
	private String carwksmod;

	public Integer getCarcod() {
		return carcod;
	}

	public void setCarcod(Integer carcod) {
		this.carcod = carcod;
	}

	public String getCardsc() {
		return cardsc;
	}

	public void setCardsc(String cardsc) {
		this.cardsc = cardsc;
	}

	public Integer getCarstsreg() {
		return carstsreg;
	}

	public void setCarstsreg(Integer carstsreg) {
		this.carstsreg = carstsreg;
	}

	public Integer getCarblegcod() {
		return carblegcod;
	}

	public void setCarblegcod(Integer carblegcod) {
		this.carblegcod = carblegcod;
	}

	public String getCarfchini() {
		return carfchini;
	}

	public void setCarfchini(String carfchini) {
		this.carfchini = carfchini;
	}

	public String getCarfchfin() {
		return carfchfin;
	}

	public void setCarfchfin(String carfchfin) {
		this.carfchfin = carfchfin;
	}

	public String getCarfchcre() {
		return carfchcre;
	}

	public void setCarfchcre(String carfchcre) {
		this.carfchcre = carfchcre;
	}

	public String getCarhracre() {
		return carhracre;
	}

	public void setCarhracre(String carhracre) {
		this.carhracre = carhracre;
	}

	public Integer getCarusrcre() {
		return carusrcre;
	}

	public void setCarusrcre(Integer carusrcre) {
		this.carusrcre = carusrcre;
	}

	public String getCarfchmod() {
		return carfchmod;
	}

	public void setCarfchmod(String carfchmod) {
		this.carfchmod = carfchmod;
	}

	public String getCarhramod() {
		return carhramod;
	}

	public void setCarhramod(String carhramod) {
		this.carhramod = carhramod;
	}

	public Integer getCarusrmod() {
		return carusrmod;
	}

	public void setCarusrmod(Integer carusrmod) {
		this.carusrmod = carusrmod;
	}

	public Integer getCareqvsam() {
		return careqvsam;
	}

	public void setCareqvsam(Integer careqvsam) {
		this.careqvsam = careqvsam;
	}

	public String getCarwkscre() {
		return carwkscre;
	}

	public void setCarwkscre(String carwkscre) {
		this.carwkscre = carwkscre;
	}

	public String getCarwksmod() {
		return carwksmod;
	}

	public void setCarwksmod(String carwksmod) {
		this.carwksmod = carwksmod;
	}

}

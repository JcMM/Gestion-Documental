package pe.com.munmiraflores.gestiondocumental.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RHBCAR01")
public class Cargo implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CARCOD")
	@GeneratedValue
	private Integer carcod;
	
	@Column(name = "CARDSC")
	private String cardsc;
	
	@Column(name = "CARSTSREG")
	private Integer carstsreg;
	
	@Column(name = "CARBLEGCOD")
	private Integer carblegcod;
	
	@Column(name = "CARFCHINI")
	private String carfchini;
	
	@Column(name = "CARFCHFIN")
	private String carfchfin;
	
	@Column(name = "CARFCHCRE")
	private String carfchcre;
	
	@Column(name = "CARHRACRE")
	private String carhracre;
	
	@Column(name = "CARUSRCRE")
	private Integer carusrcre;
	
	@Column(name = "CARFCHMOD")
	private String carfchmod;
	
	@Column(name = "CARHRAMOD")
	private String carhramod;
	
	@Column(name = "CARUSRMOD")
	private Integer carusrmod;
	
	@Column(name = "CAREQVSAM")
	private Integer careqvsam;
	
	@Column(name = "CARWKSCRE")
	private String carwkscre;
	
	@Column(name = "CARWKSMOD")
	private String carwksmod;

	public Cargo() {}
	
	public Cargo(Integer carcod, String cardsc, Integer carstsreg,
			Integer carblegcod, String carfchini, String carfchfin,
			String carfchcre, String carhracre, Integer carusrcre,
			String carfchmod, String carhramod, Integer carusrmod,
			Integer careqvsam, String carwkscre, String carwksmod) {
		this.carcod = carcod;
		this.cardsc = cardsc;
		this.carstsreg = carstsreg;
		this.carblegcod = carblegcod;
		this.carfchini = carfchini;
		this.carfchfin = carfchfin;
		this.carfchcre = carfchcre;
		this.carhracre = carhracre;
		this.carusrcre = carusrcre;
		this.carfchmod = carfchmod;
		this.carhramod = carhramod;
		this.carusrmod = carusrmod;
		this.careqvsam = careqvsam;
		this.carwkscre = carwkscre;
		this.carwksmod = carwksmod;
	}

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

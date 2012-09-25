package pe.com.munmiraflores.gestiondocumental.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TDBEST01")
public class Estados implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "STSCOD")
	@GeneratedValue
	private Integer stscod;
	
	@Column(name = "STSDSC")
	private String stsdsc;
	
	@Column(name = "STSDSCABV")
	private String stsdscabv;
	
	@Column(name = "STSSTSREG")
	private Integer stsstsreg;
	
	@Column(name = "STSGLB")
	private Integer stsglb;
	
	@Column(name = "STSHRACRE")
	private String stshracre;
	
	@Column(name = "STSFCHCRE")
	private String stsfchcre;
	
	@Column(name = "STSUSRCRE")
	private Integer stsusrcre;
	
	@Column(name = "STSHRAMOD")
	private String stshramod;
	
	@Column(name = "STSFCHMOD")
	private String stsfchmod;
	
	@Column(name = "STSUSRMOD")
	private Integer stsusrmod;
	
	@Column(name = "STSWKSCRE")
	private String stswkscre;
	
	@Column(name = "STSWKSMOD")
	private String stswksmod;

	public Estados() {}
	
	public Estados(Integer stscod, String stsdsc, String stsdscabv,
			Integer stsstsreg, Integer stsglb, String stshracre,
			String stsfchcre, Integer stsusrcre, String stshramod,
			String stsfchmod, Integer stsusrmod, String stswkscre,
			String stswksmod) {
		this.stscod = stscod;
		this.stsdsc = stsdsc;
		this.stsdscabv = stsdscabv;
		this.stsstsreg = stsstsreg;
		this.stsglb = stsglb;
		this.stshracre = stshracre;
		this.stsfchcre = stsfchcre;
		this.stsusrcre = stsusrcre;
		this.stshramod = stshramod;
		this.stsfchmod = stsfchmod;
		this.stsusrmod = stsusrmod;
		this.stswkscre = stswkscre;
		this.stswksmod = stswksmod;
	}

	public Integer getStscod() {
		return stscod;
	}

	public void setStscod(Integer stscod) {
		this.stscod = stscod;
	}

	public String getStsdsc() {
		return stsdsc;
	}

	public void setStsdsc(String stsdsc) {
		this.stsdsc = stsdsc;
	}

	public String getStsdscabv() {
		return stsdscabv;
	}

	public void setStsdscabv(String stsdscabv) {
		this.stsdscabv = stsdscabv;
	}

	public Integer getStsstsreg() {
		return stsstsreg;
	}

	public void setStsstsreg(Integer stsstsreg) {
		this.stsstsreg = stsstsreg;
	}

	public Integer getStsglb() {
		return stsglb;
	}

	public void setStsglb(Integer stsglb) {
		this.stsglb = stsglb;
	}

	public String getStshracre() {
		return stshracre;
	}

	public void setStshracre(String stshracre) {
		this.stshracre = stshracre;
	}

	public String getStsfchcre() {
		return stsfchcre;
	}

	public void setStsfchcre(String stsfchcre) {
		this.stsfchcre = stsfchcre;
	}

	public Integer getStsusrcre() {
		return stsusrcre;
	}

	public void setStsusrcre(Integer stsusrcre) {
		this.stsusrcre = stsusrcre;
	}

	public String getStshramod() {
		return stshramod;
	}

	public void setStshramod(String stshramod) {
		this.stshramod = stshramod;
	}

	public String getStsfchmod() {
		return stsfchmod;
	}

	public void setStsfchmod(String stsfchmod) {
		this.stsfchmod = stsfchmod;
	}

	public Integer getStsusrmod() {
		return stsusrmod;
	}

	public void setStsusrmod(Integer stsusrmod) {
		this.stsusrmod = stsusrmod;
	}

	public String getStswkscre() {
		return stswkscre;
	}

	public void setStswkscre(String stswkscre) {
		this.stswkscre = stswkscre;
	}

	public String getStswksmod() {
		return stswksmod;
	}

	public void setStswksmod(String stswksmod) {
		this.stswksmod = stswksmod;
	}

}

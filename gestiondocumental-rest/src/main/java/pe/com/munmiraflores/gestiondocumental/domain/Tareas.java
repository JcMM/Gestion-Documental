package pe.com.munmiraflores.gestiondocumental.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "tareas")
public class Tareas {
	
	private Integer tarcod;
	private String tardsc;
	private Integer tareqvcod;
	private Integer targlb;
	private Integer tarstsreg;
	private String tarhracre;
	private String tarfchcre;
	private Integer tarusrcre;
	private String tarhramod;
	private String tarfchmod;
	private Integer tarusrmod;
	private String tarwksmod;
	private String tarwkscre;

	public Tareas() {}

	public Tareas(Integer tarcod, String tardsc, Integer tareqvcod,
			Integer targlb, Integer tarstsreg, String tarhracre,
			String tarfchcre, Integer tarusrcre, String tarhramod,
			String tarfchmod, Integer tarusrmod, String tarwksmod,
			String tarwkscre) {
		this.tarcod = tarcod;
		this.tardsc = tardsc;
		this.tareqvcod = tareqvcod;
		this.targlb = targlb;
		this.tarstsreg = tarstsreg;
		this.tarhracre = tarhracre;
		this.tarfchcre = tarfchcre;
		this.tarusrcre = tarusrcre;
		this.tarhramod = tarhramod;
		this.tarfchmod = tarfchmod;
		this.tarusrmod = tarusrmod;
		this.tarwksmod = tarwksmod;
		this.tarwkscre = tarwkscre;
	}

	public Integer getTarcod() {
		return tarcod;
	}

	public void setTarcod(Integer tarcod) {
		this.tarcod = tarcod;
	}

	public String getTardsc() {
		return tardsc;
	}

	public void setTardsc(String tardsc) {
		this.tardsc = tardsc;
	}

	public Integer getTareqvcod() {
		return tareqvcod;
	}

	public void setTareqvcod(Integer tareqvcod) {
		this.tareqvcod = tareqvcod;
	}

	public Integer getTarglb() {
		return targlb;
	}

	public void setTarglb(Integer targlb) {
		this.targlb = targlb;
	}

	public Integer getTarstsreg() {
		return tarstsreg;
	}

	public void setTarstsreg(Integer tarstsreg) {
		this.tarstsreg = tarstsreg;
	}

	public String getTarhracre() {
		return tarhracre;
	}

	public void setTarhracre(String tarhracre) {
		this.tarhracre = tarhracre;
	}

	public String getTarfchcre() {
		return tarfchcre;
	}

	public void setTarfchcre(String tarfchcre) {
		this.tarfchcre = tarfchcre;
	}

	public Integer getTarusrcre() {
		return tarusrcre;
	}

	public void setTarusrcre(Integer tarusrcre) {
		this.tarusrcre = tarusrcre;
	}

	public String getTarhramod() {
		return tarhramod;
	}

	public void setTarhramod(String tarhramod) {
		this.tarhramod = tarhramod;
	}

	public String getTarfchmod() {
		return tarfchmod;
	}

	public void setTarfchmod(String tarfchmod) {
		this.tarfchmod = tarfchmod;
	}

	public Integer getTarusrmod() {
		return tarusrmod;
	}

	public void setTarusrmod(Integer tarusrmod) {
		this.tarusrmod = tarusrmod;
	}

	public String getTarwksmod() {
		return tarwksmod;
	}

	public void setTarwksmod(String tarwksmod) {
		this.tarwksmod = tarwksmod;
	}

	public String getTarwkscre() {
		return tarwkscre;
	}

	public void setTarwkscre(String tarwkscre) {
		this.tarwkscre = tarwkscre;
	}
	
}

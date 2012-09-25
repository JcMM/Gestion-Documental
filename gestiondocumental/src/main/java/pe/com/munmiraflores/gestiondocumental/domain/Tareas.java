package pe.com.munmiraflores.gestiondocumental.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TDBTAR01")
public class Tareas implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "TARCOD")
	@GeneratedValue
	private Integer tarcod;
	
	@Column(name = "TARDSC")
	private String tardsc;
	
	@Column(name = "TAREQVCOD")
	private Integer tareqvcod;
	
	@Column(name = "TARGLB")
	private Integer targlb;
	
	@Column(name = "TARSTSREG")
	private Integer tarstsreg;
	
	@Column(name = "TARHRACRE")
	private String tarhracre;

	@Column(name = "TARFCHCRE")
	private String tarfchcre;
	
	@Column(name = "TARUSRCRE")
	private Integer tarusrcre;
	
	@Column(name = "TARHRAMOD")
	private String tarhramod;
	
	@Column(name = "TARFCHMOD")
	private String tarfchmod;
	
	@Column(name = "TARUSRMOD")
	private Integer tarusrmod;
	
	@Column(name = "TARWKSMOD")
	private String tarwksmod;
	
	@Column(name = "TARWKSCRE")
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

package pe.com.munmiraflores.gestiondocumental.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "IGRNTF03")
public class Personas implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue
	private Integer id;
	
	@Column(name = "CON")
	private String con;
	
	@Column(name = "TDI")
	private String tdi;
	
	@Column(name = "NOMB")
	private String nomb;
	
	@Column(name = "DNI")
	private String dni;
	
	@Column(name = "RUC")
	private String ruc;

	public Personas() {}
	
	public Personas(Integer id, String con, String tdi, String nomb,
			String dni, String ruc) {
		this.id = id;
		this.con = con;
		this.tdi = tdi;
		this.nomb = nomb;
		this.dni = dni;
		this.ruc = ruc;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCon() {
		return con;
	}

	public void setCon(String con) {
		this.con = con;
	}

	public String getTdi() {
		return tdi;
	}

	public void setTdi(String tdi) {
		this.tdi = tdi;
	}

	public String getNomb() {
		return nomb;
	}

	public void setNomb(String nomb) {
		this.nomb = nomb;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

}

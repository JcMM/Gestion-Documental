package pe.com.munmiraflores.gestiondocumental.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "personas")
public class Personas {
	
	private Integer id;
	private String con;
	private String tdi;
	private String nomb;
	private String dni;
	private String ruc;

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

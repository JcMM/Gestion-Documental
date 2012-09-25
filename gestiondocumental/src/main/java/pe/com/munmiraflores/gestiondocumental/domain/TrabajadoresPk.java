package pe.com.munmiraflores.gestiondocumental.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TrabajadoresPk implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "TRBCOD")
	private Integer trbcod;
	
	@Column(name = "TRBTDI")
	private String trbtdi;
	
	@Column(name = "TRBCON")
	private String trbcon;

	public TrabajadoresPk() {}

	public TrabajadoresPk(Integer trbcod, String trbtdi, String trbcon) {
		this.trbcod = trbcod;
		this.trbtdi = trbtdi;
		this.trbcon = trbcon;
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
	
}

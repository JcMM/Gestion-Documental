package pe.com.munmiraflores.gestiondocumental.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class RecibosPk implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "DOCCOD")
	private Integer doccod;
	
	@Column(name = "DOCRECITM")
	private Integer docrecitm;

	public RecibosPk() {}
	
	public RecibosPk(Integer doccod, Integer docrecitm) {
		this.doccod = doccod;
		this.docrecitm = docrecitm;
	}

	public Integer getDoccod() {
		return doccod;
	}

	public void setDoccod(Integer doccod) {
		this.doccod = doccod;
	}

	public Integer getDocrecitm() {
		return docrecitm;
	}

	public void setDocrecitm(Integer docrecitm) {
		this.docrecitm = docrecitm;
	}

}

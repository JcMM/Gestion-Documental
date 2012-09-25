package pe.com.munmiraflores.gestiondocumental.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SeguimientoPk implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column(name = "DOCCOD")
	private Integer doccod;
	
	@Column(name = "SEGCOD")
	private Integer segcod;
	
	@Column(name = "SEGSTSCOD")
	private Integer segstscod;

	public SeguimientoPk() {}

	public SeguimientoPk(Integer doccod, Integer segcod, Integer segstscod) {
		this.doccod = doccod;
		this.segcod = segcod;
		this.segstscod = segstscod;
	}

	public Integer getDoccod() {
		return doccod;
	}

	public void setDoccod(Integer doccod) {
		this.doccod = doccod;
	}

	public Integer getSegcod() {
		return segcod;
	}

	public void setSegcod(Integer segcod) {
		this.segcod = segcod;
	}

	public Integer getSegstscod() {
		return segstscod;
	}

	public void setSegstscod(Integer segstscod) {
		this.segstscod = segstscod;
	}

}

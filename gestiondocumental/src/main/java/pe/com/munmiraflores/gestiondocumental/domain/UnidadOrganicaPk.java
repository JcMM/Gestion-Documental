package pe.com.munmiraflores.gestiondocumental.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UnidadOrganicaPk implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column(name = "UNIORGCOD")
	private Integer uniorgcod;
	
	@Column(name = "UNIORGCARC")
	private Integer uniorgcarc;
	
	@Column(name = "UORGNUBICO")
	private Integer uorgnubico;

	public UnidadOrganicaPk() {}

	public UnidadOrganicaPk(Integer uniorgcod, Integer uniorgcarc,
			Integer uorgnubico) {
		this.uniorgcod = uniorgcod;
		this.uniorgcarc = uniorgcarc;
		this.uorgnubico = uorgnubico;
	}

	public Integer getUniorgcod() {
		return uniorgcod;
	}

	public void setUniorgcod(Integer uniorgcod) {
		this.uniorgcod = uniorgcod;
	}

	public Integer getUniorgcarc() {
		return uniorgcarc;
	}

	public void setUniorgcarc(Integer uniorgcarc) {
		this.uniorgcarc = uniorgcarc;
	}

	public Integer getUorgnubico() {
		return uorgnubico;
	}

	public void setUorgnubico(Integer uorgnubico) {
		this.uorgnubico = uorgnubico;
	}

}

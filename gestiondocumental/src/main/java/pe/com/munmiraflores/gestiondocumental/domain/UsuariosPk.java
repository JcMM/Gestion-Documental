package pe.com.munmiraflores.gestiondocumental.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UsuariosPk implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column(name = "USRCOD")
	private Integer usrcod;
	
	@Column(name = "TRBCOD")
	private Integer trbcod;

	public UsuariosPk() {}

	public UsuariosPk(Integer usrcod, Integer trbcod) {
		this.usrcod = usrcod;
		this.trbcod = trbcod;
	}

	public Integer getUsrcod() {
		return usrcod;
	}

	public void setUsrcod(Integer usrcod) {
		this.usrcod = usrcod;
	}

	public Integer getTrbcod() {
		return trbcod;
	}

	public void setTrbcod(Integer trbcod) {
		this.trbcod = trbcod;
	}

}

package pe.com.munmiraflores.gestiondocumental.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class RelacionesPk implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column(name = "RELDOCCOD")
	private Integer reldoccod;
	
	@Column(name = "RELDOCPDEC")
	private Integer reldocpdec;
	
	@Column(name = "RELDOCHJOC")
	private Integer reldochjoc;

	public RelacionesPk() {}

	public RelacionesPk(Integer reldoccod, Integer reldocpdec, Integer reldochjoc) {
		super();
		this.reldoccod = reldoccod;
		this.reldocpdec = reldocpdec;
		this.reldochjoc = reldochjoc;
	}

	public Integer getReldoccod() {
		return reldoccod;
	}

	public void setReldoccod(Integer reldoccod) {
		this.reldoccod = reldoccod;
	}

	public Integer getReldocpdec() {
		return reldocpdec;
	}

	public void setReldocpdec(Integer reldocpdec) {
		this.reldocpdec = reldocpdec;
	}

	public Integer getReldochjoc() {
		return reldochjoc;
	}

	public void setReldochjoc(Integer reldochjoc) {
		this.reldochjoc = reldochjoc;
	}

}

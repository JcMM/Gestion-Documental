package pe.com.munmiraflores.gestiondocumental.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DocumentosPk implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column(name = "DOCCOD")
	private Integer doccod;
	
	@Column(name = "DOCUODESCO")
	private Integer docuodesco;
	
	@Column(name = "DOCCARDESC")
	private Integer doccardesc;
	
	@Column(name = "DOCUOORICO")
	private Integer docuoorico;
	
	@Column(name = "DOCCARORIC")
	private Integer doccaroric;
	
	@Column(name = "DOCCARACTC")
	private Integer doccaractc;
	
	@Column(name = "DOCUOACTCO")
	private Integer docuoactco;
	
	@Column(name = "DOCSTSCOD")
	private Integer docstscod;

	public DocumentosPk() {}

	public DocumentosPk(Integer doccod, Integer docuodesco, Integer doccardesc,
			Integer docuoorico, Integer doccaroric, Integer doccaractc,
			Integer docuoactco, Integer docstscod) {
		this.doccod = doccod;
		this.docuodesco = docuodesco;
		this.doccardesc = doccardesc;
		this.docuoorico = docuoorico;
		this.doccaroric = doccaroric;
		this.doccaractc = doccaractc;
		this.docuoactco = docuoactco;
		this.docstscod = docstscod;
	}

	public Integer getDoccod() {
		return doccod;
	}

	public void setDoccod(Integer doccod) {
		this.doccod = doccod;
	}

	public Integer getDocuodesco() {
		return docuodesco;
	}

	public void setDocuodesco(Integer docuodesco) {
		this.docuodesco = docuodesco;
	}

	public Integer getDoccardesc() {
		return doccardesc;
	}

	public void setDoccardesc(Integer doccardesc) {
		this.doccardesc = doccardesc;
	}

	public Integer getDocuoorico() {
		return docuoorico;
	}

	public void setDocuoorico(Integer docuoorico) {
		this.docuoorico = docuoorico;
	}

	public Integer getDoccaroric() {
		return doccaroric;
	}

	public void setDoccaroric(Integer doccaroric) {
		this.doccaroric = doccaroric;
	}

	public Integer getDoccaractc() {
		return doccaractc;
	}

	public void setDoccaractc(Integer doccaractc) {
		this.doccaractc = doccaractc;
	}

	public Integer getDocuoactco() {
		return docuoactco;
	}

	public void setDocuoactco(Integer docuoactco) {
		this.docuoactco = docuoactco;
	}

	public Integer getDocstscod() {
		return docstscod;
	}

	public void setDocstscod(Integer docstscod) {
		this.docstscod = docstscod;
	}
	
}

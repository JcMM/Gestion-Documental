package pe.com.munmiraflores.gestiondocumental.domain;

public class DetRecibo {

	private Integer doccod;
	private String concepto;
	private Double importe;
	
	public Integer getDoccod() {
		return doccod;
	}
	public void setDoccod(Integer doccod) {
		this.doccod = doccod;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public Double getImporte() {
		return importe;
	}
	public void setImporte(Double importe) {
		this.importe = importe;
	}
	
}

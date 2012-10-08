package pe.com.munmiraflores.gestiondocumental.domain;

public class Anexo {

	private String nroDocumento;
	private String fecInicio;
	private String fecFin;
	private String origen;
	private String asunto;
	private String observacion;
	private String ubicacionFolio;
	
	public String getNroDocumento() {
		return nroDocumento;
	}
	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	public String getFecInicio() {
		return fecInicio;
	}
	public void setFecInicio(String fecInicio) {
		this.fecInicio = fecInicio;
	}
	public String getFecFin() {
		return fecFin;
	}
	public void setFecFin(String fecFin) {
		this.fecFin = fecFin;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getAsunto() {
		return asunto;
	}
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getUbicacionFolio() {
		return ubicacionFolio;
	}
	public void setUbicacionFolio(String ubicacionFolio) {
		this.ubicacionFolio = ubicacionFolio;
	}
	
	@Override
	public String toString(){
		return "nroDocumento="+nroDocumento;
	}
}

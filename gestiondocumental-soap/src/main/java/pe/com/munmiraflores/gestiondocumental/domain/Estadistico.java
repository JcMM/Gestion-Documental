package pe.com.munmiraflores.gestiondocumental.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "estadistico")
public class Estadistico {

	private String estado;
	private String tipo;
	private Integer cantidad;
	private String unidad;
	private Integer docuoactco;
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public String getUnidad() {
		return unidad;
	}
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	public Integer getDocuoactco() {
		return docuoactco;
	}
	public void setDocuoactco(Integer docuoactco) {
		this.docuoactco = docuoactco;
	}
	
}

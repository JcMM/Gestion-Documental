package pe.com.munmiraflores.gestiondocumental.dto;

import java.util.List;

import pe.com.munmiraflores.gestiondocumental.domain.Documentos;

/**
 * Data Transfer Object for displaying purposes
 * 
 * @author Cris
 */
public class EstadosDTO {

	private Integer stscod;
	private String stsdsc;
	private String stsdscabv;
	private Integer stsstsreg;
	private Integer stsglb;
	private String stshracre;
	private String stsfchcre;
	private Integer stsusrcre;
	private String stshramod;
	private String stsfchmod;
	private Integer stsusrmod;
	private String stswkscre;
	private String stswksmod;
	private List<Documentos> documentos;
	
	public Integer getStscod() {
		return stscod;
	}
	public void setStscod(Integer stscod) {
		this.stscod = stscod;
	}
	public String getStsdsc() {
		return stsdsc;
	}
	public void setStsdsc(String stsdsc) {
		this.stsdsc = stsdsc;
	}
	public String getStsdscabv() {
		return stsdscabv;
	}
	public void setStsdscabv(String stsdscabv) {
		this.stsdscabv = stsdscabv;
	}
	public Integer getStsstsreg() {
		return stsstsreg;
	}
	public void setStsstsreg(Integer stsstsreg) {
		this.stsstsreg = stsstsreg;
	}
	public Integer getStsglb() {
		return stsglb;
	}
	public void setStsglb(Integer stsglb) {
		this.stsglb = stsglb;
	}
	public String getStshracre() {
		return stshracre;
	}
	public void setStshracre(String stshracre) {
		this.stshracre = stshracre;
	}
	public String getStsfchcre() {
		return stsfchcre;
	}
	public void setStsfchcre(String stsfchcre) {
		this.stsfchcre = stsfchcre;
	}
	public Integer getStsusrcre() {
		return stsusrcre;
	}
	public void setStsusrcre(Integer stsusrcre) {
		this.stsusrcre = stsusrcre;
	}
	public String getStshramod() {
		return stshramod;
	}
	public void setStshramod(String stshramod) {
		this.stshramod = stshramod;
	}
	public String getStsfchmod() {
		return stsfchmod;
	}
	public void setStsfchmod(String stsfchmod) {
		this.stsfchmod = stsfchmod;
	}
	public Integer getStsusrmod() {
		return stsusrmod;
	}
	public void setStsusrmod(Integer stsusrmod) {
		this.stsusrmod = stsusrmod;
	}
	public String getStswkscre() {
		return stswkscre;
	}
	public void setStswkscre(String stswkscre) {
		this.stswkscre = stswkscre;
	}
	public String getStswksmod() {
		return stswksmod;
	}
	public void setStswksmod(String stswksmod) {
		this.stswksmod = stswksmod;
	}
	public List<Documentos> getDocumentos() {
		return documentos;
	}
	public void setDocumentos(List<Documentos> documentos) {
		this.documentos = documentos;
	}
	
}

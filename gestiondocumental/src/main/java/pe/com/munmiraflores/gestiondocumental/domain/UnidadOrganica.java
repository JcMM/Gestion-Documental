package pe.com.munmiraflores.gestiondocumental.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "RHDUOR01")
public class UnidadOrganica implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private UnidadOrganicaPk unidadOrganicaPk;
	
	@Column(name = "UNIORGNOM")
	private String uniorgnom;
	
	@Column(name = "UNIORGSIG")
	private String uniorgsig;
	
	@Column(name = "UNIORGFCHI")
	private String uniorgfchi;
	
	@Column(name = "UNIORGFCHF")
	private String uniorgfchf;
	
	@Column(name = "TUNIORGCOD")
	private Integer tuniorgcod;
	
	@Column(name = "UOBLEGCOD")
	private Integer uoblegcod;
	
	@Column(name = "UNIORGHRAC")
	private String uniorghrac;
	
	@Column(name = "UNIORGFCHC")
	private String uniorgfchc;
	
	@Column(name = "UNIORGUSRC")
	private Integer uniorgusrc;
	
	@Column(name = "UNIORGHRAM")
	private String uniorghram;
	
	@Column(name = "UNIORGFCHM")
	private String uniorgfchm;
	
	@Column(name = "UNIORGUSRM")
	private Integer uniorgusrm;
	
	@Column(name = "UNIORGTEL")
	private String uniorgtel;
	
	@Column(name = "UNIORGFAX")
	private String uniorgfax;
	
	@Column(name = "UNIORGANX")
	private String uniorganx;
	
	@Column(name = "UNIORGEQV")
	private Integer uniorgeqv;
	
	@Column(name = "UNIORGSAM")
	private Integer uniorgsam;
	
	@Column(name = "UNIORGACT")
	private Integer uniorgact;
	
	@Column(name = "UNIORGACT1")
	private Integer uniorgact1;
	
	@Column(name = "UNIORGWKSC")
	private String uniorgwksc;
	
	@Column(name = "UNIORGWKSM")
	private String uniorgwksm;
	
	@Column(name = "UORGTPOJER")
	private Integer uorgtpojer;
	
	@Column(name = "UORGVCRONO")
	private Integer uorgvcrono;
	
	@Column(name = "UORGCEXTCR")
	private Integer uorgcextcr;
	
	@Column(name = "UNIORGVALD")
	private Integer uniorgvald;

	public UnidadOrganica() {}

	public UnidadOrganica(UnidadOrganicaPk unidadOrganicaPk, String uniorgnom,
			String uniorgsig, String uniorgfchi, String uniorgfchf,
			Integer tuniorgcod, Integer uoblegcod, String uniorghrac,
			String uniorgfchc, Integer uniorgusrc, String uniorghram,
			String uniorgfchm, Integer uniorgusrm, String uniorgtel,
			String uniorgfax, String uniorganx, Integer uniorgeqv,
			Integer uniorgsam, Integer uniorgact, Integer uniorgact1,
			String uniorgwksc, String uniorgwksm, Integer uorgtpojer,
			Integer uorgvcrono, Integer uorgcextcr, Integer uniorgvald) {
		this.unidadOrganicaPk = unidadOrganicaPk;
		this.uniorgnom = uniorgnom;
		this.uniorgsig = uniorgsig;
		this.uniorgfchi = uniorgfchi;
		this.uniorgfchf = uniorgfchf;
		this.tuniorgcod = tuniorgcod;
		this.uoblegcod = uoblegcod;
		this.uniorghrac = uniorghrac;
		this.uniorgfchc = uniorgfchc;
		this.uniorgusrc = uniorgusrc;
		this.uniorghram = uniorghram;
		this.uniorgfchm = uniorgfchm;
		this.uniorgusrm = uniorgusrm;
		this.uniorgtel = uniorgtel;
		this.uniorgfax = uniorgfax;
		this.uniorganx = uniorganx;
		this.uniorgeqv = uniorgeqv;
		this.uniorgsam = uniorgsam;
		this.uniorgact = uniorgact;
		this.uniorgact1 = uniorgact1;
		this.uniorgwksc = uniorgwksc;
		this.uniorgwksm = uniorgwksm;
		this.uorgtpojer = uorgtpojer;
		this.uorgvcrono = uorgvcrono;
		this.uorgcextcr = uorgcextcr;
		this.uniorgvald = uniorgvald;
	}

	public UnidadOrganicaPk getUnidadOrganicaPk() {
		return unidadOrganicaPk;
	}

	public void setUnidadOrganicaPk(UnidadOrganicaPk unidadOrganicaPk) {
		this.unidadOrganicaPk = unidadOrganicaPk;
	}

	public String getUniorgnom() {
		return uniorgnom;
	}

	public void setUniorgnom(String uniorgnom) {
		this.uniorgnom = uniorgnom;
	}

	public String getUniorgsig() {
		return uniorgsig;
	}

	public void setUniorgsig(String uniorgsig) {
		this.uniorgsig = uniorgsig;
	}

	public String getUniorgfchi() {
		return uniorgfchi;
	}

	public void setUniorgfchi(String uniorgfchi) {
		this.uniorgfchi = uniorgfchi;
	}

	public String getUniorgfchf() {
		return uniorgfchf;
	}

	public void setUniorgfchf(String uniorgfchf) {
		this.uniorgfchf = uniorgfchf;
	}

	public Integer getTuniorgcod() {
		return tuniorgcod;
	}

	public void setTuniorgcod(Integer tuniorgcod) {
		this.tuniorgcod = tuniorgcod;
	}

	public Integer getUoblegcod() {
		return uoblegcod;
	}

	public void setUoblegcod(Integer uoblegcod) {
		this.uoblegcod = uoblegcod;
	}

	public String getUniorghrac() {
		return uniorghrac;
	}

	public void setUniorghrac(String uniorghrac) {
		this.uniorghrac = uniorghrac;
	}

	public String getUniorgfchc() {
		return uniorgfchc;
	}

	public void setUniorgfchc(String uniorgfchc) {
		this.uniorgfchc = uniorgfchc;
	}

	public Integer getUniorgusrc() {
		return uniorgusrc;
	}

	public void setUniorgusrc(Integer uniorgusrc) {
		this.uniorgusrc = uniorgusrc;
	}

	public String getUniorghram() {
		return uniorghram;
	}

	public void setUniorghram(String uniorghram) {
		this.uniorghram = uniorghram;
	}

	public String getUniorgfchm() {
		return uniorgfchm;
	}

	public void setUniorgfchm(String uniorgfchm) {
		this.uniorgfchm = uniorgfchm;
	}

	public Integer getUniorgusrm() {
		return uniorgusrm;
	}

	public void setUniorgusrm(Integer uniorgusrm) {
		this.uniorgusrm = uniorgusrm;
	}

	public String getUniorgtel() {
		return uniorgtel;
	}

	public void setUniorgtel(String uniorgtel) {
		this.uniorgtel = uniorgtel;
	}

	public String getUniorgfax() {
		return uniorgfax;
	}

	public void setUniorgfax(String uniorgfax) {
		this.uniorgfax = uniorgfax;
	}

	public String getUniorganx() {
		return uniorganx;
	}

	public void setUniorganx(String uniorganx) {
		this.uniorganx = uniorganx;
	}

	public Integer getUniorgeqv() {
		return uniorgeqv;
	}

	public void setUniorgeqv(Integer uniorgeqv) {
		this.uniorgeqv = uniorgeqv;
	}

	public Integer getUniorgsam() {
		return uniorgsam;
	}

	public void setUniorgsam(Integer uniorgsam) {
		this.uniorgsam = uniorgsam;
	}

	public Integer getUniorgact() {
		return uniorgact;
	}

	public void setUniorgact(Integer uniorgact) {
		this.uniorgact = uniorgact;
	}

	public Integer getUniorgact1() {
		return uniorgact1;
	}

	public void setUniorgact1(Integer uniorgact1) {
		this.uniorgact1 = uniorgact1;
	}

	public String getUniorgwksc() {
		return uniorgwksc;
	}

	public void setUniorgwksc(String uniorgwksc) {
		this.uniorgwksc = uniorgwksc;
	}

	public String getUniorgwksm() {
		return uniorgwksm;
	}

	public void setUniorgwksm(String uniorgwksm) {
		this.uniorgwksm = uniorgwksm;
	}

	public Integer getUorgtpojer() {
		return uorgtpojer;
	}

	public void setUorgtpojer(Integer uorgtpojer) {
		this.uorgtpojer = uorgtpojer;
	}

	public Integer getUorgvcrono() {
		return uorgvcrono;
	}

	public void setUorgvcrono(Integer uorgvcrono) {
		this.uorgvcrono = uorgvcrono;
	}

	public Integer getUorgcextcr() {
		return uorgcextcr;
	}

	public void setUorgcextcr(Integer uorgcextcr) {
		this.uorgcextcr = uorgcextcr;
	}

	public Integer getUniorgvald() {
		return uniorgvald;
	}

	public void setUniorgvald(Integer uniorgvald) {
		this.uniorgvald = uniorgvald;
	}

}

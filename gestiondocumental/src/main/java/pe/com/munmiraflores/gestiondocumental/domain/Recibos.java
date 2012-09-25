package pe.com.munmiraflores.gestiondocumental.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TDDDOC06")
public class Recibos implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private RecibosPk recibosPk;
	
	@Column(name = "DOCRECEMI")
	private String docrecemi;
	
	@Column(name = "DOCRECTPO")
	private Integer docrectpo;
	
	@Column(name = "DOCRECSER")
	private Integer docrecser;
	
	@Column(name = "DOCRECNRO")
	private Integer docrecnro;
	
	@Column(name = "DOCRECMNT")
	private Double docrecmnt;
	
	@Column(name = "DOCRECFPAG")
	private String docrecfpag;
	
	@Column(name = "DOCRECTRN")
	private Integer docrectrn;
	
	@Column(name = "DOCRECWKSC")
	private String docrecwksc;
	
	@Column(name = "DOCRECWKSM")
	private String docrecwksm;
	
	@Column(name = "CCTEPRIA")
	private Integer cctepria;
	
	@Column(name = "CCTETRI")
	private Integer cctetri;
	
	@Column(name = "CCTEREC")
	private Integer ccterec;
	
	@Column(name = "DOCRECPCDI")
	private Integer docrecpcdi;
	
	@Column(name = "DOCRECUO")
	private Integer docrecuo;
	
	@Column(name = "DOCRECCAR")
	private Integer docreccar;
	
	@Column(name = "DOCRECUSR")
	private Integer docrecusr;
	
	@Column(name = "DOCRECFECC")
	private String docrecfecc;
	
	@Column(name = "DOCRECFACT")
	private Integer docrecfact;

	public Recibos() {}
	
	public Recibos(RecibosPk recibosPk, String docrecemi, Integer docrectpo,
			Integer docrecser, Integer docrecnro, Double docrecmnt,
			String docrecfpag, Integer docrectrn, String docrecwksc,
			String docrecwksm, Integer cctepria, Integer cctetri,
			Integer ccterec, Integer docrecpcdi, Integer docrecuo,
			Integer docreccar, Integer docrecusr, String docrecfecc,
			Integer docrecfact) {
		this.recibosPk = recibosPk;
		this.docrecemi = docrecemi;
		this.docrectpo = docrectpo;
		this.docrecser = docrecser;
		this.docrecnro = docrecnro;
		this.docrecmnt = docrecmnt;
		this.docrecfpag = docrecfpag;
		this.docrectrn = docrectrn;
		this.docrecwksc = docrecwksc;
		this.docrecwksm = docrecwksm;
		this.cctepria = cctepria;
		this.cctetri = cctetri;
		this.ccterec = ccterec;
		this.docrecpcdi = docrecpcdi;
		this.docrecuo = docrecuo;
		this.docreccar = docreccar;
		this.docrecusr = docrecusr;
		this.docrecfecc = docrecfecc;
		this.docrecfact = docrecfact;
	}

	public RecibosPk getRecibosPk() {
		return recibosPk;
	}

	public void setRecibosPk(RecibosPk recibosPk) {
		this.recibosPk = recibosPk;
	}

	public String getDocrecemi() {
		return docrecemi;
	}

	public void setDocrecemi(String docrecemi) {
		this.docrecemi = docrecemi;
	}

	public Integer getDocrectpo() {
		return docrectpo;
	}

	public void setDocrectpo(Integer docrectpo) {
		this.docrectpo = docrectpo;
	}

	public Integer getDocrecser() {
		return docrecser;
	}

	public void setDocrecser(Integer docrecser) {
		this.docrecser = docrecser;
	}

	public Integer getDocrecnro() {
		return docrecnro;
	}

	public void setDocrecnro(Integer docrecnro) {
		this.docrecnro = docrecnro;
	}

	public Double getDocrecmnt() {
		return docrecmnt;
	}

	public void setDocrecmnt(Double docrecmnt) {
		this.docrecmnt = docrecmnt;
	}

	public String getDocrecfpag() {
		return docrecfpag;
	}

	public void setDocrecfpag(String docrecfpag) {
		this.docrecfpag = docrecfpag;
	}

	public Integer getDocrectrn() {
		return docrectrn;
	}

	public void setDocrectrn(Integer docrectrn) {
		this.docrectrn = docrectrn;
	}

	public String getDocrecwksc() {
		return docrecwksc;
	}

	public void setDocrecwksc(String docrecwksc) {
		this.docrecwksc = docrecwksc;
	}

	public String getDocrecwksm() {
		return docrecwksm;
	}

	public void setDocrecwksm(String docrecwksm) {
		this.docrecwksm = docrecwksm;
	}

	public Integer getCctepria() {
		return cctepria;
	}

	public void setCctepria(Integer cctepria) {
		this.cctepria = cctepria;
	}

	public Integer getCctetri() {
		return cctetri;
	}

	public void setCctetri(Integer cctetri) {
		this.cctetri = cctetri;
	}

	public Integer getCcterec() {
		return ccterec;
	}

	public void setCcterec(Integer ccterec) {
		this.ccterec = ccterec;
	}

	public Integer getDocrecpcdi() {
		return docrecpcdi;
	}

	public void setDocrecpcdi(Integer docrecpcdi) {
		this.docrecpcdi = docrecpcdi;
	}

	public Integer getDocrecuo() {
		return docrecuo;
	}

	public void setDocrecuo(Integer docrecuo) {
		this.docrecuo = docrecuo;
	}

	public Integer getDocreccar() {
		return docreccar;
	}

	public void setDocreccar(Integer docreccar) {
		this.docreccar = docreccar;
	}

	public Integer getDocrecusr() {
		return docrecusr;
	}

	public void setDocrecusr(Integer docrecusr) {
		this.docrecusr = docrecusr;
	}

	public String getDocrecfecc() {
		return docrecfecc;
	}

	public void setDocrecfecc(String docrecfecc) {
		this.docrecfecc = docrecfecc;
	}

	public Integer getDocrecfact() {
		return docrecfact;
	}

	public void setDocrecfact(Integer docrecfact) {
		this.docrecfact = docrecfact;
	}

}

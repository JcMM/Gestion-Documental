package pe.com.munmiraflores.gestiondocumental.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "seguimiento")
public class Seguimiento implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer doccod;
	private Integer segcod;
	private String segglo;
	private Integer pcdid;
	private Integer tarcod;
	private String segprfcod;
	private Integer segusrcod;
	private Integer seguoorico;
	private Integer segcaroric;
	private Integer segemporic;
	private Integer segemporii;
	private Integer seguodesco;
	private Integer segcardesc;
	private Integer segempdesc;
	private Integer segempdesi;
	private String segfch;
	private String seghra;
	private Integer segusr;
	private String segtpodest;
	private String segwksmod;
	private String segwkscre;
	private Integer segpcsid;
	private Integer segtarrsl;
	private Integer segdocsts;
	private Integer segstscod;
	private String origen;
	private String destino;	
	private String usuario;
	private Tareas tareas;
	private Estados estados;

	public Seguimiento(){}
	
	
	
	public Seguimiento(Integer doccod, Integer segcod, String segglo,
			Integer pcdid, Integer tarcod, String segprfcod, Integer segusrcod,
			Integer seguoorico, Integer segcaroric, Integer segemporic,
			Integer segemporii, Integer seguodesco, Integer segcardesc,
			Integer segempdesc, Integer segempdesi, String segfch,
			String seghra, Integer segusr, String segtpodest, String segwksmod,
			String segwkscre, Integer segpcsid, Integer segtarrsl,
			Integer segdocsts, Integer segstscod, String origen,
			String destino, String usuario, Tareas tareas, Estados estados) {
		super();
		this.doccod = doccod;
		this.segcod = segcod;
		this.segglo = segglo;
		this.pcdid = pcdid;
		this.tarcod = tarcod;
		this.segprfcod = segprfcod;
		this.segusrcod = segusrcod;
		this.seguoorico = seguoorico;
		this.segcaroric = segcaroric;
		this.segemporic = segemporic;
		this.segemporii = segemporii;
		this.seguodesco = seguodesco;
		this.segcardesc = segcardesc;
		this.segempdesc = segempdesc;
		this.segempdesi = segempdesi;
		this.segfch = segfch;
		this.seghra = seghra;
		this.segusr = segusr;
		this.segtpodest = segtpodest;
		this.segwksmod = segwksmod;
		this.segwkscre = segwkscre;
		this.segpcsid = segpcsid;
		this.segtarrsl = segtarrsl;
		this.segdocsts = segdocsts;
		this.segstscod = segstscod;
		this.origen = origen;
		this.destino = destino;
		this.usuario = usuario;
		this.tareas = tareas;
		this.estados = estados;
	}



	public Integer getDoccod() {
		return doccod;
	}

	public void setDoccod(Integer doccod) {
		this.doccod = doccod;
	}

	public Integer getSegcod() {
		return segcod;
	}

	public void setSegcod(Integer segcod) {
		this.segcod = segcod;
	}

	public String getSegglo() {
		return segglo;
	}

	public void setSegglo(String segglo) {
		this.segglo = segglo;
	}

	public Integer getPcdid() {
		return pcdid;
	}

	public void setPcdid(Integer pcdid) {
		this.pcdid = pcdid;
	}

	public Integer getTarcod() {
		return tarcod;
	}

	public void setTarcod(Integer tarcod) {
		this.tarcod = tarcod;
	}

	public String getSegprfcod() {
		return segprfcod;
	}

	public void setSegprfcod(String segprfcod) {
		this.segprfcod = segprfcod;
	}

	public Integer getSegusrcod() {
		return segusrcod;
	}

	public void setSegusrcod(Integer segusrcod) {
		this.segusrcod = segusrcod;
	}

	public Integer getSeguoorico() {
		return seguoorico;
	}

	public void setSeguoorico(Integer seguoorico) {
		this.seguoorico = seguoorico;
	}

	public Integer getSegcaroric() {
		return segcaroric;
	}

	public void setSegcaroric(Integer segcaroric) {
		this.segcaroric = segcaroric;
	}

	public Integer getSegemporic() {
		return segemporic;
	}

	public void setSegemporic(Integer segemporic) {
		this.segemporic = segemporic;
	}

	public Integer getSegemporii() {
		return segemporii;
	}

	public void setSegemporii(Integer segemporii) {
		this.segemporii = segemporii;
	}

	public Integer getSeguodesco() {
		return seguodesco;
	}

	public void setSeguodesco(Integer seguodesco) {
		this.seguodesco = seguodesco;
	}

	public Integer getSegcardesc() {
		return segcardesc;
	}

	public void setSegcardesc(Integer segcardesc) {
		this.segcardesc = segcardesc;
	}

	public Integer getSegempdesc() {
		return segempdesc;
	}

	public void setSegempdesc(Integer segempdesc) {
		this.segempdesc = segempdesc;
	}

	public Integer getSegempdesi() {
		return segempdesi;
	}

	public void setSegempdesi(Integer segempdesi) {
		this.segempdesi = segempdesi;
	}

	public String getSegfch() {
		return segfch;
	}

	public void setSegfch(String segfch) {
		this.segfch = segfch;
	}

	public String getSeghra() {
		return seghra;
	}

	public void setSeghra(String seghra) {
		this.seghra = seghra;
	}

	public Integer getSegusr() {
		return segusr;
	}

	public void setSegusr(Integer segusr) {
		this.segusr = segusr;
	}

	public String getSegtpodest() {
		return segtpodest;
	}

	public void setSegtpodest(String segtpodest) {
		this.segtpodest = segtpodest;
	}

	public String getSegwksmod() {
		return segwksmod;
	}

	public void setSegwksmod(String segwksmod) {
		this.segwksmod = segwksmod;
	}

	public String getSegwkscre() {
		return segwkscre;
	}

	public void setSegwkscre(String segwkscre) {
		this.segwkscre = segwkscre;
	}

	public Integer getSegpcsid() {
		return segpcsid;
	}

	public void setSegpcsid(Integer segpcsid) {
		this.segpcsid = segpcsid;
	}

	public Integer getSegtarrsl() {
		return segtarrsl;
	}

	public void setSegtarrsl(Integer segtarrsl) {
		this.segtarrsl = segtarrsl;
	}

	public Integer getSegdocsts() {
		return segdocsts;
	}

	public void setSegdocsts(Integer segdocsts) {
		this.segdocsts = segdocsts;
	}

	public Integer getSegstscod() {
		return segstscod;
	}

	public void setSegstscod(Integer segstscod) {
		this.segstscod = segstscod;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Tareas getTareas() {
		return tareas;
	}

	public void setTareas(Tareas tareas) {
		this.tareas = tareas;
	}

	public Estados getEstados() {
		return estados;
	}

	public void setEstados(Estados estados) {
		this.estados = estados;
	}

}

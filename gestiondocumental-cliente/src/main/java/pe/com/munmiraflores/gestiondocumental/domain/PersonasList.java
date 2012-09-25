package pe.com.munmiraflores.gestiondocumental.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="lstpersonas")
public class PersonasList {

	private List<Personas> data;

	public List<Personas> getData() {
		return data;
	}

	public void setData(List<Personas> data) {
		this.data = data;
	}
}

package pe.com.munmiraflores.gestiondocumental.service;

import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import pe.com.munmiraflores.gestiondocumental.domain.Seguimiento;

@XmlRootElement(name = "response")
public class GestiondocumentalCollection {

    //private Collection<Usuarios> usuarios;
    private Collection<Seguimiento> seguimientos;
    
    public GestiondocumentalCollection() {
    }

    /*public GestiondocumentalCollection(Collection<Usuarios> usuarios) {
        this.usuarios = usuarios;
    }*/

    public GestiondocumentalCollection(Collection<Seguimiento> seguimientos) {
        this.seguimientos = seguimientos;
    }
    
    /*@XmlElement(name="usuarios")
    @XmlElementWrapper(name="usuarios")
    public Collection<Usuarios> getUsuarios() {
        return usuarios;
    }*/
    
    @XmlElement(name="seguimiento")
    @XmlElementWrapper(name="seguimiento")
    public Collection<Seguimiento> getSeguimiento() {
        return seguimientos;
    }

}

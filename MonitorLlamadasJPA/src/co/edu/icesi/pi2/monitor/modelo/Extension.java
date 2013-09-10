/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.icesi.pi2.monitor.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alejo
 * @Version 1.0.0.0.0.0.0.0.1
 */
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Extension.findAll", query = "SELECT e FROM Extension e"),
    @NamedQuery(name = "Extension.findByNumero", query = "SELECT e FROM Extension e WHERE e.numero = :numero"),
    @NamedQuery(name = "Extension.findByNombre", query = "SELECT e FROM Extension e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Extension.findByExtensionId", query = "SELECT e FROM Extension e WHERE e.extensionId = :extensionId")})
public class Extension implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 10)
    @Column(length = 10)
    private String numero;
    @Size(max = 100)
    @Column(length = 100)
    private String nombre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "EXTENSION_ID", nullable = false, precision = 0, scale = -127)
    private BigDecimal extensionId;

    public Extension() {
    }

    public Extension(BigDecimal extensionId) {
        this.extensionId = extensionId;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getExtensionId() {
        return extensionId;
    }

    public void setExtensionId(BigDecimal extensionId) {
        this.extensionId = extensionId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (extensionId != null ? extensionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Extension)) {
            return false;
        }
        Extension other = (Extension) object;
        if ((this.extensionId == null && other.extensionId != null) || (this.extensionId != null && !this.extensionId.equals(other.extensionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.icesi.pi2.modelo.Extension[ extensionId=" + extensionId + " ]";
    }
    
}

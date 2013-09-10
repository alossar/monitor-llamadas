/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.icesi.pi2.monitor.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alejo
 */
@Entity
@Table(name = "TELEFONO_PERMITIDO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TelefonoPermitido.findAll", query = "SELECT t FROM TelefonoPermitido t"),
    @NamedQuery(name = "TelefonoPermitido.findByNumero", query = "SELECT t FROM TelefonoPermitido t WHERE t.numero = :numero"),
    @NamedQuery(name = "TelefonoPermitido.findByExtensionExtensionId", query = "SELECT t FROM TelefonoPermitido t WHERE t.extensionExtensionId = :extensionExtensionId")})
public class TelefonoPermitido implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(nullable = false, length = 50)
    private String numero;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EXTENSION_EXTENSION_ID", nullable = false)
    private BigInteger extensionExtensionId;
    @JoinColumn(name = "NUMERO", referencedColumnName = "NUMERO", nullable = false, insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Telefono telefono;

    public TelefonoPermitido() {
    }

    public TelefonoPermitido(String numero) {
        this.numero = numero;
    }

    public TelefonoPermitido(String numero, BigInteger extensionExtensionId) {
        this.numero = numero;
        this.extensionExtensionId = extensionExtensionId;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public BigInteger getExtensionExtensionId() {
        return extensionExtensionId;
    }

    public void setExtensionExtensionId(BigInteger extensionExtensionId) {
        this.extensionExtensionId = extensionExtensionId;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TelefonoPermitido)) {
            return false;
        }
        TelefonoPermitido other = (TelefonoPermitido) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.icesi.pi2.modelo.TelefonoPermitido[ numero=" + numero + " ]";
    }
    
}

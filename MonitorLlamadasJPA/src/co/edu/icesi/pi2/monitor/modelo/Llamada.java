/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.icesi.pi2.monitor.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alejo
 */
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Llamada.findAll", query = "SELECT l FROM Llamada l"),
    @NamedQuery(name = "Llamada.findByFecha", query = "SELECT l FROM Llamada l WHERE l.fecha = :fecha"),
    @NamedQuery(name = "Llamada.findByDuracion", query = "SELECT l FROM Llamada l WHERE l.duracion = :duracion"),
    @NamedQuery(name = "Llamada.findByRutaarchivo", query = "SELECT l FROM Llamada l WHERE l.rutaarchivo = :rutaarchivo")})
public class Llamada implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(nullable = false)
    private Object codigollamada;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Size(max = 10)
    @Column(length = 10)
    private String duracion;
    @Size(max = 100)
    @Column(length = 100)
    private String rutaarchivo;
    @JoinColumn(name = "TELEFONO_NUMERO", referencedColumnName = "NUMERO", nullable = false)
    @ManyToOne(optional = false)
    private Telefono telefonoNumero;
    @JoinColumn(name = "NUMERO", referencedColumnName = "NUMERO", nullable = false)
    @ManyToOne(optional = false)
    private Telefono numero;

    public Llamada() {
    }

    public Llamada(Object codigollamada) {
        this.codigollamada = codigollamada;
    }

    public Object getCodigollamada() {
        return codigollamada;
    }

    public void setCodigollamada(Object codigollamada) {
        this.codigollamada = codigollamada;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getRutaarchivo() {
        return rutaarchivo;
    }

    public void setRutaarchivo(String rutaarchivo) {
        this.rutaarchivo = rutaarchivo;
    }

    public Telefono getTelefonoNumero() {
        return telefonoNumero;
    }

    public void setTelefonoNumero(Telefono telefonoNumero) {
        this.telefonoNumero = telefonoNumero;
    }

    public Telefono getNumero() {
        return numero;
    }

    public void setNumero(Telefono numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigollamada != null ? codigollamada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Llamada)) {
            return false;
        }
        Llamada other = (Llamada) object;
        if ((this.codigollamada == null && other.codigollamada != null) || (this.codigollamada != null && !this.codigollamada.equals(other.codigollamada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.icesi.pi2.modelo.Llamada[ codigollamada=" + codigollamada + " ]";
    }
    
}

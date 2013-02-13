/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Utilisateur
 */
@Entity
@Table(name = "OUTIL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Outil.findAll", query = "SELECT o FROM Outil o"),
    @NamedQuery(name = "Outil.findByIdOutil", query = "SELECT o FROM Outil o WHERE o.idOutil = :idOutil")})
public class Outil implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_OUTIL")
    private Integer idOutil;
    @JoinColumn(name = "ID_PHASE", referencedColumnName = "ID_PHASE")
    @ManyToOne
    private Phase idPhase;

    public Outil() {
    }

    public Outil(Integer idOutil) {
        this.idOutil = idOutil;
    }

    public Integer getIdOutil() {
        return idOutil;
    }

    public void setIdOutil(Integer idOutil) {
        this.idOutil = idOutil;
    }

    public Phase getIdPhase() {
        return idPhase;
    }

    public void setIdPhase(Phase idPhase) {
        this.idPhase = idPhase;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOutil != null ? idOutil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Outil)) {
            return false;
        }
        Outil other = (Outil) object;
        if ((this.idOutil == null && other.idOutil != null) || (this.idOutil != null && !this.idOutil.equals(other.idOutil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Outil[ idOutil=" + idOutil + " ]";
    }
    
}

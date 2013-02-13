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
 * @author Anne
 */
@Entity
@Table(name = "PERS_DEM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersDem.findAll", query = "SELECT p FROM PersDem p"),
    @NamedQuery(name = "PersDem.findByIdPersDem", query = "SELECT p FROM PersDem p WHERE p.idPersDem = :idPersDem")})
public class PersDem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PERS_DEM")
    private Integer idPersDem;
    @JoinColumn(name = "ID_PERSONNE", referencedColumnName = "ID_PERSONNE")
    @ManyToOne
    private Personne idPersonne;
    @JoinColumn(name = "ID_DEMANDE", referencedColumnName = "ID_DEMANDE")
    @ManyToOne
    private Demande idDemande;

    public PersDem() {
    }

    public PersDem(Integer idPersDem) {
        this.idPersDem = idPersDem;
    }

    public Integer getIdPersDem() {
        return idPersDem;
    }

    public void setIdPersDem(Integer idPersDem) {
        this.idPersDem = idPersDem;
    }

    public Personne getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(Personne idPersonne) {
        this.idPersonne = idPersonne;
    }

    public Demande getIdDemande() {
        return idDemande;
    }

    public void setIdDemande(Demande idDemande) {
        this.idDemande = idDemande;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPersDem != null ? idPersDem.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersDem)) {
            return false;
        }
        PersDem other = (PersDem) object;
        if ((this.idPersDem == null && other.idPersDem != null) || (this.idPersDem != null && !this.idPersDem.equals(other.idPersDem))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.PersDem[ idPersDem=" + idPersDem + " ]";
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Utilisateur
 */
@Entity
@Table(name = "DEMANDE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Demande.findAll", query = "SELECT d FROM Demande d"),
    @NamedQuery(name = "Demande.findByIdDemande", query = "SELECT d FROM Demande d WHERE d.idDemande = :idDemande"),
    @NamedQuery(name = "Demande.findBySujetDemande", query = "SELECT d FROM Demande d WHERE d.sujetDemande = :sujetDemande"),
    @NamedQuery(name = "Demande.findByTypeDemande", query = "SELECT d FROM Demande d WHERE d.typeDemande = :typeDemande"),
    @NamedQuery(name = "Demande.findByDescriptifDemande", query = "SELECT d FROM Demande d WHERE d.descriptifDemande = :descriptifDemande")})
public class Demande implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_DEMANDE")
    private Integer idDemande;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "SUJET_DEMANDE")
    private String sujetDemande;
    @Size(max = 20)
    @Column(name = "TYPE_DEMANDE")
    private String typeDemande;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "DESCRIPTIF_DEMANDE")
    private String descriptifDemande;
    @OneToMany(mappedBy = "idDemande")
    private Collection<PersDem> persDemCollection;
    @JoinColumn(name = "ID_PHASE", referencedColumnName = "ID_PHASE")
    @ManyToOne
    private Phase idPhase;
    @JoinColumn(name = "ID_PERSONNE", referencedColumnName = "ID_PERSONNE")
    @ManyToOne
    private Personne idPersonne;

    public Demande() {
    }

    public Demande(Integer idDemande) {
        this.idDemande = idDemande;
    }

    public Demande(Integer idDemande, String sujetDemande, String descriptifDemande) {
        this.idDemande = idDemande;
        this.sujetDemande = sujetDemande;
        this.descriptifDemande = descriptifDemande;
    }

    public Integer getIdDemande() {
        return idDemande;
    }

    public void setIdDemande(Integer idDemande) {
        this.idDemande = idDemande;
    }

    public String getSujetDemande() {
        return sujetDemande;
    }

    public void setSujetDemande(String sujetDemande) {
        this.sujetDemande = sujetDemande;
    }

    public String getTypeDemande() {
        return typeDemande;
    }

    public void setTypeDemande(String typeDemande) {
        this.typeDemande = typeDemande;
    }

    public String getDescriptifDemande() {
        return descriptifDemande;
    }

    public void setDescriptifDemande(String descriptifDemande) {
        this.descriptifDemande = descriptifDemande;
    }

    @XmlTransient
    public Collection<PersDem> getPersDemCollection() {
        return persDemCollection;
    }

    public void setPersDemCollection(Collection<PersDem> persDemCollection) {
        this.persDemCollection = persDemCollection;
    }

    public Phase getIdPhase() {
        return idPhase;
    }

    public void setIdPhase(Phase idPhase) {
        this.idPhase = idPhase;
    }

    public Personne getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(Personne idPersonne) {
        this.idPersonne = idPersonne;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDemande != null ? idDemande.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Demande)) {
            return false;
        }
        Demande other = (Demande) object;
        if ((this.idDemande == null && other.idDemande != null) || (this.idDemande != null && !this.idDemande.equals(other.idDemande))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Demande[ idDemande=" + idDemande + " ]";
    }
    
}

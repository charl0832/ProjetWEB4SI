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
 * @author util
 */
@Entity
@Table(name = "PROJET")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Projet.findAll", query = "SELECT p FROM Projet p"),
    @NamedQuery(name = "Projet.findByIdProjet", query = "SELECT p FROM Projet p WHERE p.idProjet = :idProjet"),
    @NamedQuery(name = "Projet.findByNomProjet", query = "SELECT p FROM Projet p WHERE p.nomProjet = :nomProjet"),
    @NamedQuery(name = "Projet.findByEtatAvancementProjet", query = "SELECT p FROM Projet p WHERE p.etatAvancementProjet = :etatAvancementProjet"),
    @NamedQuery(name = "Projet.findByPourcentageProjet", query = "SELECT p FROM Projet p WHERE p.pourcentageProjet = :pourcentageProjet"),
    @NamedQuery(name = "Projet.findByCahierCharges", query = "SELECT p FROM Projet p WHERE p.cahierCharges = :cahierCharges")})
public class Projet implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PROJET")
    private Integer idProjet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "NOM_PROJET")
    private String nomProjet;
    @Size(max = 15)
    @Column(name = "ETAT_AVANCEMENT_PROJET")
    private String etatAvancementProjet;
    @Basic(optional = false)
    @NotNull
    @Column(name = "POURCENTAGE_PROJET")
    private int pourcentageProjet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "CAHIER_CHARGES")
    private String cahierCharges;
    @JoinColumn(name = "ID_PERSONNE", referencedColumnName = "ID_PERSONNE")
    @ManyToOne
    private Personne idPersonne;
    @OneToMany(mappedBy = "idProjet")
    private Collection<Phase> phaseCollection;
    @OneToMany(mappedBy = "idProjet")
    private Collection<GroupeProjet> groupeProjetCollection;

    public Projet() {
    }

    public Projet(Integer idProjet) {
        this.idProjet = idProjet;
    }

    public Projet(Integer idProjet, String nomProjet, int pourcentageProjet, String cahierCharges) {
        this.idProjet = idProjet;
        this.nomProjet = nomProjet;
        this.pourcentageProjet = pourcentageProjet;
        this.cahierCharges = cahierCharges;
    }

    public Integer getIdProjet() {
        return idProjet;
    }

    public void setIdProjet(Integer idProjet) {
        this.idProjet = idProjet;
    }

    public String getNomProjet() {
        return nomProjet;
    }

    public void setNomProjet(String nomProjet) {
        this.nomProjet = nomProjet;
    }

    public String getEtatAvancementProjet() {
        return etatAvancementProjet;
    }

    public void setEtatAvancementProjet(String etatAvancementProjet) {
        this.etatAvancementProjet = etatAvancementProjet;
    }

    public int getPourcentageProjet() {
        return pourcentageProjet;
    }

    public void setPourcentageProjet(int pourcentageProjet) {
        this.pourcentageProjet = pourcentageProjet;
    }

    public String getCahierCharges() {
        return cahierCharges;
    }

    public void setCahierCharges(String cahierCharges) {
        this.cahierCharges = cahierCharges;
    }

    public Personne getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(Personne idPersonne) {
        this.idPersonne = idPersonne;
    }

    @XmlTransient
    public Collection<Phase> getPhaseCollection() {
        return phaseCollection;
    }

    public void setPhaseCollection(Collection<Phase> phaseCollection) {
        this.phaseCollection = phaseCollection;
    }

    @XmlTransient
    public Collection<GroupeProjet> getGroupeProjetCollection() {
        return groupeProjetCollection;
    }

    public void setGroupeProjetCollection(Collection<GroupeProjet> groupeProjetCollection) {
        this.groupeProjetCollection = groupeProjetCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProjet != null ? idProjet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Projet)) {
            return false;
        }
        Projet other = (Projet) object;
        if ((this.idProjet == null && other.idProjet != null) || (this.idProjet != null && !this.idProjet.equals(other.idProjet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Projet[ idProjet=" + idProjet + " ]";
    }
    
}

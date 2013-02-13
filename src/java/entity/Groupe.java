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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Utilisateur
 */
@Entity
@Table(name = "GROUPE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Groupe.findAll", query = "SELECT g FROM Groupe g"),
    @NamedQuery(name = "Groupe.findByIdGroupe", query = "SELECT g FROM Groupe g WHERE g.idGroupe = :idGroupe")})
public class Groupe implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_GROUPE")
    private Integer idGroupe;
    @JoinColumn(name = "ID_PROMOTION", referencedColumnName = "ID_PROMOTION")
    @ManyToOne
    private Promotion idPromotion;
    @OneToMany(mappedBy = "idGroupe")
    private Collection<GroupeProjet> groupeProjetCollection;
    @OneToMany(mappedBy = "idGroupe")
    private Collection<Personne> personneCollection;

    public Groupe() {
    }

    public Groupe(Integer idGroupe) {
        this.idGroupe = idGroupe;
    }

    public Integer getIdGroupe() {
        return idGroupe;
    }

    public void setIdGroupe(Integer idGroupe) {
        this.idGroupe = idGroupe;
    }

    public Promotion getIdPromotion() {
        return idPromotion;
    }

    public void setIdPromotion(Promotion idPromotion) {
        this.idPromotion = idPromotion;
    }

    @XmlTransient
    public Collection<GroupeProjet> getGroupeProjetCollection() {
        return groupeProjetCollection;
    }

    public void setGroupeProjetCollection(Collection<GroupeProjet> groupeProjetCollection) {
        this.groupeProjetCollection = groupeProjetCollection;
    }

    @XmlTransient
    public Collection<Personne> getPersonneCollection() {
        return personneCollection;
    }

    public void setPersonneCollection(Collection<Personne> personneCollection) {
        this.personneCollection = personneCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGroupe != null ? idGroupe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Groupe)) {
            return false;
        }
        Groupe other = (Groupe) object;
        if ((this.idGroupe == null && other.idGroupe != null) || (this.idGroupe != null && !this.idGroupe.equals(other.idGroupe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Groupe[ idGroupe=" + idGroupe + " ]";
    }
    
}

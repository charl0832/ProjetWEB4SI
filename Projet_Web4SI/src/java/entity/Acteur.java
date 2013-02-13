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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Anne
 */
@Entity
@Table(name = "ACTEUR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Acteur.findAll", query = "SELECT a FROM Acteur a"),
    @NamedQuery(name = "Acteur.findByIdActeur", query = "SELECT a FROM Acteur a WHERE a.idActeur = :idActeur"),
    @NamedQuery(name = "Acteur.findByRoleAct", query = "SELECT a FROM Acteur a WHERE a.roleAct = :roleAct"),
    @NamedQuery(name = "Acteur.findByEstConnecte", query = "SELECT a FROM Acteur a WHERE a.estConnecte = :estConnecte"),
    @NamedQuery(name = "Acteur.findByActif", query = "SELECT a FROM Acteur a WHERE a.actif = :actif")})
public class Acteur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_ACTEUR")
    private Integer idActeur;
    @Size(max = 11)
    @Column(name = "ROLE_ACT")
    private String roleAct;
    @Column(name = "EST_CONNECTE")
    private Integer estConnecte;
    @Column(name = "ACTIF")
    private Integer actif;
    @OneToMany(mappedBy = "idActeur")
    private Collection<ActeurPhase> acteurPhaseCollection;
    @JoinColumn(name = "ID_PERSONNE", referencedColumnName = "ID_PERSONNE")
    @ManyToOne
    private Personne idPersonne;
    @OneToMany(mappedBy = "idActeur")
    private Collection<TacheActeur> tacheActeurCollection;

    public Acteur() {
    }

    public Acteur(Integer idActeur) {
        this.idActeur = idActeur;
    }

    public Integer getIdActeur() {
        return idActeur;
    }

    public void setIdActeur(Integer idActeur) {
        this.idActeur = idActeur;
    }

    public String getRoleAct() {
        return roleAct;
    }

    public void setRoleAct(String roleAct) {
        this.roleAct = roleAct;
    }

    public Integer getEstConnecte() {
        return estConnecte;
    }

    public void setEstConnecte(Integer estConnecte) {
        this.estConnecte = estConnecte;
    }

    public Integer getActif() {
        return actif;
    }

    public void setActif(Integer actif) {
        this.actif = actif;
    }

    @XmlTransient
    public Collection<ActeurPhase> getActeurPhaseCollection() {
        return acteurPhaseCollection;
    }

    public void setActeurPhaseCollection(Collection<ActeurPhase> acteurPhaseCollection) {
        this.acteurPhaseCollection = acteurPhaseCollection;
    }

    public Personne getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(Personne idPersonne) {
        this.idPersonne = idPersonne;
    }

    @XmlTransient
    public Collection<TacheActeur> getTacheActeurCollection() {
        return tacheActeurCollection;
    }

    public void setTacheActeurCollection(Collection<TacheActeur> tacheActeurCollection) {
        this.tacheActeurCollection = tacheActeurCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idActeur != null ? idActeur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Acteur)) {
            return false;
        }
        Acteur other = (Acteur) object;
        if ((this.idActeur == null && other.idActeur != null) || (this.idActeur != null && !this.idActeur.equals(other.idActeur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Acteur[ idActeur=" + idActeur + " ]";
    }
    
}

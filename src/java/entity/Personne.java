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
@Table(name = "PERSONNE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personne.findAll", query = "SELECT p FROM Personne p"),
    @NamedQuery(name = "Personne.findByIdPersonne", query = "SELECT p FROM Personne p WHERE p.idPersonne = :idPersonne"),
    @NamedQuery(name = "Personne.findByNomPersonne", query = "SELECT p FROM Personne p WHERE p.nomPersonne = :nomPersonne"),
    @NamedQuery(name = "Personne.findByPrenomPersonne", query = "SELECT p FROM Personne p WHERE p.prenomPersonne = :prenomPersonne"),
    @NamedQuery(name = "Personne.findByEtudiant", query = "SELECT p FROM Personne p WHERE p.etudiant = :etudiant")})
public class Personne implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PERSONNE")
    private Integer idPersonne;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "NOM_PERSONNE")
    private String nomPersonne;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "PRENOM_PERSONNE")
    private String prenomPersonne;
    @Column(name = "ETUDIANT")
    private Integer etudiant;
    @OneToMany(mappedBy = "idPersonne")
    private Collection<Projet> projetCollection;
    @OneToMany(mappedBy = "idPersonne")
    private Collection<Acteur> acteurCollection;
    @OneToMany(mappedBy = "idPersonne")
    private Collection<PersDem> persDemCollection;
    @OneToMany(mappedBy = "idPersonne")
    private Collection<Demande> demandeCollection;
    @JoinColumn(name = "ID_PROMOTION", referencedColumnName = "ID_PROMOTION")
    @ManyToOne
    private Promotion idPromotion;
    @JoinColumn(name = "ID_GROUPE", referencedColumnName = "ID_GROUPE")
    @ManyToOne
    private Groupe idGroupe;

    public Personne() {
    }

    public Personne(Integer idPersonne) {
        this.idPersonne = idPersonne;
    }

    public Personne(Integer idPersonne, String nomPersonne, String prenomPersonne) {
        this.idPersonne = idPersonne;
        this.nomPersonne = nomPersonne;
        this.prenomPersonne = prenomPersonne;
    }

    public Integer getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(Integer idPersonne) {
        this.idPersonne = idPersonne;
    }

    public String getNomPersonne() {
        return nomPersonne;
    }

    public void setNomPersonne(String nomPersonne) {
        this.nomPersonne = nomPersonne;
    }

    public String getPrenomPersonne() {
        return prenomPersonne;
    }

    public void setPrenomPersonne(String prenomPersonne) {
        this.prenomPersonne = prenomPersonne;
    }

    public Integer getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Integer etudiant) {
        this.etudiant = etudiant;
    }

    @XmlTransient
    public Collection<Projet> getProjetCollection() {
        return projetCollection;
    }

    public void setProjetCollection(Collection<Projet> projetCollection) {
        this.projetCollection = projetCollection;
    }

    @XmlTransient
    public Collection<Acteur> getActeurCollection() {
        return acteurCollection;
    }

    public void setActeurCollection(Collection<Acteur> acteurCollection) {
        this.acteurCollection = acteurCollection;
    }

    @XmlTransient
    public Collection<PersDem> getPersDemCollection() {
        return persDemCollection;
    }

    public void setPersDemCollection(Collection<PersDem> persDemCollection) {
        this.persDemCollection = persDemCollection;
    }

    @XmlTransient
    public Collection<Demande> getDemandeCollection() {
        return demandeCollection;
    }

    public void setDemandeCollection(Collection<Demande> demandeCollection) {
        this.demandeCollection = demandeCollection;
    }

    public Promotion getIdPromotion() {
        return idPromotion;
    }

    public void setIdPromotion(Promotion idPromotion) {
        this.idPromotion = idPromotion;
    }

    public Groupe getIdGroupe() {
        return idGroupe;
    }

    public void setIdGroupe(Groupe idGroupe) {
        this.idGroupe = idGroupe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPersonne != null ? idPersonne.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personne)) {
            return false;
        }
        Personne other = (Personne) object;
        if ((this.idPersonne == null && other.idPersonne != null) || (this.idPersonne != null && !this.idPersonne.equals(other.idPersonne))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Personne[ idPersonne=" + idPersonne + " ]";
    }
    
}

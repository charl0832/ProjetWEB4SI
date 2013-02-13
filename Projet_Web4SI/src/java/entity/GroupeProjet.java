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
@Table(name = "GROUPE_PROJET")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GroupeProjet.findAll", query = "SELECT g FROM GroupeProjet g"),
    @NamedQuery(name = "GroupeProjet.findByIdGroupeProjet", query = "SELECT g FROM GroupeProjet g WHERE g.idGroupeProjet = :idGroupeProjet")})
public class GroupeProjet implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_GROUPE_PROJET")
    private Integer idGroupeProjet;
    @JoinColumn(name = "ID_PROJET", referencedColumnName = "ID_PROJET")
    @ManyToOne
    private Projet idProjet;
    @JoinColumn(name = "ID_GROUPE", referencedColumnName = "ID_GROUPE")
    @ManyToOne
    private Groupe idGroupe;

    public GroupeProjet() {
    }

    public GroupeProjet(Integer idGroupeProjet) {
        this.idGroupeProjet = idGroupeProjet;
    }

    public Integer getIdGroupeProjet() {
        return idGroupeProjet;
    }

    public void setIdGroupeProjet(Integer idGroupeProjet) {
        this.idGroupeProjet = idGroupeProjet;
    }

    public Projet getIdProjet() {
        return idProjet;
    }

    public void setIdProjet(Projet idProjet) {
        this.idProjet = idProjet;
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
        hash += (idGroupeProjet != null ? idGroupeProjet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GroupeProjet)) {
            return false;
        }
        GroupeProjet other = (GroupeProjet) object;
        if ((this.idGroupeProjet == null && other.idGroupeProjet != null) || (this.idGroupeProjet != null && !this.idGroupeProjet.equals(other.idGroupeProjet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.GroupeProjet[ idGroupeProjet=" + idGroupeProjet + " ]";
    }
    
}

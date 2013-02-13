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
@Table(name = "TACHE_ACTEUR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TacheActeur.findAll", query = "SELECT t FROM TacheActeur t"),
    @NamedQuery(name = "TacheActeur.findByIdTacheActeur", query = "SELECT t FROM TacheActeur t WHERE t.idTacheActeur = :idTacheActeur")})
public class TacheActeur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_TACHE_ACTEUR")
    private Integer idTacheActeur;
    @JoinColumn(name = "ID_TACHE", referencedColumnName = "ID_TACHE")
    @ManyToOne
    private Tache idTache;
    @JoinColumn(name = "ID_ACTEUR", referencedColumnName = "ID_ACTEUR")
    @ManyToOne
    private Acteur idActeur;

    public TacheActeur() {
    }

    public TacheActeur(Integer idTacheActeur) {
        this.idTacheActeur = idTacheActeur;
    }

    public Integer getIdTacheActeur() {
        return idTacheActeur;
    }

    public void setIdTacheActeur(Integer idTacheActeur) {
        this.idTacheActeur = idTacheActeur;
    }

    public Tache getIdTache() {
        return idTache;
    }

    public void setIdTache(Tache idTache) {
        this.idTache = idTache;
    }

    public Acteur getIdActeur() {
        return idActeur;
    }

    public void setIdActeur(Acteur idActeur) {
        this.idActeur = idActeur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTacheActeur != null ? idTacheActeur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TacheActeur)) {
            return false;
        }
        TacheActeur other = (TacheActeur) object;
        if ((this.idTacheActeur == null && other.idTacheActeur != null) || (this.idTacheActeur != null && !this.idTacheActeur.equals(other.idTacheActeur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TacheActeur[ idTacheActeur=" + idTacheActeur + " ]";
    }
    
}

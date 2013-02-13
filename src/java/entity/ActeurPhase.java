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
@Table(name = "ACTEUR_PHASE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ActeurPhase.findAll", query = "SELECT a FROM ActeurPhase a"),
    @NamedQuery(name = "ActeurPhase.findByIdActeurPhase", query = "SELECT a FROM ActeurPhase a WHERE a.idActeurPhase = :idActeurPhase")})
public class ActeurPhase implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_ACTEUR_PHASE")
    private Integer idActeurPhase;
    @JoinColumn(name = "ID_PHASE", referencedColumnName = "ID_PHASE")
    @ManyToOne
    private Phase idPhase;
    @JoinColumn(name = "ID_ACTEUR", referencedColumnName = "ID_ACTEUR")
    @ManyToOne
    private Acteur idActeur;

    public ActeurPhase() {
    }

    public ActeurPhase(Integer idActeurPhase) {
        this.idActeurPhase = idActeurPhase;
    }

    public Integer getIdActeurPhase() {
        return idActeurPhase;
    }

    public void setIdActeurPhase(Integer idActeurPhase) {
        this.idActeurPhase = idActeurPhase;
    }

    public Phase getIdPhase() {
        return idPhase;
    }

    public void setIdPhase(Phase idPhase) {
        this.idPhase = idPhase;
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
        hash += (idActeurPhase != null ? idActeurPhase.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActeurPhase)) {
            return false;
        }
        ActeurPhase other = (ActeurPhase) object;
        if ((this.idActeurPhase == null && other.idActeurPhase != null) || (this.idActeurPhase != null && !this.idActeurPhase.equals(other.idActeurPhase))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ActeurPhase[ idActeurPhase=" + idActeurPhase + " ]";
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Anne
 */
@Entity
@Table(name = "TACHE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tache.findAll", query = "SELECT t FROM Tache t"),
    @NamedQuery(name = "Tache.findByIdTache", query = "SELECT t FROM Tache t WHERE t.idTache = :idTache"),
    @NamedQuery(name = "Tache.findByObjectifTache", query = "SELECT t FROM Tache t WHERE t.objectifTache = :objectifTache"),
    @NamedQuery(name = "Tache.findByDatedebuttotTache", query = "SELECT t FROM Tache t WHERE t.datedebuttotTache = :datedebuttotTache"),
    @NamedQuery(name = "Tache.findByDatedebuttardTache", query = "SELECT t FROM Tache t WHERE t.datedebuttardTache = :datedebuttardTache"),
    @NamedQuery(name = "Tache.findByDatefintotTache", query = "SELECT t FROM Tache t WHERE t.datefintotTache = :datefintotTache"),
    @NamedQuery(name = "Tache.findByDatefintardTache", query = "SELECT t FROM Tache t WHERE t.datefintardTache = :datefintardTache"),
    @NamedQuery(name = "Tache.findByDureejourTache", query = "SELECT t FROM Tache t WHERE t.dureejourTache = :dureejourTache"),
    @NamedQuery(name = "Tache.findByEtatTache", query = "SELECT t FROM Tache t WHERE t.etatTache = :etatTache"),
    @NamedQuery(name = "Tache.findByPourcentageTache", query = "SELECT t FROM Tache t WHERE t.pourcentageTache = :pourcentageTache")})
public class Tache implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_TACHE")
    private Integer idTache;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "OBJECTIF_TACHE")
    private String objectifTache;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATEDEBUTTOT_TACHE")
    @Temporal(TemporalType.DATE)
    private Date datedebuttotTache;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATEDEBUTTARD_TACHE")
    @Temporal(TemporalType.DATE)
    private Date datedebuttardTache;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATEFINTOT_TACHE")
    @Temporal(TemporalType.DATE)
    private Date datefintotTache;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATEFINTARD_TACHE")
    @Temporal(TemporalType.DATE)
    private Date datefintardTache;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DUREEJOUR_TACHE")
    private int dureejourTache;
    @Size(max = 20)
    @Column(name = "ETAT_TACHE")
    private String etatTache;
    @Basic(optional = false)
    @NotNull
    @Column(name = "POURCENTAGE_TACHE")
    private int pourcentageTache;
    @JoinColumn(name = "ID_PHASE", referencedColumnName = "ID_PHASE")
    @ManyToOne
    private Phase idPhase;
    @OneToMany(mappedBy = "idTache")
    private Collection<TacheActeur> tacheActeurCollection;

    public Tache() {
    }

    public Tache(Integer idTache) {
        this.idTache = idTache;
    }

    public Tache(Integer idTache, String objectifTache, Date datedebuttotTache, Date datedebuttardTache, Date datefintotTache, Date datefintardTache, int dureejourTache, int pourcentageTache) {
        this.idTache = idTache;
        this.objectifTache = objectifTache;
        this.datedebuttotTache = datedebuttotTache;
        this.datedebuttardTache = datedebuttardTache;
        this.datefintotTache = datefintotTache;
        this.datefintardTache = datefintardTache;
        this.dureejourTache = dureejourTache;
        this.pourcentageTache = pourcentageTache;
    }

    public Integer getIdTache() {
        return idTache;
    }

    public void setIdTache(Integer idTache) {
        this.idTache = idTache;
    }

    public String getObjectifTache() {
        return objectifTache;
    }

    public void setObjectifTache(String objectifTache) {
        this.objectifTache = objectifTache;
    }

    public Date getDatedebuttotTache() {
        return datedebuttotTache;
    }

    public void setDatedebuttotTache(Date datedebuttotTache) {
        this.datedebuttotTache = datedebuttotTache;
    }

    public Date getDatedebuttardTache() {
        return datedebuttardTache;
    }

    public void setDatedebuttardTache(Date datedebuttardTache) {
        this.datedebuttardTache = datedebuttardTache;
    }

    public Date getDatefintotTache() {
        return datefintotTache;
    }

    public void setDatefintotTache(Date datefintotTache) {
        this.datefintotTache = datefintotTache;
    }

    public Date getDatefintardTache() {
        return datefintardTache;
    }

    public void setDatefintardTache(Date datefintardTache) {
        this.datefintardTache = datefintardTache;
    }

    public int getDureejourTache() {
        return dureejourTache;
    }

    public void setDureejourTache(int dureejourTache) {
        this.dureejourTache = dureejourTache;
    }

    public String getEtatTache() {
        return etatTache;
    }

    public void setEtatTache(String etatTache) {
        this.etatTache = etatTache;
    }

    public int getPourcentageTache() {
        return pourcentageTache;
    }

    public void setPourcentageTache(int pourcentageTache) {
        this.pourcentageTache = pourcentageTache;
    }

    public Phase getIdPhase() {
        return idPhase;
    }

    public void setIdPhase(Phase idPhase) {
        this.idPhase = idPhase;
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
        hash += (idTache != null ? idTache.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tache)) {
            return false;
        }
        Tache other = (Tache) object;
        if ((this.idTache == null && other.idTache != null) || (this.idTache != null && !this.idTache.equals(other.idTache))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Tache[ idTache=" + idTache + " ]";
    }
    
}

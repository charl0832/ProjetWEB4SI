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
 * @author util
 */
@Entity
@Table(name = "PHASE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Phase.findAll", query = "SELECT p FROM Phase p"),
    @NamedQuery(name = "Phase.findByIdPhase", query = "SELECT p FROM Phase p WHERE p.idPhase = :idPhase"),
    @NamedQuery(name = "Phase.findByNomPhase", query = "SELECT p FROM Phase p WHERE p.nomPhase = :nomPhase"),
    @NamedQuery(name = "Phase.findByDateDebut", query = "SELECT p FROM Phase p WHERE p.dateDebut = :dateDebut"),
    @NamedQuery(name = "Phase.findByDateFin", query = "SELECT p FROM Phase p WHERE p.dateFin = :dateFin"),
    @NamedQuery(name = "Phase.findByObjectif", query = "SELECT p FROM Phase p WHERE p.objectif = :objectif"),
    @NamedQuery(name = "Phase.findByEtatAvancement", query = "SELECT p FROM Phase p WHERE p.etatAvancement = :etatAvancement")})
public class Phase implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PHASE")
    private Integer idPhase;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "NOM_PHASE")
    private String nomPhase;
    @Column(name = "DATE_DEBUT")
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @Column(name = "DATE_FIN")
    @Temporal(TemporalType.DATE)
    private Date dateFin;
    @Size(max = 200)
    @Column(name = "OBJECTIF")
    private String objectif;
    @Size(max = 12)
    @Column(name = "ETAT_AVANCEMENT")
    private String etatAvancement;
    @OneToMany(mappedBy = "idPhase")
    private Collection<ActeurPhase> acteurPhaseCollection;
    @OneToMany(mappedBy = "idPhase")
    private Collection<Outil> outilCollection;
    @OneToMany(mappedBy = "idPhase")
    private Collection<Document> documentCollection;
    @JoinColumn(name = "ID_PROJET", referencedColumnName = "ID_PROJET")
    @ManyToOne
    private Projet idProjet;
    @OneToMany(mappedBy = "idPhase")
    private Collection<Demande> demandeCollection;
    @OneToMany(mappedBy = "idPhase")
    private Collection<Tache> tacheCollection;

    public Phase() {
    }

    public Phase(Integer idPhase) {
        this.idPhase = idPhase;
    }

    public Phase(Integer idPhase, String nomPhase) {
        this.idPhase = idPhase;
        this.nomPhase = nomPhase;
    }

    public Integer getIdPhase() {
        return idPhase;
    }

    public void setIdPhase(Integer idPhase) {
        this.idPhase = idPhase;
    }

    public String getNomPhase() {
        return nomPhase;
    }

    public void setNomPhase(String nomPhase) {
        this.nomPhase = nomPhase;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getObjectif() {
        return objectif;
    }

    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }

    public String getEtatAvancement() {
        return etatAvancement;
    }

    public void setEtatAvancement(String etatAvancement) {
        this.etatAvancement = etatAvancement;
    }

    @XmlTransient
    public Collection<ActeurPhase> getActeurPhaseCollection() {
        return acteurPhaseCollection;
    }

    public void setActeurPhaseCollection(Collection<ActeurPhase> acteurPhaseCollection) {
        this.acteurPhaseCollection = acteurPhaseCollection;
    }

    @XmlTransient
    public Collection<Outil> getOutilCollection() {
        return outilCollection;
    }

    public void setOutilCollection(Collection<Outil> outilCollection) {
        this.outilCollection = outilCollection;
    }

    @XmlTransient
    public Collection<Document> getDocumentCollection() {
        return documentCollection;
    }

    public void setDocumentCollection(Collection<Document> documentCollection) {
        this.documentCollection = documentCollection;
    }

    public Projet getIdProjet() {
        return idProjet;
    }

    public void setIdProjet(Projet idProjet) {
        this.idProjet = idProjet;
    }

    @XmlTransient
    public Collection<Demande> getDemandeCollection() {
        return demandeCollection;
    }

    public void setDemandeCollection(Collection<Demande> demandeCollection) {
        this.demandeCollection = demandeCollection;
    }

    @XmlTransient
    public Collection<Tache> getTacheCollection() {
        return tacheCollection;
    }

    public void setTacheCollection(Collection<Tache> tacheCollection) {
        this.tacheCollection = tacheCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPhase != null ? idPhase.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Phase)) {
            return false;
        }
        Phase other = (Phase) object;
        if ((this.idPhase == null && other.idPhase != null) || (this.idPhase != null && !this.idPhase.equals(other.idPhase))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Phase[ idPhase=" + idPhase + " ]";
    }
    
}

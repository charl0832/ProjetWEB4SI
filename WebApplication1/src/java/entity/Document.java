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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author util
 */
@Entity
@Table(name = "DOCUMENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Document.findAll", query = "SELECT d FROM Document d"),
    @NamedQuery(name = "Document.findByIdDocument", query = "SELECT d FROM Document d WHERE d.idDocument = :idDocument"),
    @NamedQuery(name = "Document.findByNomdoc", query = "SELECT d FROM Document d WHERE d.nomdoc = :nomdoc"),
    @NamedQuery(name = "Document.findByForme", query = "SELECT d FROM Document d WHERE d.forme = :forme"),
    @NamedQuery(name = "Document.findByFormat", query = "SELECT d FROM Document d WHERE d.format = :format"),
    @NamedQuery(name = "Document.findByDescriptif", query = "SELECT d FROM Document d WHERE d.descriptif = :descriptif"),
    @NamedQuery(name = "Document.findByEtatavdef", query = "SELECT d FROM Document d WHERE d.etatavdef = :etatavdef")})
public class Document implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_DOCUMENT")
    private Integer idDocument;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "NOMDOC")
    private String nomdoc;
    @Size(max = 10)
    @Column(name = "FORME")
    private String forme;
    @Size(max = 10)
    @Column(name = "FORMAT")
    private String format;
    @Size(max = 200)
    @Column(name = "DESCRIPTIF")
    private String descriptif;
    @Column(name = "ETATAVDEF")
    private Integer etatavdef;
    @JoinColumn(name = "ID_PHASE", referencedColumnName = "ID_PHASE")
    @ManyToOne
    private Phase idPhase;

    public Document() {
    }

    public Document(Integer idDocument) {
        this.idDocument = idDocument;
    }

    public Document(Integer idDocument, String nomdoc) {
        this.idDocument = idDocument;
        this.nomdoc = nomdoc;
    }

    public Integer getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(Integer idDocument) {
        this.idDocument = idDocument;
    }

    public String getNomdoc() {
        return nomdoc;
    }

    public void setNomdoc(String nomdoc) {
        this.nomdoc = nomdoc;
    }

    public String getForme() {
        return forme;
    }

    public void setForme(String forme) {
        this.forme = forme;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }

    public Integer getEtatavdef() {
        return etatavdef;
    }

    public void setEtatavdef(Integer etatavdef) {
        this.etatavdef = etatavdef;
    }

    public Phase getIdPhase() {
        return idPhase;
    }

    public void setIdPhase(Phase idPhase) {
        this.idPhase = idPhase;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDocument != null ? idDocument.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Document)) {
            return false;
        }
        Document other = (Document) object;
        if ((this.idDocument == null && other.idDocument != null) || (this.idDocument != null && !this.idDocument.equals(other.idDocument))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Document[ idDocument=" + idDocument + " ]";
    }
    
}

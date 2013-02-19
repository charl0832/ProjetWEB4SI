/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import javax.enterprise.inject.Model;

/**
 *
 * @author Elodie
 */
@Model
public class ETU_menuProjetMB {
    public String goTaches() {
        String url = "ENS_index.xhtml";
        return url;
    }
    public String goAffecterActeurs() {
        String url = "ETU_affecterActeurs.xhtml";
        return url;
    }
    public String goCahierCharges() {
        String url = "http://......./fichier.zip";
        return url;
    }
    public String goGererDoc() {
        String url = "ETU_gererDoc.xhtml";
        return url;
    }
    public String goGererDemandes() {
        String url = "ETU_demandes.xhtml";
        return url;
    }
    public String goGererAvancement() {
        String url = "ETU_modifAvancement.xhtml" ;
        return url ;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Ejb.ENS_indexEJB;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

/**
 *
 * @author Elodie
 */
@Model
public class ENS_indexMB {
    @Inject
    private ENS_indexEJB ENS_indexEJB;
    
    public String goDemandes() {
        System.out.println("demandes !");
        String url = "ENS_demandes.xhtml" ;
        return "demandes" ;
    }
    public String goProjet() {
        String url = "ENS_choixPromo.xhtml" ;
        return url ;
    }
}

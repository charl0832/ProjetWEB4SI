/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Ejb.ENS_suiviProjetEJB;
import entity.Groupe;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Elodie
 */
@Named
@SessionScoped


public class ENS_suiviProjetMB implements Serializable {
    @Inject
    private ENS_suiviProjetEJB eNS_suiviProjetEJB;
    private Groupe groupe = new Groupe();
    private String n_groupe ;
    
    public void doListeGroupe() {
        groupe = eNS_suiviProjetEJB.creerGroupe(groupe);
    }

     public void doAjouterGroupe() {
        groupe = eNS_suiviProjetEJB.creerGroupe(groupe);
    }
     
     public List<Groupe> getListeGroupe(){
         return eNS_suiviProjetEJB.findGroupe();
     }
     
     public void setListeGroupe(List<Groupe> listeGroupe){
     }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public String getN_groupe() {
        return n_groupe;
    }

    public void setN_groupe(String n_groupe) {
        this.n_groupe = n_groupe;
    }
   
  /*  public String phase_groupe() {
        if (n_groupe.equals("0")) {
            return 
        }
        if (n_groupe.equals("1")) {
            
        }
        if (n_groupe.equals("2")) {
            
        }
        return ;
    }*/
}
   
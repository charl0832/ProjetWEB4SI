package Bean;

import entity.Projet;
import Ejb.ProjetEJB;
import java.util.*;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

@Model
public class ProjetMB {
    
    @Inject
    private ProjetEJB ProjetEJB;
    private Projet projet = new Projet();
    private List<Projet> listeProjets = new ArrayList<Projet>();

    public String doAjouterProjetEtape1() {
        projet = ProjetEJB.creerProjet(projet);
        listeProjets = ProjetEJB.findProjets();
        return "ENS_choixPromo2.xhtml";
    }

    public ProjetMB() {
        
        
    }
}


package Bean;
import Ejb.CreationProjetEJB;
import entity.Projet;
import entity.Promotion;
import java.util.*;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class CreationProjetMB {
    @Inject
    private CreationProjetEJB CreationProjetEJB;
    private Projet projet = new Projet();
    private List<Projet> listeProjets = new ArrayList<Projet>();
    
    private Promotion promotion = new Promotion(); 
    private String nomProjet ;
    private int nbGroupe;
    private String nomPromo ;
    private String nomGroupe1 ;

    public String getNomGroupe1() {
        return nomGroupe1;
    }

    public void setNomGroupe1(String nomGroupe1) {
        this.nomGroupe1 = nomGroupe1;
    }

    public String getNomPromo() {
        return nomPromo;
    }

    public void setNomPromo(String nomPromo) {
        this.nomPromo = nomPromo;
    }

    public int getNbGroupe() {
        return nbGroupe;
    }

    public void setNbGroupe(int nbGroupe) {
        this.nbGroupe = nbGroupe;
    }

  /*  public String doAjouterProjetEtape1() {
        projet = CreationProjetEJB.creerProjet(projet);
        listeProjets = CreationProjetEJB.findProjets();
        return "ENS_choixPromo2.xhtml";
    }*/
    
     public String goEtape2() {
        String url = "ENS_choixPromo2.xhtml";
        return url;
    }

     /*public void doListePromo() {
        promotion = CreationProjetEJB.creerPromotion(promotion);
        //listePromotion = PromotionEJB.findPromotion();
    }

     public void doAjouterPromo() {
        promotion = CreationProjetEJB.creerPromotion(promotion);
        //listePromotion = PromotionEJB.findPromotion();
    }*/
     
     public List<Promotion> getListePromotion(){
         return CreationProjetEJB.findPromotion();
     }
     
     public void setListePromotion(List<Promotion> listePromotion){
         //this.listePromotion = listePromotion;
     }
     
     public Promotion getPromotion(){
         return promotion;
     }
     
     public void setPromotion(Promotion promotion){
         this.promotion = promotion;
     }

    public String getNomProjet() {
        return nomProjet;
    }

    public void setNomProjet(String nomProjet) {
        this.nomProjet = nomProjet;
    }
     public CreationProjetMB() {
     
     }
     
}



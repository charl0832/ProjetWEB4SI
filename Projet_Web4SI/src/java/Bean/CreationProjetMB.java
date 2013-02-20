
package Bean;
import Ejb.CreationProjetEJB;
import entity.Personne;
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
    private Personne personne = new Personne();

    private String nomProjet ;
    private int nbGroupe;
    private String nomPromo ;
    private String nomGroupe1 ;
    private String nomEtudiant1 ;
    private String nomEtudiant2 ;
    private String nomEtudiant3 ;
      
    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public String getNomGroupe1() {
        return nomGroupe1;
    }

    public void setNomGroupe1(String nomGroupe1) {
        this.nomGroupe1 = nomGroupe1;
    }

    public String getNomEtudiant1() {
        return nomEtudiant1;
    }

    public void setNomEtudiant1(String nomEtudiant1) {
        this.nomEtudiant1 = nomEtudiant1;
    }

    public String getNomEtudiant2() {
        return nomEtudiant2;
    }

    public void setNomEtudiant2(String nomEtudiant2) {
        this.nomEtudiant2 = nomEtudiant2;
    }

    public String getNomEtudiant3() {
        return nomEtudiant3;
    }

    public void setNomEtudiant3(String nomEtudiant3) {
        this.nomEtudiant3 = nomEtudiant3;
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

    public String doAjouterProjetEtape1() {
        return "ENS_choixPromo2.xhtml";
    }
    public String doAjouterProjetEtape2() {
        return "ENS_defGroupes.xhtml";
    }
    public String doAjouterProjetEtape3() {
        return "ENS_recapGroupes.xhtml";
    }
    public String goDefPhase() {
        return "ENS_defPhase.xhtml";
    }
  
    public String goRecap() {
        return "ENS_recapNewProjet.xhtml";
    }
    
    public String goDem() {
        return "ENS_demandes.xhtml";
    }
    /*
     public String goEtape2() {
        String url = "ENS_choixPromo2.xhtml";
        return url;
    }
*/
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
     
     public List<Personne> getListePersonne(){
         return CreationProjetEJB.findPersonne();
     }
     
     public void setListePromotion(List<Promotion> listePromotion){
         //this.listePromotion = listePromotion;
     }
     
      public void setListePersonne(List<Personne> listePersonne){
   
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

    public CreationProjetEJB getCreationProjetEJB() {
        return CreationProjetEJB;
    }

    public void setCreationProjetEJB(CreationProjetEJB CreationProjetEJB) {
        this.CreationProjetEJB = CreationProjetEJB;
    }

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }

    public List<Projet> getListeProjets() {
        return listeProjets;
    }

    public void setListeProjets(List<Projet> listeProjets) {
        this.listeProjets = listeProjets;
    }
    
     public CreationProjetMB() {
     
     }
     
}



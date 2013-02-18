package Bean;

import Ejb.PromotionEJB;
import entity.Promotion;
import java.util.*;
import javax.enterprise.inject.Model;
import javax.inject.Inject;


@Model
public class PromotionMB {
    
    @Inject
    private PromotionEJB PromotionEJB;
    private Promotion promotion = new Promotion();
    //private List<Promotion> listePromotion = new ArrayList<Promotion>();
    

    
    public void doListePromo() {
        promotion = PromotionEJB.creerPromotion(promotion);
        //listePromotion = PromotionEJB.findPromotion();
    }

     public void doAjouterPromo() {
        promotion = PromotionEJB.creerPromotion(promotion);
        //listePromotion = PromotionEJB.findPromotion();
    }
     
     public List<Promotion> getListePromotion(){
         return PromotionEJB.findPromotion();
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
     
     
    public PromotionMB() {
    }
}
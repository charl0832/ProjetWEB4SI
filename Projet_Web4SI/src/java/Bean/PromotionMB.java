package Bean;

import entity.Projet;
import Ejb.PromotionEJB;
import java.util.*;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

@Named(value = "promotion")
@Dependent
public class PromotionMB {
    
    @Inject
    private PromotionEJB PromotionEJB;
    private Projet promotion = new Promotion();
    private List<Promotion> listePromotion = new ArrayList<Promotion>();

    public void doListePromo() {
        promotion = PromotionEJB.creerPromotion(promotion);
        listePromotion = PromotionEJB.findPromotion();
    }

    public PromotionMB() {
        
        
    }
}
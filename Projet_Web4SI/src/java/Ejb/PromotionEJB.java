package Ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import entity.Promotion;
 
@Stateless
public class PromotionEJB {
    
    @PersistenceContext(unitName="Projet_Web4SIPU")
    private EntityManager em;
    
    
    public Promotion creerPromotion(Promotion promotion) {
        em.persist(promotion);
        return promotion;
    }    
   
    public List<Promotion> findPromotion() {
        TypedQuery<Promotion> q = em.createNamedQuery("findAllPromotion", Promotion.class);
        return q.getResultList();
    }
}

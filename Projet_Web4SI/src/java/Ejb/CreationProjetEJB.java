
package Ejb;

import entity.Projet;
import entity.Promotion;
import java.util.List;
import javax.enterprise.inject.Model;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Model
public class CreationProjetEJB {
        @PersistenceContext(unitName="Projet_Web4SIPU")
    private EntityManager em;
    
    public Projet creerProjet(Projet projet) {
        em.persist(projet);
        return projet;
    }    
   
    public List<Projet> findProjets() {
        TypedQuery<Projet> q = em.createNamedQuery("findAllProjets", Projet.class);
        return q.getResultList();
    }
    
    public Promotion creerPromotion(Promotion promotion) {
        em.persist(promotion);
        return promotion;
    }    
   
    public List<Promotion> findPromotion() {
        TypedQuery<Promotion> q = em.createNamedQuery("findAll", Promotion.class);
        return q.getResultList();
    }
}

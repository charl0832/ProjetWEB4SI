package Ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import entity.Projet;
 
@Stateless
public class ProjetEJB {
    
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
}

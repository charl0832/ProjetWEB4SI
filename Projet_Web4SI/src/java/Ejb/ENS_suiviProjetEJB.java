/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejb;
import entity.Groupe;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author Elodie
 */
@Stateless
public class ENS_suiviProjetEJB {
    @PersistenceContext(unitName="Projet_Web4SIPU")
    private EntityManager em;
    
    public Groupe creerGroupe(Groupe groupe) {
        em.persist(groupe);
        return groupe;
    }    
   
    public List<Groupe> findGroupe() {
        TypedQuery<Groupe> q = em.createNamedQuery("findAll", Groupe.class);
        return q.getResultList();
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejb;

import entity.Personne;
import entity.Personne_;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Elodie
 */
@Stateless
public class IndexEJB {

    @PersistenceContext(unitName = "Projet_Web4SIPU")
    private EntityManager em;

    public boolean verifLogin(String login, String passwd) {
        try {
            CriteriaBuilder cb= em.getCriteriaBuilder();
            CriteriaQuery<Personne> q = cb.createQuery(Personne.class);
            Root<Personne> pers = q.from(Personne.class);
            q.where(cb.and( cb.equal(pers.get(Personne_.id_user),login), cb.equal(pers.get(Personne_.pw_user),passwd)));
            q.select(pers);
//            query.setParameter(":login", login);
//            query.setParameter(":passwd", passwd);

            
            TypedQuery<Personne> query = em.createQuery(q);
            query.getSingleResult();

        } catch (NoResultException e) {
            System.out.println("Erreur connexion");
            return false;
        }
        return true;
    }
}

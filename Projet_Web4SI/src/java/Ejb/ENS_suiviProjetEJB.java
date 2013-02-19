/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejb;
import entity.Groupe;
import entity.GroupeProjet;
import entity.GroupeProjet_;
import entity.Groupe_;
import entity.Phase;
import entity.Phase_;
import entity.Projet;
import entity.Projet_;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;

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
    
    public Root groupePhase(Integer n_groupe) {
        
            CriteriaBuilder cb= em.getCriteriaBuilder();
            CriteriaQuery<Phase> qphase = cb.createQuery(Phase.class);
          //  Root<Phase> phase_ = qphase.from(Phase.class);
            Root<Phase> phase = qphase.from(Phase.class);
            Join<Phase,Groupe> projet = phase.join(Phase_.idProjet).join(GroupeProjet_.idProjet).join(Groupe_.idGroupe) ;
            //Join<Projet,GroupeProjet> gprojet = projet.join(GroupeProjet_.idProjet) ;
            //Join<GroupeProjet,Groupe> groupe = groupe.join(Groupe_.idGroupe) ;
            qphase.where(cb.equal(phase.get(Groupe_.idGroupe),n_groupe)).select(phase);
        
            
            return phase ;
            
        
    }
}

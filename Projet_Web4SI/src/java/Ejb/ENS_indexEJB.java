/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Elodie
 */
@Stateless
public class ENS_indexEJB {
    @PersistenceContext(unitName = "Projet_Web4SIPU")
    private EntityManager em;
    
}

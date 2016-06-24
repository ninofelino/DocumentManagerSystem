/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.Zdocperubahan;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hp
 */
@Stateless
public class ZdocperubahanFacade extends AbstractFacade<Zdocperubahan> {

    @PersistenceContext(unitName = "com.dcms.documentPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ZdocperubahanFacade() {
        super(Zdocperubahan.class);
    }
    
}

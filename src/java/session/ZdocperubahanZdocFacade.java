/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.ZdocperubahanZdoc;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hp
 */
@Stateless
public class ZdocperubahanZdocFacade extends AbstractFacade<ZdocperubahanZdoc> {

    @PersistenceContext(unitName = "com.dcms.documentPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ZdocperubahanZdocFacade() {
        super(ZdocperubahanZdoc.class);
    }
    
}

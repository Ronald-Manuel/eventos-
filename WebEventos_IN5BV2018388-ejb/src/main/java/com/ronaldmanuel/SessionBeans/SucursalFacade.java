/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ronaldmanuel.SessionBeans;

import com.ronaldmanuel.Entities.Sucursal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ronpx
 */
@Stateless
public class SucursalFacade extends AbstractFacade<Sucursal> implements SucursalFacadeLocal {

    @PersistenceContext(unitName = "WebEventos_IN5BV2018388-ejp-PU1")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SucursalFacade() {
        super(Sucursal.class);
    }
    
}

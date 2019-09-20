/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ronaldmanuel.SessionBeans;

import com.ronaldmanuel.Entities.Tipoproductos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ronpx
 */
@Local
public interface TipoproductosFacadeLocal {

    void create(Tipoproductos tipoproductos);

    void edit(Tipoproductos tipoproductos);

    void remove(Tipoproductos tipoproductos);

    Tipoproductos find(Object id);

    List<Tipoproductos> findAll();

    List<Tipoproductos> findRange(int[] range);

    int count();
    
}

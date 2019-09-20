/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ronaldmanuel.SessionBeans;

import com.ronaldmanuel.Entities.Reservacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ronpx
 */
@Local
public interface ReservacionFacadeLocal {

    void create(Reservacion reservacion);

    void edit(Reservacion reservacion);

    void remove(Reservacion reservacion);

    Reservacion find(Object id);

    List<Reservacion> findAll();

    List<Reservacion> findRange(int[] range);

    int count();
    
}

package com.ronaldmanuel.Entities;

import com.ronaldmanuel.Entities.Cliente;
import com.ronaldmanuel.Entities.Cotizacion;
import com.ronaldmanuel.Entities.Motivoreservacion;
import com.ronaldmanuel.Entities.Salon;
import com.ronaldmanuel.Entities.Sucursal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T13:50:11")
@StaticMetamodel(Reservacion.class)
public class Reservacion_ { 

    public static volatile ListAttribute<Reservacion, Cotizacion> cotizacionList;
    public static volatile SingularAttribute<Reservacion, Salon> idsalon;
    public static volatile SingularAttribute<Reservacion, Date> fechainicial;
    public static volatile SingularAttribute<Reservacion, Sucursal> idsucursal;
    public static volatile SingularAttribute<Reservacion, Motivoreservacion> idmotivoreservacion;
    public static volatile SingularAttribute<Reservacion, Integer> idreservacion;
    public static volatile SingularAttribute<Reservacion, Date> fechafinal;
    public static volatile SingularAttribute<Reservacion, Cliente> idcliente;

}
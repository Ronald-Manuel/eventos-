package com.ronaldmanuel.Entities;

import com.ronaldmanuel.Entities.Reservacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T13:50:11")
@StaticMetamodel(Motivoreservacion.class)
public class Motivoreservacion_ { 

    public static volatile SingularAttribute<Motivoreservacion, String> casamiento;
    public static volatile SingularAttribute<Motivoreservacion, String> otro;
    public static volatile SingularAttribute<Motivoreservacion, Integer> idmotivoreservacion;
    public static volatile SingularAttribute<Motivoreservacion, String> reuniontrabajo;
    public static volatile ListAttribute<Motivoreservacion, Reservacion> reservacionList;
    public static volatile SingularAttribute<Motivoreservacion, String> cumpleanios;

}
package com.ronaldmanuel.Entities;

import com.ronaldmanuel.Entities.Detallecotizacion;
import com.ronaldmanuel.Entities.Tipoproductos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T13:50:11")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile SingularAttribute<Productos, String> descripcion;
    public static volatile SingularAttribute<Productos, Integer> idproductos;
    public static volatile ListAttribute<Productos, Detallecotizacion> detallecotizacionList;
    public static volatile SingularAttribute<Productos, Tipoproductos> idtipoproductos;

}
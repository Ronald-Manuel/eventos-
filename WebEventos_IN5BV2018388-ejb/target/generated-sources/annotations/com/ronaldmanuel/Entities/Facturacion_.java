package com.ronaldmanuel.Entities;

import com.ronaldmanuel.Entities.Cotizacion;
import com.ronaldmanuel.Entities.Detallefactura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T13:50:11")
@StaticMetamodel(Facturacion.class)
public class Facturacion_ { 

    public static volatile SingularAttribute<Facturacion, String> descripcion;
    public static volatile ListAttribute<Facturacion, Detallefactura> detallefacturaList;
    public static volatile SingularAttribute<Facturacion, Cotizacion> idcotizacion;
    public static volatile SingularAttribute<Facturacion, Integer> idfacturacion;

}
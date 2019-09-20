package com.ronaldmanuel.Entities;

import com.ronaldmanuel.Entities.Reservacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T13:50:11")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> telefonocliente;
    public static volatile SingularAttribute<Cliente, String> nit;
    public static volatile SingularAttribute<Cliente, Integer> idcliente;
    public static volatile SingularAttribute<Cliente, String> nombrecliente;
    public static volatile SingularAttribute<Cliente, String> apellidoscliente;
    public static volatile ListAttribute<Cliente, Reservacion> reservacionList;
    public static volatile SingularAttribute<Cliente, String> email;

}
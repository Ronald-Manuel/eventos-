/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ronaldmanuel.Entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ronpx
 */
@Entity
@Table(name = "tipoproductos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoproductos.findAll", query = "SELECT t FROM Tipoproductos t")
    , @NamedQuery(name = "Tipoproductos.findByIdtipoproductos", query = "SELECT t FROM Tipoproductos t WHERE t.idtipoproductos = :idtipoproductos")
    , @NamedQuery(name = "Tipoproductos.findByDescpripcion", query = "SELECT t FROM Tipoproductos t WHERE t.descpripcion = :descpripcion")})
public class Tipoproductos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipoproductos")
    private Integer idtipoproductos;
    @Size(max = 45)
    @Column(name = "descpripcion")
    private String descpripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtipoproductos")
    private List<Productos> productosList;

    public Tipoproductos() {
    }

    public Tipoproductos(Integer idtipoproductos) {
        this.idtipoproductos = idtipoproductos;
    }

    public Integer getIdtipoproductos() {
        return idtipoproductos;
    }

    public void setIdtipoproductos(Integer idtipoproductos) {
        this.idtipoproductos = idtipoproductos;
    }

    public String getDescpripcion() {
        return descpripcion;
    }

    public void setDescpripcion(String descpripcion) {
        this.descpripcion = descpripcion;
    }

    @XmlTransient
    public List<Productos> getProductosList() {
        return productosList;
    }

    public void setProductosList(List<Productos> productosList) {
        this.productosList = productosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoproductos != null ? idtipoproductos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoproductos)) {
            return false;
        }
        Tipoproductos other = (Tipoproductos) object;
        if ((this.idtipoproductos == null && other.idtipoproductos != null) || (this.idtipoproductos != null && !this.idtipoproductos.equals(other.idtipoproductos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ronaldmanuel.Entities.Tipoproductos[ idtipoproductos=" + idtipoproductos + " ]";
    }
    
}

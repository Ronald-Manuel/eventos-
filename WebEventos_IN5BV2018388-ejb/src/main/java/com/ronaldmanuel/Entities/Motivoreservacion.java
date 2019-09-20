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
@Table(name = "motivoreservacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Motivoreservacion.findAll", query = "SELECT m FROM Motivoreservacion m")
    , @NamedQuery(name = "Motivoreservacion.findByIdmotivoreservacion", query = "SELECT m FROM Motivoreservacion m WHERE m.idmotivoreservacion = :idmotivoreservacion")
    , @NamedQuery(name = "Motivoreservacion.findByReuniontrabajo", query = "SELECT m FROM Motivoreservacion m WHERE m.reuniontrabajo = :reuniontrabajo")
    , @NamedQuery(name = "Motivoreservacion.findByCasamiento", query = "SELECT m FROM Motivoreservacion m WHERE m.casamiento = :casamiento")
    , @NamedQuery(name = "Motivoreservacion.findByCumpleanios", query = "SELECT m FROM Motivoreservacion m WHERE m.cumpleanios = :cumpleanios")
    , @NamedQuery(name = "Motivoreservacion.findByOtro", query = "SELECT m FROM Motivoreservacion m WHERE m.otro = :otro")})
public class Motivoreservacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmotivoreservacion")
    private Integer idmotivoreservacion;
    @Size(max = 45)
    @Column(name = "reuniontrabajo")
    private String reuniontrabajo;
    @Size(max = 45)
    @Column(name = "casamiento")
    private String casamiento;
    @Size(max = 45)
    @Column(name = "cumpleanios")
    private String cumpleanios;
    @Size(max = 45)
    @Column(name = "otro")
    private String otro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmotivoreservacion")
    private List<Reservacion> reservacionList;

    public Motivoreservacion() {
    }

    public Motivoreservacion(Integer idmotivoreservacion) {
        this.idmotivoreservacion = idmotivoreservacion;
    }

    public Integer getIdmotivoreservacion() {
        return idmotivoreservacion;
    }

    public void setIdmotivoreservacion(Integer idmotivoreservacion) {
        this.idmotivoreservacion = idmotivoreservacion;
    }

    public String getReuniontrabajo() {
        return reuniontrabajo;
    }

    public void setReuniontrabajo(String reuniontrabajo) {
        this.reuniontrabajo = reuniontrabajo;
    }

    public String getCasamiento() {
        return casamiento;
    }

    public void setCasamiento(String casamiento) {
        this.casamiento = casamiento;
    }

    public String getCumpleanios() {
        return cumpleanios;
    }

    public void setCumpleanios(String cumpleanios) {
        this.cumpleanios = cumpleanios;
    }

    public String getOtro() {
        return otro;
    }

    public void setOtro(String otro) {
        this.otro = otro;
    }

    @XmlTransient
    public List<Reservacion> getReservacionList() {
        return reservacionList;
    }

    public void setReservacionList(List<Reservacion> reservacionList) {
        this.reservacionList = reservacionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmotivoreservacion != null ? idmotivoreservacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Motivoreservacion)) {
            return false;
        }
        Motivoreservacion other = (Motivoreservacion) object;
        if ((this.idmotivoreservacion == null && other.idmotivoreservacion != null) || (this.idmotivoreservacion != null && !this.idmotivoreservacion.equals(other.idmotivoreservacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ronaldmanuel.Entities.Motivoreservacion[ idmotivoreservacion=" + idmotivoreservacion + " ]";
    }
    
}

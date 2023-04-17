package com.ProyectoPaginaWeb.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "articulo")
public class Tienda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArticulo;
    String nomArticulo;
    String detalle;
    double precio;

    public Tienda(String nomArticulo, String detalle, double precio) {
        this.nomArticulo = nomArticulo;
        this.detalle = detalle;
        this.precio = precio;
    }
    
    
    
}

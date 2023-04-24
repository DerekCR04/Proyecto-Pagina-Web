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
@Table(name="cliente")
public class Historial implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    String nombre;
    String apellidos;
    String correo;
    String telefono;
    String hora;
    String fecha;

    public Historial(String nombre, String apellidos, String correo, String telefono, String hora, String fecha) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.hora = hora;
        this.fecha = fecha;
    }

    public Historial() {
   }
    
    
}

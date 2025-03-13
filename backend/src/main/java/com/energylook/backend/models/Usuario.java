package com.energylook.backend.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String email;
    private String constrasena;
    private Date fecha_creacion;
    private Date ultima_entrada;

    public Usuario() {}

    public Usuario(String nombre, String email,String contrasena, Date fecha_creacion, Date ultima_entrada) {
        this.nombre = nombre;
        this.email = email;
        this.constrasena = contrasena;
        this.fecha_creacion = fecha_creacion;
        this.ultima_entrada = ultima_entrada;

    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConstrasena() {
        return constrasena;
    }

    public void setConstrasena(String constrasena) {
        this.constrasena = constrasena;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Date getUltima_entrada() {
        return ultima_entrada;
    }

    public void setUltima_entrada(Date ultima_entrada) {
        this.ultima_entrada = ultima_entrada;
    }
}

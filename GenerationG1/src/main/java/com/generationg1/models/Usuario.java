package com.generationg1.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="usuarios")

public class Usuario {
    //
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(min=3, max=20)//limita la cantidad de caracteres
    private String nombre;

    @NotNull()
    @Size(min=6, max=8)
    private String password;

    private String apellido;
    private Integer edad;



    //constructor vacio
    public Usuario() {

        super();
    }
    //constructor con parametros

    public Usuario(String nombre, String apellido, Integer edad, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.password = password;
    }

    //Getters & Setters

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}

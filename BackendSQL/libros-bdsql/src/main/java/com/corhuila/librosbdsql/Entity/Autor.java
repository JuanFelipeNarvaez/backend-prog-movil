package com.corhuila.librosbdsql.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "autor")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    private String apellido;

    @Column(name = "nacionalidad", nullable = false)
    private String nacionalidad;

    @Column(name = "fecha_de_nacimiento")
    private LocalDate fecha_De_Nacimiento;

    @Column(name = "biografia", nullable = false)
    private String biografia;

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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public LocalDate getFecha_De_Nacimiento() {
        return fecha_De_Nacimiento;
    }

    public void setFecha_De_Nacimiento(LocalDate fecha_De_Nacimiento) {
        this.fecha_De_Nacimiento = fecha_De_Nacimiento;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
}

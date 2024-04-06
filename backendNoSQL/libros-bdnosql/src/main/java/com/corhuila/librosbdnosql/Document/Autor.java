package com.corhuila.librosbdnosql.Document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;
import java.util.Date;

@Document(collection = "autor")
public class Autor {
    @Id
    private String id;
    @Field
    private String nombre;

    @Field
    private String apellido;

    @Field
    private String nacionalidad;

    @Field
    private LocalDate fecha_De_Nacimiento;

    @Field
    private String biografia;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

package com.corhuila.librosbdsql.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "libro")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "isbn", nullable = false)
    private String isbn;

    @Column(name = "genero", nullable = false)
    private String genero;

    @Column(name = "año_de_publicacion", nullable = false)
    private int añoDePublicacion;

    @Column(name = "sinopsis", nullable = false)
    private String sinopsis;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "autor_id", nullable = false)
    private Autor autor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAñoDePublicacion() {
        return añoDePublicacion;
    }

    public void setAñoDePublicacion(int añoDePublicacion) {
        this.añoDePublicacion = añoDePublicacion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}

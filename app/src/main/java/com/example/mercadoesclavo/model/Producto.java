package com.example.mercadoesclavo.model;





import java.io.Serializable;

public class Producto implements Serializable {

    private String nombre;
    private String precio;
    private Integer foto;
    private String descripcion;


    public Producto(String nombre, String precio, Integer foto, String descripcion) {
        this.nombre=nombre;
        this.precio=precio;
        this.foto=foto;
        this.descripcion=descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio=precio;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto=foto;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion=descripcion;
    }

}
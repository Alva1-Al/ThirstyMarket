package com.example.mercadoesclavo.Model;

import java.io.Serializable;

public class Producto implements Serializable {

    public String precio;
    public String producto;
    public Integer fotoProducto;


    public Producto( String precio, String producto, Integer fotoProducto) {

        this.precio=precio;
        this.producto=producto;
        this.fotoProducto=fotoProducto;


    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio){
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto=producto;
    }

    public Integer getFotoProducto() {
        return fotoProducto;
    }

    public void setFotoProducto(Integer fotoProducto) {
        this.fotoProducto=fotoProducto;
    }

}

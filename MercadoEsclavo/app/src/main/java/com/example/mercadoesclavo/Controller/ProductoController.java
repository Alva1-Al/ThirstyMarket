package com.example.mercadoesclavo.Controller;

import com.example.mercadoesclavo.Model.Producto;
import com.example.mercadoesclavo.Model.ProductoDao;

import java.util.List;

public class ProductoController {

    public void traerProductos(final ResultListener listenerDeLaVista) {
        ProductoDao productoDao=new ProductoDao ();
        productoDao.pedirProductos ( new ResultListener<List<Producto>> () {
            @Override
            public void finish(List<Producto> result) {
                listenerDeLaVista.finish ( result );
            }
        } );

    }
}

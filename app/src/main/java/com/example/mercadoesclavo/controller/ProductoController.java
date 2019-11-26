package com.example.mercadoesclavo.controller;

import com.example.mercadoesclavo.ResultListener;
import com.example.mercadoesclavo.model.DaoProducto;
import com.example.mercadoesclavo.model.Producto;

import java.util.List;

public class ProductoController {


    public void mostrarProductos(final ResultListener listenerDeLaVista) {

        DaoProducto daoProducto = new DaoProducto ();
        daoProducto.mostrarProductos (new ResultListener<List<Producto>>() {
            @Override
            public void finish(List<Producto> result) {
                listenerDeLaVista.finish(result);
            }
        });

    }
}








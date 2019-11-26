package com.example.mercadoesclavo.Model;

import com.example.mercadoesclavo.Controller.ResultListener;
import com.example.mercadoesclavo.R;

import java.util.ArrayList;
import java.util.List;

public class ProductoDao {

    public void pedirProductos(ResultListener<List<Producto>> listenerDelController){
        List<Producto> productos = new ArrayList<> ();
        productos.add(new Producto ( "$890", "Barba Azul Bonarda", R.drawable.barbazul ));
        productos.add ( new Producto ( "$560", "Altiplano Malbec", R.drawable.altiplano) );
        productos.add ( new Producto ( "$990", "Luigi Bosca Cavernet", R.drawable.vinito ));

        listenerDelController.finish(productos);
    }
}

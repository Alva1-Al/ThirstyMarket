package com.example.mercadoesclavo.model;

import com.example.mercadoesclavo.R;
import com.example.mercadoesclavo.ResultListener;

import java.util.ArrayList;
import java.util.List;

public class DaoProducto {

    public void mostrarProductos(ResultListener<List<Producto>> listenerDelCOntroller) {
        List<Producto> producto = new ArrayList<> ();
        producto.add ( new Producto ( "Luigi Bosca", "$890", R.drawable.luigibosca, "Gran Corte, estacionado en barrica de Roble") );
        producto.add ( new Producto ( "Barba Azul", "$960", R.drawable.barbazul, "El Aroma a frutos rojos y canela hace la diferencia" ) );
        producto.add ( new Producto ( "Angelica Zapata", "$1270", R.drawable.angelicazapata, "Conservado en barricas de Roble, su aroma es indescriptible, solo tienes que probarlo" ) );
        producto.add (new Producto  ( "El Esteco Bonarda", "$965", R.drawable.esteco, "Perfumado con finos toques de chocolate, que hacen únicos su desemboltura en el paladar"));
        producto.add ( new Producto ( "Chandon Chardonnay", "$1078", R.drawable.chandon, "Denominación de origen" ) );
        producto.add ( new Producto ( "Pulenta Tomo 1", "$1230", R.drawable.pulenta, "El aroma a frutos silvestres hace de este vino un fiel compañero de carne rojas" ) );
        producto.add ( new Producto ( "Zuccardi Gran Crue", "$1680", R.drawable.zuccardi, "Este gran Crue, es la combinación perfecta de las mejores uvas del valle de Uco" ) );


        listenerDelCOntroller.finish(producto);
    }


}
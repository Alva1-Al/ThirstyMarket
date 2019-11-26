package com.example.mercadoesclavo.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.mercadoesclavo.R;
import com.example.mercadoesclavo.model.Producto;

public class FragmentProductos extends Fragment  {

    public static final String CLAVE_PRODUCTO="codigoDelProducto";

    private TextView textViewNombre;
    private TextView textViewPrecio;
    private ImageView imageViewFoto;
    private TextView textViewDescripcion;



    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate ( R.layout.fragment_detalles_productos, container, false );
        textViewNombre=view.findViewById ( R.id.fragmentproductos_TextView_nombre);
        textViewPrecio=view.findViewById ( R.id.fragmentproductos_TextView_Precio);
        textViewDescripcion = view.findViewById ( R.id.fragmentproductos_TextView_Descripcion);
        imageViewFoto=view.findViewById ( R.id.fragmetproductos_ImageView_foto );
         Bundle bundle = getArguments ();
         Producto producto =(Producto) bundle.getSerializable (CLAVE_PRODUCTO );
        imageViewFoto.setImageResource ( producto.getFoto () );
       textViewNombre.setText ( producto.getNombre () );
      textViewPrecio.setText ( producto.getPrecio () );
      textViewDescripcion.setText ( producto.getDescripcion () );
        return view;
    }
}

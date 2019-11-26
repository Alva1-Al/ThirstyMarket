package com.example.mercadoesclavo.view;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mercadoesclavo.Model.Producto;
import com.example.mercadoesclavo.R;

import java.util.ArrayList;
import java.util.List;

public class ProductosAdapter extends RecyclerView.Adapter<ProductosAdapter.ViewHolderProductos> {

    private final List<Producto> listaDeProductos;
    private List<ProductosAdapter> listaProductos=new ArrayList<> ();
    private ListenerDelAdapter listenerDelAdapter;


    public ProductosAdapter(List<Producto> listaDeProductos) {
        this.listaDeProductos=listaDeProductos;
    }

    public ProductosAdapter(ListenerDelAdapter listenerDelAdapter) {
        listaDeProductos=new ArrayList<> ();
        this.listenerDelAdapter=listenerDelAdapter;
    }

    @NonNull

    @Override

    public ViewHolderProductos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from ( parent.getContext () );
        View vistaDeLaCelda=layoutInflater.inflate ( R.layout.celda_productos, parent, false );

        return new ViewHolderProductos ( vistaDeLaCelda );
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderProductos holder, int position) {
        Producto mostrarProducto=listaDeProductos.get ( position );
        holder.cargarProducto ( mostrarProducto );
    }


    @Override
    public int getItemCount() {
        return listaProductos.size ();
    }

    public void setListaProductos(List<Producto> productoList) {
        this.listaProductos=listaProductos;
    }

    public interface ListenerDelAdapter {
        void mostrarProductoElegido(Producto productoElegido);
    }

    public static class ViewHolderProductos extends RecyclerView.ViewHolder {

       // private final Object View;
        private TextView textViewNombreProducto;
        private TextView textViewPrecio;
        private ImageView imageViewFotoProducto;
        private View itemView;

        public ViewHolderProductos(@NonNull View itemView) {
            super ( itemView );
            textViewPrecio=itemView.findViewById ( R.id.celdaProductos_precio );
            textViewNombreProducto=itemView.findViewById ( R.id.celdaProductos_nombre );
            imageViewFotoProducto=itemView.findViewById ( R.id.celdaProductos_foto );
            //      imageViewFotoProducto.setOnClickListener ( View ){
            //  Producto productoElegido = listaProductos.get ( getAdapterPosition () );
            // listenerDelAdapter.mostrarProductoElegido(productoElegido);

        }

        // public void imageViewFotoProducto(Producto mostrarProducto) {
        //});


        public void cargarProducto(Producto producto) {
            textViewNombreProducto.setText ( producto.getProducto () );
            textViewPrecio.setText ( producto.getPrecio () );
            imageViewFotoProducto.setImageResource ( producto.getFotoProducto () );
        }


        public interface ListenerDelAdapter {

            void mostrarProductoElegido(ProductosAdapter productoElegido);
        }

    }
}

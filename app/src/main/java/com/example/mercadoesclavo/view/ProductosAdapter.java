package com.example.mercadoesclavo.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mercadoesclavo.R;
import com.example.mercadoesclavo.model.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductosAdapter extends RecyclerView.Adapter<ProductosAdapter.ViewHolderProductos> {
    private List<Producto> productoList;
    private ListenerDelAdapter listenerDelAdapter;


    public ProductosAdapter(List<Producto> productoList){
        this.productoList = productoList;
    }
    public ProductosAdapter(ListenerDelAdapter listenerDelAdapter){
        productoList = new ArrayList<> ();
        this.listenerDelAdapter = listenerDelAdapter;
    }

      @Override
    public ViewHolderProductos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
          LayoutInflater layoutInflater=LayoutInflater.from ( parent.getContext () );
          View vistaDeLaCelda=layoutInflater.inflate ( R.layout.celda_producto, parent, false );
          return new ViewHolderProductos ( vistaDeLaCelda );
      }

      @Override
    public void onBindViewHolder(@NonNull ViewHolderProductos holder,int position) {
        Producto productoAMostrar = productoList.get ( position);
        holder.cargarProducto(productoAMostrar);
    }

    @Override
    public int getItemCount() {
        return productoList.size ();
    }

    public void setProductoList(List<Producto> productoList){
        this.productoList = productoList;
        notifyDataSetChanged ();
    }

    public class ViewHolderProductos extends RecyclerView.ViewHolder{
        private TextView textViewNombre;
        private  TextView textViewPrecio;
        private ImageView imageViewFoto;
        private TextView textViewDescripcion;

        public ViewHolderProductos (@NonNull View itemView){
            super(itemView);
            textViewNombre = itemView.findViewById ( R.id.celdaProducto_TextView_nombre );
            textViewPrecio = itemView.findViewById ( R.id.celdaProducto_TextView_precio );
            textViewDescripcion = itemView.findViewById ( R.id.celdaProducto_TextView_Descripcion );
            imageViewFoto = itemView.findViewById ( R.id.celdaProducto_ImageView_foto );
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Producto productoElegido = productoList.get(getAdapterPosition());
                    listenerDelAdapter.productoElegido(productoElegido);
                }
            });
        }

        public void cargarProducto(Producto producto) {
            textViewPrecio.setText ( producto.getPrecio () );
            textViewNombre.setText ( producto.getNombre () );
            imageViewFoto.setImageResource ( producto.getFoto () );
            textViewDescripcion.setText ( producto.getDescripcion ()  );
        }
    }

    public interface ListenerDelAdapter {
       public void productoElegido (Producto producto);
    }
}

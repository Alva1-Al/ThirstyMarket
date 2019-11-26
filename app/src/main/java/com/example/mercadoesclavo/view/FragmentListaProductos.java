package com.example.mercadoesclavo.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mercadoesclavo.R;
import com.example.mercadoesclavo.ResultListener;
import com.example.mercadoesclavo.controller.ProductoController;
import com.example.mercadoesclavo.model.Producto;

import java.util.List;



    public class FragmentListaProductos extends Fragment implements ProductosAdapter.ListenerDelAdapter {

        private RecyclerView recyclerView;
        private ListenerDelFragment listenerDelFragment;



        @Override

        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            View view = inflater.inflate ( R.layout.fragmentlista_productos, container, false );
            recyclerView = view.findViewById ( R.id.fragmentlista_productos_Recycler );
            final ProductosAdapter productosAdapter = new ProductosAdapter ( this );
            ProductoController productoController = new ProductoController ();
            productoController.mostrarProductos ( new ResultListener<List<Producto>> () {
                @Override
                public void finish(List<Producto> result) {
                    productosAdapter.setProductoList (result);
                }
            } );

            recyclerView.setLayoutManager ( new LinearLayoutManager ( getContext (), RecyclerView.VERTICAL, false ) );
            recyclerView.setAdapter ( productosAdapter );

            return view;
        }
        public  void onAttach(@NonNull Context context) {
            super.onAttach(context);
            listenerDelFragment= (ListenerDelFragment) context;
        }



        @Override
        public void productoElegido(Producto producto) {
            listenerDelFragment.mostrarProducto ( producto );
        }


        public interface ListenerDelFragment {
            void mostrarProducto(Producto producto);
        }
    }



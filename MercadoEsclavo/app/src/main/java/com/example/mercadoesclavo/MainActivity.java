package com.example.mercadoesclavo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mercadoesclavo.Model.Producto;

public class MainActivity extends AppCompatActivity {

    //private RecyclerView recyclerViewProductos;





    public void recibirProducto(Producto producto){

            FragmentProductos fragmentProductos = new FragmentProductos ();
            Bundle bundle = new Bundle();
            bundle.putSerializable(FragmentProductos.CLAVE_PRODUCTOS, producto);
            fragmentProductos.setArguments(bundle);
           // pegarFragment( FragmentProductos);


        }
    }





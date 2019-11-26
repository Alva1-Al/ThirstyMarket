package com.example.mercadoesclavo;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.mercadoesclavo.model.Producto;
import com.example.mercadoesclavo.view.FragmentListaProductos;
import com.example.mercadoesclavo.view.FragmentProductos;
import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity implements FragmentListaProductos.ListenerDelFragment, NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        pegarFragment ( new FragmentListaProductos () );

        encontrarVistas ();

        navigationView.setNavigationItemSelectedListener ( this );
        navigationView.setNavigationItemSelectedListener ( new NavigationView.OnNavigationItemSelectedListener () {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                selectedMenuItem ( menuItem );
                return true;
            }
        } );
    }
    private void encontrarVistas() {
            drawerLayout=findViewById ( R.id.drawerLayout );
            navigationView=findViewById ( R.id.navigationView );
        }

            @Override
            public boolean onNavigationItemSelected (@NonNull MenuItem menuItem){
                selectedMenuItem ( menuItem);
                return true;
            }

        private boolean selectedMenuItem(MenuItem item)   {
        switch (item.getItemId ()){

            case R.id.menu_cosecha:
                Toast.makeText ( this, "Cosechado en ++ ", Toast.LENGTH_SHORT ).show ();
                break;
            case R.id.menu_Provincia:
                Toast.makeText ( this, "Provincia de ++ ", Toast.LENGTH_SHORT ).show ();
                break;
            case R.id.menu_uva:
                Toast.makeText ( this, "Uva ++ ", Toast.LENGTH_SHORT ).show ();
                break;
        }
                 drawerLayout.closeDrawers ();

        return true;


    }

    private void pegarFragment(Fragment fragment) {
        getSupportFragmentManager ()
                .beginTransaction ()
                .replace ( R.id.mainActivity_conteiner, fragment )
                .addToBackStack ( null )
                .commit ();
    }


    @Override
    public void mostrarProducto(Producto producto) {
        FragmentProductos fragmentProductos=new FragmentProductos ();
        Bundle bundle=new Bundle ();
        bundle.putSerializable ( FragmentProductos.CLAVE_PRODUCTO, producto );
        fragmentProductos.setArguments ( bundle );
        pegarFragment ( fragmentProductos );
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }


}



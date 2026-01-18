package com.miapp.mapas;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        Intent intent = new Intent(this, MapActivity.class);

        switch(item.getItemId()){
            case R.id.lugar1:
                intent.putExtra("nombre", "Plaza Principal");
                intent.putExtra("lat", 32.525);  // reemplaza con coordenadas reales
                intent.putExtra("lng", -117.033);
                break;
            case R.id.lugar2:
                intent.putExtra("nombre", "Parque Central");
                intent.putExtra("lat", 32.530);
                intent.putExtra("lng", -117.030);
                break;
            case R.id.lugar3:
                intent.putExtra("nombre", "Centro Comercial");
                intent.putExtra("lat", 32.527);
                intent.putExtra("lng", -117.035);
                break;
            case R.id.lugar4:
                intent.putExtra("nombre", "Estadio Local");
                intent.putExtra("lat", 32.526);
                intent.putExtra("lng", -117.038);
                break;
        }

        startActivity(intent);
        return true;
    }
}

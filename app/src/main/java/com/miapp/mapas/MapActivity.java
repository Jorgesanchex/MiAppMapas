package com.miapp.mapas;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.*;

public class MapActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private String nombreLugar;
    private double lat, lng;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        nombreLugar = getIntent().getStringExtra("nombre");
        lat = getIntent().getDoubleExtra("lat", 0);
        lng = getIntent().getDoubleExtra("lng", 0);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap){
        mMap = googleMap;
        LatLng lugar = new LatLng(lat, lng);

        mMap.addMarker(new MarkerOptions()
                .position(lugar)
                .title(nombreLugar)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker_icon)));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lugar, 15));
    }
}

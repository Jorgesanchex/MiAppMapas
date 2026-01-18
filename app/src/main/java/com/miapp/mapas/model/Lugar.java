package com.miapp.mapas.model;

public class Lugar {
    private String nombre;
    private double lat;
    private double lng;

    public Lugar(String nombre, double lat, double lng){
        this.nombre = nombre;
        this.lat = lat;
        this.lng = lng;
    }

    public String getNombre() { return nombre; }
    public double getLat() { return lat; }
    public double getLng() { return lng; }
}

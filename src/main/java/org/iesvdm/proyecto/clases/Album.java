package org.iesvdm.proyecto.clases;

import java.util.ArrayList;

public class Album {
    private String nombre;
    private ArrayList<Cancion> canciones;
    boolean launched;
    public Album(String nombre) {
        this.nombre = nombre;
        canciones=new ArrayList<>();
        launched=false;
    }
    public Album(String nombre, ArrayList<Cancion> canciones) {
        this.nombre = nombre;
        this.canciones = canciones;
    }

    public void add(Cancion c){
        if (!launched)
            canciones.add(c);
    }
    public void remove(Cancion c){
        if (!launched)
            canciones.remove(c);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (!launched)
            this.nombre = nombre;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        if (!launched)
            this.canciones = canciones;
    }
    public void lanzar(){
        if (!launched)
            launched=true;
    }
}

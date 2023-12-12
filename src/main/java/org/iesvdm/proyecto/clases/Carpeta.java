package org.iesvdm.proyecto.clases;

import java.util.HashSet;

class Carpeta {
    private String nombre;
    private HashSet<Cancion> canciones;


    public Carpeta(String nombre) {
        this.nombre = nombre;
        canciones=new HashSet<>();
    }
    public void add(Cancion c){
        canciones.add(c);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(HashSet<Cancion> canciones) {
        this.canciones = canciones;
    }
}

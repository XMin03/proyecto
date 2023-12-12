package org.iesvdm.proyecto.clases;

import java.util.ArrayList;
import java.util.HashSet;

public class Usuario {
    private String id;
    private String nombreCH;
    private String nombreEN;
    private String img;
    private HashSet<Album> albums;
    private HashSet<Cancion> canciones;
    private HashSet<Carpeta> carpetas;
    private HashSet<Usuario> seguidores;
    private HashSet<Usuario> sigue;

    public Usuario(String nombreCH, String nombreEN) {
        id="null";
        this.nombreCH = nombreCH;
        this.nombreEN = nombreEN;
        img="default";
        albums=new HashSet<>();
        canciones=new HashSet<>();
        carpetas=new HashSet<>();
        seguidores=new HashSet<>();
        sigue=new HashSet<>();
    }
    public String getId() {
        return id;
    }

    public String getNombreCH() {
        return nombreCH;
    }

    public void setNombreCH(String nombreCH) {
        this.nombreCH = nombreCH;
    }

    public String getNombreEN() {
        return nombreEN;
    }

    public void setNombreEN(String nombreEN) {
        this.nombreEN = nombreEN;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public HashSet<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(HashSet<Album> albums) {
        this.albums = albums;
    }

    public HashSet<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(HashSet<Cancion> canciones) {
        this.canciones = canciones;
    }

    public HashSet<Carpeta> getCarpetas() {
        return carpetas;
    }

    public void setCarpetas(HashSet<Carpeta> carpetas) {
        this.carpetas = carpetas;
    }

    public HashSet<Usuario> getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(HashSet<Usuario> seguidores) {
        this.seguidores = seguidores;
    }

    public HashSet<Usuario> getSigue() {
        return sigue;
    }

    public void setSigue(HashSet<Usuario> sigue) {
        this.sigue = sigue;
    }
}

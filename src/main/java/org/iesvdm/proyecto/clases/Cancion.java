package org.iesvdm.proyecto.clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public class Cancion {
    private String id;
    private String nombreCH;
    private String nombreEN;
    private HashSet<Album> album;
    private String compositor;
    private String arreglista;
    private String letrista;
    private String productor;
    private Usuario cantante_Original;
    private int duracionS;
    private String estilo;
    private LocalDate fecha_pub;
    private String idioma;
    private ArrayList<String> lyrics;
    boolean launched;

    public Cancion(String nombreCH, String nombreEN, String compositor, String arreglista, String letrista, String productor, Usuario cantante_Original) {
        this.nombreCH = nombreCH;
        this.nombreEN = nombreEN;
        this.compositor = compositor;
        this.arreglista = arreglista;
        this.letrista = letrista;
        this.productor = productor;
        this.cantante_Original = cantante_Original;
        duracionS =300; //calculated
        fecha_pub=LocalDate.now();
    }

    public Cancion(String nombreCH, String nombreEN, String compositor, String arreglista, String letrista, String productor, Usuario cantante_Original, LocalDate fecha_pub,String estilo, String idioma, ArrayList<String> lyrics) {
        this(nombreCH,nombreEN,compositor,arreglista,letrista,productor,cantante_Original);
        this.fecha_pub=fecha_pub;
        this.estilo = estilo;
        this.idioma = idioma;
        this.lyrics = lyrics;
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
    public HashSet<Album> getAlbum() {
        return album;
    }

    public void setAlbum(HashSet<Album> album) {
        this.album = album;
    }
    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public String getArreglista() {
        return arreglista;
    }

    public void setArreglista(String arreglista) {
        this.arreglista = arreglista;
    }

    public String getLetrista() {
        return letrista;
    }

    public void setLetrista(String letrista) {
        this.letrista = letrista;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public Usuario getCantante_Original() {
        return cantante_Original;
    }

    public void setCantante_Original(Usuario cantante_Original) {
        this.cantante_Original = cantante_Original;
    }

    public int getDuracionS() {
        return duracionS;
    }

    public void setDuracionS(int duracionS) {
        this.duracionS = duracionS;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public LocalDate getFecha_pub() {
        return fecha_pub;
    }

    public void setFecha_pub(LocalDate fecha_pub) {
        this.fecha_pub = fecha_pub;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public ArrayList<String> getLyrics() {
        return lyrics;
    }

    public void setLyrics(ArrayList<String> lyrics) {
        this.lyrics = lyrics;
    }
}

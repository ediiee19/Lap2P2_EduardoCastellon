/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap2p2_eduardocastellon;

/**
 *
 * @author caste
 */
public class Articulos {
    //Deberá tener un título, autor, tema, fecha de publicación, acceso en línea  (sí/no). 
    private String titulo;
    private String autor;
    private String tema;
    private String fecha;
    private String acceso;

    public Articulos(String titulo, String autor, String tema, String fecha, String acceso) {
        this.titulo = titulo;
        this.autor = autor;
        this.tema = tema;
        this.fecha = fecha;
        this.acceso = acceso;
    }

    public Articulos() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getAcceso() {
        return acceso;
    }

    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }

    @Override
    public String toString() {
        return "Articulo " + titulo + " por " + autor + " acerca de " + tema + " publicado el " + fecha + "| Acceso virtual" + acceso;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap2p2_eduardocastellon;

/**
 *
 * @author caste
 */
public class Conferencias {
    //Tiene un título, conferencista, fecha, duración, enlace de  acceso. 
    private String titulo;
    private String conferesista;
    private String fecha;
    private String enlace;

    public Conferencias(String titulo, String conferesista, String fecha, String enlace) {
        this.titulo = titulo;
        this.conferesista = conferesista;
        this.fecha = fecha;
        this.enlace = enlace;
    }

    public Conferencias() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConferesista() {
        return conferesista;
    }

    public void setConferesista(String conferesista) {
        this.conferesista = conferesista;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    @Override
    public String toString() {
        return "Conferencia " + titulo + " por " + conferesista + " el dia " + fecha + "| enlace: " + enlace;
    }
    
    
}

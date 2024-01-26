/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap2p2_eduardocastellon;

/**
 *
 * @author caste
 */
public class Cursos {

    //Lo componen un título, instructor, duración en semanas, plataforma  de enseñanza. 
    private String titulo;
    private String instructor;
    private String duracion;
    private String plataforma;

    public Cursos(String titulo, String instructor, String duracion, String plataforma) {
        this.titulo = titulo;
        this.instructor = instructor;
        this.duracion = duracion;
        this.plataforma = plataforma;
    }

    public Cursos() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Cursos: " + titulo + "| instructor: " + instructor + "| duracion de" + duracion + "| en " + plataforma;
    }
    
    

}

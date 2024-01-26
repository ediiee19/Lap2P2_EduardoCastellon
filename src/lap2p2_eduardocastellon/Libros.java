/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap2p2_eduardocastellon;

/**
 *
 * @author caste
 */
public class Libros {
    //Cuenta con un título, autor, género, año de publicación y su disponibilidad (si/no). 
   private String titulo;
   private String autor;
   private String genero;
   private int year;
   private String disp;

    public Libros(String titulo, String autor, String genero, int year, String disp) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.year = year;
        this.disp = disp;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDisp() {
        return disp;
    }

    public void setDisp(String disp) {
        this.disp = disp;
    }

    @Override
    public String toString() {
        return  titulo + " Por " + autor + " del " + genero + " publicado en " + year + "| disponibilidad: " + disp;
    }
   
   
   
}

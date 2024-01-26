/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lap2p2_eduardocastellon;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author caste
 */
public class Lap2P2_EduardoCastellon {

    public static ArrayList<Object> inventario = new ArrayList();

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Usuarios> usuarios = new ArrayList();

        usuarios.add(new Usuarios("EduardoC", "Tinker100", "e"));//estudiante
        usuarios.add(new Usuarios("JavierL", "general300", "p"));//profesor
        usuarios.add(new Usuarios("Rikardo,M", "chinfu20", "b"));//bibliotecario

        boolean menuLogIn = true;
        while (menuLogIn) {
            System.out.println("---Log-In---\n"
                    + "Ingresar nombre de usuario: ");
            String nombre = entrada.nextLine();
            System.out.println("Ingresar contraseña: ");
            String contra = entrada.nextLine();

            boolean usuarioEncon = false;
            boolean contraEncon = false;
            String tipo = "e";
            for (Usuarios usuario : usuarios) {
                if (nombre.equals(usuario.getNombre())) {
                    usuarioEncon = true;
                    if (contra.equals(usuario.getContra())) {
                        contraEncon = true;
                        tipo = usuario.getTipo();
                    }
                }
            }
            if (usuarioEncon && contraEncon) {
                if (tipo.equals("e")) {
                    menuEstudiante();
                }
                if (tipo.equals("p")) {
                    menuProfesor();
                }
                if (tipo.equals("b")) {
                    menuBibliotecario();
                }
            } else {
                usuarioEncon = false;
                contraEncon = false;
                System.out.println("Usuario o contraseña incorrecta");
            }

            boolean salida = true;
            while (salida) {
                System.out.println("desea sali? (si/no)");
                String salir = entrada.nextLine();
                if (salir.equalsIgnoreCase("si")) {
                    System.out.println("Saliendo del programa...");
                    menuLogIn = false;
                    salida = false;
                } else if (salir.equalsIgnoreCase("no")) {
                    salida = false;
                } else {
                    System.out.println("Ingrese una opcion correcta");
                }
            }
        }//fin del while
    }//fin del main

    public static void menuEstudiante() {
        Scanner lea = new Scanner(System.in);
        System.out.println("Bienvenido al menu de estudiante");
        boolean menuE = true;
        while (menuE) {
            System.out.println("1- Listar contenido");
            System.out.println("preione [2] para cerrar session");
            int opc = lea.nextInt();
            switch (opc) {
                case 2: {
                    System.out.println("Cerrando session\n");
                    menuE = false;
                    break;
                }
                case 1: {
                    int indice = 0;
                    listar(indice);
                    break;
                }
            }
        }
    }// fin menu de estudiante

    public static void menuProfesor() {
        Scanner lea = new Scanner(System.in);
        System.out.println("Bienvenido al menu de profesor");
        boolean menuE = true;
        while (menuE) {
            System.out.println("1- Listar contenido\n"
                    + "2- Agregar Libro\n"
                    + "preione [3] para cerrar session");

            int opc = lea.nextInt();
            switch (opc) {
                case 3: {
                    System.out.println("Cerrando session\n");
                    menuE = false;
                    break;
                }
                case 1: {
                    int indice = 0;
                    listar(indice);
                    break;
                }
                case 2: {
                    agregar();
                    break;
                }
            }
        }
    }//fin de menu profesor

    public static void menuBibliotecario() {
        Scanner lea = new Scanner(System.in);
        System.out.println("Bienvenido al menu de profesor");
        boolean menuE = true;
        while (menuE) {
            System.out.println("1- Listar contenido\n"
                    + "2- Agregar Libro\n"
                    + "preione [3] para cerrar session");

            int opc = lea.nextInt();
            switch (opc) {
                case 3: {
                    System.out.println("Cerrando session\n");
                    menuE = false;
                    break;
                }
                case 1: {
                    int indice = 0;
                    listar(indice);
                    break;
                }
                case 2: {
                    agregar();
                    break;
                }
            }
        }
    }//fin menu bibliotecario

    public static void listar(int indice) {
        if (indice >= inventario.size()) {
            return;
        }
        System.out.println(indice + "- " + inventario.get(indice).toString());
        indice++;
        listar(indice);
    }// fin listar

    public static void agregar() {
        Scanner lea = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        boolean agregar = true;
        while (agregar) {
            System.out.println("que desea agregar?\n"
                    + "1- Libros\n"
                    + "2- Articulos\n"
                    + "3- Cursos\n"
                    + "4- Conferencias\n"
                    + "presione [5] para salir");
            int opc = lea.nextInt();
            switch (opc) {
                case 5: {
                    System.out.println("Saliendo...");
                    agregar = false;
                    break;
                }
                case 1: {
                    System.out.println("Ingresar titulo: ");
                    String titulo = entrada.nextLine();
                    System.out.println("Ingresar autor: ");
                    String autor = entrada.nextLine();
                    System.out.println("Ingresar genero: ");
                    String genero = entrada.nextLine();
                    System.out.println("Ingresar año: ");
                    String year = entrada.nextLine();
                    inventario.add((Libros) new Libros(titulo, autor, genero, year, "si"));
                    break;
                }
                case 2: {
                    System.out.println("Ingresar titulo: ");
                    String titulo = entrada.nextLine();
                    System.out.println("Ingresar autor: ");
                    String autor = entrada.nextLine();
                    System.out.println("Ingresar tema: ");
                    String tema = entrada.nextLine();
                    System.out.println("Ingresar fecha de publicacion: ");
                    String fecha = entrada.nextLine();
                    inventario.add((Articulos) new Articulos(titulo, autor, tema, fecha, "si"));
                    break;
                }
                case 3: {
                    System.out.println("Ingresar titulo: ");
                    String titulo = entrada.nextLine();
                    System.out.println("Ingresar instructor: ");
                    String instructor = entrada.nextLine();
                    System.out.println("Ingresar tema: ");
                    String duracion = entrada.nextLine();
                    System.out.println("Ingresar plataforma ");
                    String plataforma = entrada.nextLine();
                    inventario.add((Cursos) new Cursos(titulo, instructor, duracion, plataforma));
                    break;
                }
                case 4: {
                    System.out.println("Ingresar titulo: ");
                    String titulo = entrada.nextLine();
                    System.out.println("Ingresar instructor: ");
                    String conferesista = entrada.nextLine();
                    System.out.println("Ingresar tema: ");
                    String fecha = entrada.nextLine();
                    System.out.println("Ingresar plataforma ");
                    String enlace = entrada.nextLine();
                    inventario.add((Cursos) new Cursos(titulo, conferesista, fecha, enlace));
                    break;
                }
            }
        }
    }//fin agregar

    public static void remove() {
        Scanner lea = new Scanner(System.in);
        System.out.println("Ingrese el indice del elemento: ");
        int indice = lea.nextInt();
        if (indice > inventario.size() - 1) {
            inventario.remove(indice);
            System.out.println("El elemento se removido");
        } else {
            System.out.println("No existe tal elemento");
        }
    }// fin de remove

    public static void actualizar() {
        
    }
}

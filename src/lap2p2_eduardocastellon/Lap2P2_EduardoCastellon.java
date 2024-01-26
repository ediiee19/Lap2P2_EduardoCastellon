/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lap2p2_eduardocastellon;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author caste
 */
public class Lap2P2_EduardoCastellon {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Usuarios> usuarios = new ArrayList();

        usuarios.add(new Usuarios("EduardoC", "Tinker100", "e"));//estudiante
        usuarios.add(new Usuarios("JaveriL", "general300", "p"));//profesor
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
        }//fin del while
    }
    
    public static void menuEstudiante(){
        System.out.println("Bienvenido al menu de estudiante");   
    }
    
    public static void menuProfesor(){
        System.out.println("Bienvenido al menu de profesor");   
    }
    
    public static void menuBibliotecario(){
        System.out.println("Bienvenido al menu de bibliotecario");
    }

}

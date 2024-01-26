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
            
            System.out.println("hola");
            boolean salida = true;
            while (salida) {
                String salir = JOptionPane.showInputDialog("desea salir?(si/no)");
                if (salir.equalsIgnoreCase("si")) {
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    menuLogIn = false;
                    salida = false;
                } else if (salir.equalsIgnoreCase("no")) {
                    salida = false;
                } else {
                    System.out.println("Ingrese una opcion correcta");
                }
            }
        }//fin del while
    }

    public static void menuEstudiante() {
        Scanner lea = new Scanner(System.in);
        System.out.println("Bienvenido al menu de estudiante");
        boolean menuE = true;
        while (menuE) {
            System.out.println("1- Listar contenido");
            System.out.println("2- cerrar session");
            int opc = lea.nextInt();
            switch (opc) {
                case 2: {
                    System.out.println("cerrar session");
                    menuE = false;
                    break;
                }
            }
        }
    }

    public static void menuProfesor() {
        System.out.println("Bienvenido al menu de profesor");
    }

    public static void menuBibliotecario() {
        System.out.println("Bienvenido al menu de bibliotecario");
    }

}

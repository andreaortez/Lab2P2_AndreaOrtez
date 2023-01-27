package lab2p2_andreaortez;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class Lab2P2_AndreaOrtez {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        Usuario U = new Usuario();
        ArrayList registro = new ArrayList();
        ArrayList usuario = new ArrayList();
        String usuarioA = "";

        do {
            System.out.println("-- MENU --\n" + "1-> Registro de Inmueble/Solar\n" + "2-> Manejo de Estados\n"
                    + "3-> Log In/Log Out/Sign Up\n" + "4-> Salir\n" + "Ingrese su opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("1-> Crear Casas/Edificios/Solares\n" + "2-> Listar Casas/Edificios/Solares\n"
                            + "3-> Modificar Casas/Edificios/Solares\n" + "4-> Borrar Casas/Edificios/Solares\n"
                            + "5->Vender Casas/Edificios/Solares\n" + "Ingrese su opcion: ");
                    int op = sc.nextInt();

                    if ("admin".equals(usuarioA)) {
                        int tipo = tipo();
                        switch (op) {
                            case 1:
                                if (tipo == 1) {
                                    newC();
                                }
                                if (tipo == 2) {
                                    newE();
                                }
                                if (tipo == 3){
                                    newS();
                                }
                        }
                    } else {
                        System.out.println("¡SOLO EL ADMINISTRADOR PUEDE INGRESAR!");
                    }
                    break;
                case 3:
                    System.out.println("1-> Log In\n2-> Log Out\n3-> Sign Up");
                    int op2 = sc.nextInt();

                    if (op2 == 1) {
                        System.out.print("Username: ");
                        String usern = sc.nextLine();

                        if (usuario.get(2) == usern) {
                            System.out.print("Password: ");
                            String pw = sc.nextLine();
                            if (usuario.get(3) == pw) {
                                usuarioA = usern;
                            } else {
                                System.out.println("¡CONTRASEÑA INCORRECTA");
                            }
                        } else {
                            System.out.println("¡EL NOMBRE DE USUARIO NO EXISTE!");
                        }

                    } else if (op2 == 3) {
                        usuario.add(newU());
                        System.out.println("¡USUARIO AGREGADO CON ÉXITO!");
                    }
            }
        } while (opcion != 4);

    }

    static Usuario newU() {
        Usuario retorno;
        System.out.print("Nombre: ");
        String name = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        System.out.print("Username: ");
        String usern = sc.nextLine();
        System.out.print("Password: ");
        String pw = sc.nextLine();
        retorno = new Usuario(name, edad, usern, pw);
        return retorno;
    }

    static int tipo() {
        System.out.println("1-> Casa\n2-> Edificio\n3-> Solares");
        int tipo = sc.nextInt();
        return tipo;
    }

    static Casa newC() {
        Casa retorno;
        System.out.print("Numero de casa:");
        int nc = sc.nextInt();
        System.out.print("Numero de bloque: ");
        int nb = sc.nextInt();
        Color c = JColorChooser.showDialog(null, "Seleccione el color de la casa: ", Color.yellow);
        System.out.print("Ancho de la casa: ");
        int a = sc.nextInt();
        System.out.print("Largo de la casa: ");
        int l = sc.nextInt();
        System.out.print("Numero de baños: ");
        int b = sc.nextInt();
        System.out.print("Numero de cuartos: ");
        int numc = sc.nextInt();
        retorno = new Casa(nc, nb, c, a, l, b, numc);
        return retorno;
    }

    static Edificio newE() {
        Edificio retorno;
        System.out.print("Numero de pisos: ");
        int np = sc.nextInt();
        System.out.print("Cantidad de locales: ");
        int cl = sc.nextInt();
        System.out.print("Dirección por referencia: ");
        String d = sc.nextLine();
        retorno = new Edificio(np, cl, d);
        return retorno;
    }
    
    static Solar newS(){
        Solar retorno;
        System.out.println("Ancho: ");
        int a = sc.nextInt();
        System.out.println("Largo: ");
        int l = sc.nextInt();
        System.out.println("Dueño: ");
        String d = sc.nextLine();
        retorno = new Solar(a,l,d);
        return retorno;
    }
}

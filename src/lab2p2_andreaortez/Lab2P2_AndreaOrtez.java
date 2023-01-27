package lab2p2_andreaortez;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_AndreaOrtez {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        Usuario U = new Usuario();
        ArrayList registro = new ArrayList();
        ArrayList usuario = new ArrayList ();
        
        do {
            System.out.println("-- MENU --\n" + "1-> Registro de Inmueble/Solar\n" + "2-> Manejo de Estados\n"
                    + "3-> Log In/Log Out/Sign Up\n" + "4-> Salir\n" + "Ingrese su opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
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
                            if(usuario.get(3) == pw){
                                
                            }else{
                                System.out.println("¡CONTRASEÑA INCORRECTA");
                            }
                        }else{
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
}

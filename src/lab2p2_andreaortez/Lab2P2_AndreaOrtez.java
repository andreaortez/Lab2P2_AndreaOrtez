package lab2p2_andreaortez;

import java.util.Scanner;

public class Lab2P2_AndreaOrtez {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        Usuario U = new Usuario();
        do {
            System.out.println("-- MENU --\n" + "1-> Registro de Inmueble/Solar\n" + "2-> Manejo de Estados\n"
                    + "3-> Log In/Sign Up\n" + "4-> Salir\n" + "Ingrese su opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    break;
                case 3:
                    System.out.println("1-> Log In\n2-> Log Out\n3-> Sign Up");
                    int op2 = sc.nextInt();
                    if (op2 == 1) {
                        System.out.println("Username: ");
                        String usern = sc.nextLine();
                        int pos = U.usuario.indexOf(usern);
                        for (Object o : U.usuario) {
                            
                        }
                        if (true){
                            
                        }
                    } else if (op2 == 3) {
                        System.out.print("Nombre: ");
                        String name = sc.nextLine();
                        System.out.print("Edad: ");
                        int edad = sc.nextInt();
                        System.out.print("Username: ");
                        String usern = sc.nextLine();
                        System.out.print("Password: ");
                        String pw = sc.nextLine();
                        U.usuario.add(name + edad + usern + pw);
                        System.out.println("¡USUARIO AGREGADO CON ÉXITO!");
                    }
            }
        } while (opcion != 4);

    }
}

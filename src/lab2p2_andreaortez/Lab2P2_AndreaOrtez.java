package lab2p2_andreaortez;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class Lab2P2_AndreaOrtez {

    static Scanner sc = new Scanner(System.in);
    static String usuarioA = "", pwA = "";

    public static void main(String[] args) {
        int opcion;
        ArrayList registro = new ArrayList();
        ArrayList<Usuario> usuario = new ArrayList();
//        usuario.add(Andrea,19,admin,admin1234);

        do {
            System.out.print("-- MENU --\n" + "1-> Registro de Inmueble/Solar\n" + "2-> Manejo de Estados\n"
                    + "3-> Log In/Log Out/Sign Up\n" + "4-> Salir\n" + "Ingrese su opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    if ("admin".equals(usuarioA) && "admin1234".equals(pwA)) {
                        System.out.print("\n1-> Crear Casas/Edificios/Solares\n" + "2-> Listar Casas/Edificios/Solares\n"
                                + "3-> Modificar Casas/Edificios/Solares\n" + "4-> Borrar Casas/Edificios/Solares\n"
                                + "5->Vender Casas/Edificios/Solares\n" + "Ingrese su opcion: ");
                        int op = sc.nextInt();
                        int tipo = tipo();
                        switch (op) {
                            case 1:
                                if (tipo == 1) {
                                    registro.add(newC());
                                }
                                if (tipo == 2) {
                                    registro.add(newE());
                                }
                                if (tipo == 3) {
                                    registro.add(newS());
                                }
                                break;
                            case 2:
                                tipo = tipo();
                                String s = "";
                                switch (tipo) {
                                    case 1:
                                        for (Object t : registro) {
                                            if (t instanceof Casa) {
                                                s += "" + registro.indexOf(t) + " - " + t + "\n";
                                                System.out.println(s);
                                            }
                                        }
                                        break;
                                    case 2:
                                        for (Object t : registro) {
                                            if (t instanceof Edificio) {
                                                s += "" + registro.indexOf(t) + " - " + t + "\n";
                                                System.out.println(s);
                                            }
                                        }
                                        break;
                                    case 3:
                                        for (Object t : registro) {
                                            if (t instanceof Solar) {
                                                s += "" + registro.indexOf(t) + " - " + t + "\n";
                                                System.out.println(s);
                                            }
                                        }
                                        break;
                                }
                            case 3://modificar
                                System.out.println("Ingrese posición a modificar: ");
                                int p = sc.nextInt();

                                tipo = tipo();
                                s = "";
                                switch (tipo) {
                                    case 1:
                                        if (registro.get(p) instanceof Casa) {
                                            System.out.print("\n0-> Numero de casa\n" + "1-> Numero de bloque" + "2-> Color" + "3-> Ancho\n"
                                                    + "4-> Largo\n" + "5-> Numero de Baños\n" + "6-> Numero de Cuartos\n" + "Ingrese el atributo a modificar: ");
                                            int ap = sc.nextInt();

                                            System.out.print("Ingrese el dato a modificar: ");

                                            switch (ap) {
                                                case 0: {
                                                    int n = sc.nextInt();
                                                    ((Casa) registro.get(p)).setNcasa(n);
                                                }
                                                case 1: {
                                                    int n = sc.nextInt();
                                                    ((Casa) registro.get(p)).setNbloque(n);
                                                }
                                                case 2: {
                                                    Color c = JColorChooser.showDialog(null, "Seleccione el color de la casa: ", Color.yellow);
                                                    ((Casa) registro.get(p)).setC(c);
                                                }
                                                case 3: {
                                                    int n = sc.nextInt();
                                                    ((Casa) registro.get(p)).setAncho(n);
                                                }
                                                case 4: {
                                                    int n = sc.nextInt();
                                                    ((Casa) registro.get(p)).setLargo(n);
                                                }
                                                case 5: {
                                                    int n = sc.nextInt();
                                                    ((Casa) registro.get(p)).setNbaños(n);
                                                }
                                                case 6: {
                                                    int n = sc.nextInt();
                                                    ((Casa) registro.get(p)).setNcuartos(n);
                                                }
                                            }
                                        } else {
                                            System.out.println("La posición dada no es válida");
                                        }
                                        break;
                                    case 2:
                                        if (registro.get(p) instanceof Edificio) {
                                            System.out.print("\n0-> Numero de casa\n" + "1-> Numero de bloque" + "2-> Color" + "3-> Ancho\n"
                                                    + "4-> Largo\n" + "5-> Numero de Baños\n" + "6-> Numero de Cuartos\n" + "Ingrese el atributo a modificar: ");
                                            int ap = sc.nextInt();

                                            System.out.print("Ingrese el dato a modificar: ");
                                        }
                                    case 3:
                                        for (Object t : registro) {
                                            if (t instanceof Solar) {
                                                s += "" + registro.indexOf(t) + " - " + t + "\n";
                                                System.out.println(s);
                                            }
                                        }
                                        break;
                                }
                        }
                    } else {
                        System.out.println("¡SOLO EL ADMINISTRADOR PUEDE INGRESAR!");
                    }
                    break;
                case 3:
                    System.out.print("\n1-> Log In\n2-> Log Out\n3-> Sign Up\nIngrese opción: ");
                    int op2 = sc.nextInt();
                    sc.nextLine();

                    if (op2 == 1) {
                        System.out.print("Username: ");
                        String usern = sc.next();
                        int pos = 0;
                        boolean x = false;

                        for (int i = 0; i < usuario.size(); i++) {
                            if (usuario.get(i).getUser().equals(usern)) {
                                x = true;
                                pos = i;
                            }
                        }
                        if (x) {
                            System.out.print("Password: ");
                            String pw = sc.next();
                            int y = 0;

                            for (int i = 0; i < usuario.size(); i++) {
                                if (usuario.get(i).getContra().equals(pw)) {
                                    y = i;
                                }
                            }
                            if (pos == y) {
                                usuarioA = usern;
                                pwA = pw;
                            } else {
                                System.out.println("¡CONTRASEÑA INCORRECTA\n");
                            }
                        } else {
                            System.out.println("¡EL NOMBRE DE USUARIO NO EXISTE!\n");
                        }
                        System.out.println("¡INICIO DE USUARIO EXITOSO!\n");
                    } else if (op2 == 3) {
                        usuario.add(newU());
                        System.out.println("¡USUARIO AGREGADO CON ÉXITO!\n");
                    }
            }
        } while (opcion != 4);

    }

    static Usuario newU() {
        System.out.print("Nombre: ");
        String name = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        System.out.print("Username: ");
        String usern = sc.next();
        sc.nextLine();
        System.out.print("Password: ");
        String pw = sc.next();
        Usuario retorno = new Usuario(name, edad, usern, pw);
        usuarioA = usern;
        pwA = pw;
        return retorno;
    }

    static int tipo() {
        System.out.println("1-> Casa\n2-> Edificio\n3-> Solares");
        int tipo = sc.nextInt();
        return tipo;
    }

    static Casa newC() {
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
        Casa retorno = new Casa(nc, nb, c, a, l, b, numc);
        return retorno;
    }

    static Edificio newE() {
        System.out.print("Numero de pisos: ");
        int np = sc.nextInt();
        System.out.print("Cantidad de locales: ");
        int cl = sc.nextInt();
        System.out.print("Dirección por referencia: ");
        String d = sc.nextLine();
        sc.next();
        Edificio retorno = new Edificio(np, cl, d);
        return retorno;
    }

    static Solar newS() {
        System.out.println("Ancho: ");
        int a = sc.nextInt();
        System.out.println("Largo: ");
        int l = sc.nextInt();
        System.out.println("Dueño: ");
        String d = sc.nextLine();
        Solar retorno = new Solar(a, l, d);
        return retorno;
    }
}

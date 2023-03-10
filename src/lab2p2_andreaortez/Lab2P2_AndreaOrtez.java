package lab2p2_andreaortez;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class Lab2P2_AndreaOrtez {

    static Scanner sc = new Scanner(System.in);
    static String usuarioA = "", pwA = "", nombre = "";

    public static void main(String[] args) {
        int opcion;
        ArrayList registro = new ArrayList();
        ArrayList<Usuario> usuario = new ArrayList();

        do {
            System.out.print("-- MENU --\n" + "1-> Registro de Inmueble/Solar\n" + "2-> Manejo de Estados\n"
                    + "3-> Log In/Log Out/Sign Up\n" + "4-> Salir\n" + "Ingrese su opcion: ");
            opcion = sc.nextInt();
            boolean a = false;

            if ("admin".equals(usuarioA) && "admin1234".equals(pwA)) {
                a = true;
            }

            switch (opcion) {
                case 1:
                    System.out.print("\n1-> Crear Casas/Edificios/Solares\n" + "2-> Listar Casas/Edificios/Solares\n"
                            + "3-> Modificar Casas/Edificios/Solares\n" + "4-> Borrar Casas/Edificios/Solares\n"
                            + "5-> Comprar Casas/Edificios/Solares\n" + "Ingrese su opcion: ");
                    int op = sc.nextInt();

                    if (a) {
                        switch (op) {
                            case 1://Agregar
                                int tipo = tipo();
                                if (tipo == 1) {
                                    registro.add(newC());
                                    System.out.println("¡CASA AGREGADA CON ÉXITO!\n");
                                }
                                if (tipo == 2) {
                                    registro.add(newE());
                                    System.out.println("¡EDIFICIO AGREGAD0 CON ÉXITO!\n");
                                }
                                if (tipo == 3) {
                                    registro.add(newS());
                                    System.out.println("¡SOLAR AGREGADO CON ÉXITO!\n");
                                }
                                break;
                            case 3://modificar
                                tipo = tipo();
                                System.out.print("Ingrese posición a modificar: ");
                                int p = sc.nextInt();

                                if (p >= 0 && p < registro.size()) {
                                    switch (tipo) {
                                        case 1://modificar casas
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
                                                    break;
                                                }
                                            }
                                        case 2://modificar edificios
                                            if (registro.get(p) instanceof Edificio) {
                                                System.out.print("\n0-> Numero de pisos\n" + "1-> Cantidad de locales" + "2-> Dirección por referencia\n"
                                                        + "Ingrese el atributo a modificar: ");
                                                int ap = sc.nextInt();

                                                System.out.print("Ingrese el dato a modificar: ");
                                                switch (ap) {
                                                    case 0: {
                                                        int n = sc.nextInt();
                                                        ((Edificio) registro.get(p)).setNpisos(n);
                                                    }
                                                    case 1: {
                                                        int n = sc.nextInt();
                                                        ((Edificio) registro.get(p)).setClocales(n);
                                                    }
                                                    case 2: {
                                                        String n = sc.nextLine();
                                                        sc.next();
                                                        ((Edificio) registro.get(p)).setDireccion(n);
                                                    }
                                                }
                                            }
                                        case 3://modificar solares
                                            if (registro.get(p) instanceof Solar) {
                                                System.out.print("\n0-> Ancho\n" + "1-> Largo" + "2-> Dueño\n"
                                                        + "Ingrese el atributo a modificar: ");
                                                int ap = sc.nextInt();

                                                System.out.print("Ingrese el dato a modificar: ");
                                                switch (ap) {
                                                    case 0: {
                                                        int n = sc.nextInt();
                                                        ((Solar) registro.get(p)).setAncho(n);
                                                    }
                                                    case 1: {
                                                        int n = sc.nextInt();
                                                        ((Solar) registro.get(p)).setLargo(n);
                                                    }
                                                    case 2: {
                                                        String n = sc.nextLine();
                                                        sc.next();
                                                        ((Solar) registro.get(p)).setDueño(n);
                                                    }
                                                }
                                            }
                                    }
                                } else {
                                    System.out.println("¡SOLO EL ADMINISTRADOR PUEDE INGRESAR!\n");
                                }
                            case 4://borrar
                                 tipo = tipo();
                                System.out.print("Ingrese posición a modificar: ");
                                p = sc.nextInt();

                                if (p >= 0 && p < registro.size()) {
                                    switch (tipo) {
                                        case 1:
                                            if (registro.get(p) instanceof Casa) {
                                                registro.remove(p);
                                            }
                                        case 2:
                                            if (registro.get(p) instanceof Edificio) {
                                                registro.remove(p);
                                            }
                                        case 3:
                                            if (registro.get(p) instanceof Solar) {
                                                registro.remove(p);
                                            }
                                    }
                                } else {
                                    System.out.println("La posición dada no es válida\n");
                                }
                        }
                    }
                    switch (op) {
                        case 2://listar
                            String s = "";
                            System.out.print("¿Desea listar algún tipo en específico? [n/s]: ");
                            String resp = sc.next();

                            if (resp == "s") {
                                int tipo = tipo();
                                switch (tipo) {
                                    case 1:
                                        for (Object t : registro) {
                                            if (t instanceof Casa) {
                                                s += "\n" + registro.indexOf(t) + " - " + t + "\n";
                                                System.out.println(s);
                                            }
                                        }
                                        break;
                                    case 2:
                                        for (Object t : registro) {
                                            if (t instanceof Edificio) {
                                                s += "\n" + registro.indexOf(t) + " - " + t + "\n";
                                                System.out.println(s);
                                            }
                                        }
                                        break;
                                    case 3:
                                        for (Object t : registro) {
                                            if (t instanceof Solar) {
                                                s += "\n" + registro.indexOf(t) + " - " + t + "\n";
                                                System.out.println(s);
                                            }
                                        }
                                }
                                break;
                            } else {
                                for (Object t : registro) {
                                    s += "\n" + registro.indexOf(t) + " - " + t + "\n";
                                    System.out.println(s);
                                }
                            }
                            break;
                        case 5://Comprar
                            int tipo = tipo();
                            System.out.println("Ingrese posición a modificar: ");
                            int p = sc.nextInt();

                            if (p >= 0 && p < registro.size()) {
                                switch (tipo) {
                                    case 1:
                                        if (registro.get(p) instanceof Casa) {
                                            ((Casa) registro.get(p)).setDueño(nombre);
                                        }
                                    case 2:
                                        if (registro.get(p) instanceof Edificio) {
                                            ((Edificio) registro.get(p)).setDueño(nombre);
                                        }
                                    case 3:
                                        if (registro.get(p) instanceof Solar) {
                                            ((Solar) registro.get(p)).setDueño(nombre);
                                        }
                                }
                            } else {
                                System.out.println("La posición dada no es válida");
                            }
                    }
                    break;
                case 2://Estados
                    Casa C = new Casa();
                    System.out.println("Ingrese posición a modificar: ");
                    int p = sc.nextInt();

                    if (p >= 0 && p < registro.size()) {
                        int tipo = tipo();
                        System.out.print("1-> En construccion\n2-> Lista\n3-> Construccion en Espera\n4-> En espera de demolicion\nIngrese nuevo estado: ");
                        int estado = sc.nextInt();

                        switch (tipo) {
                            case 1:
                                if (registro.get(p) instanceof Casa) {
                                    ((Casa) registro.get(p)).setEstado((C.estados[estado]));
                                }
                            case 2:
                                if (registro.get(p) instanceof Edificio) {
                                    ((Edificio) registro.get(p)).setEstado((C.estados[estado]));
                                }
                        }
                    } else {
                        System.out.println("La posición dada no es válida");
                    }
                    break;
                case 3://Ingresos
                    System.out.print("\n1-> Log In\n2-> Log Out\n3-> Sign Up\nIngrese opción: ");
                    int op2 = sc.nextInt();
                    sc.nextLine();

                    if (op2 == 1) {//Log in
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
                            String z = "";

                            for (int i = 0; i < usuario.size(); i++) {
                                if (usuario.get(i).getContra().equals(pw)) {
                                    y = i;
                                    z = usuario.get(i).getNombre();
                                }
                            }
                            if (pos == y) {
                                usuarioA = usern;
                                pwA = pw;
                                nombre = z;
                            } else {
                                System.out.println("¡CONTRASEÑA INCORRECTA\n");
                            }
                        } else {
                            System.out.println("¡EL NOMBRE DE USUARIO NO EXISTE!\n");
                        }
                        System.out.println("¡INICIO DE USUARIO EXITOSO!\n");
                    } else if (op2 == 2) {//Log out
                        usuarioA = "";
                        pwA = "";
                    } else if (op2 == 3) {//Sign in
                        usuario.add(newU());
                        System.out.println("¡USUARIO AGREGADO CON ÉXITO!\n");
                    }
            }

        } while (opcion
                != 4);

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
        nombre = name;
        return retorno;
    }

    static int tipo() {
        System.out.print("\n1-> Casa\n2-> Edificio\n3-> Solares\nIngrese opcion: ");
        int tipo = sc.nextInt();
        return tipo;
    }

    static Casa newC() {
        System.out.print("Numero de casa: ");
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
        Casa retorno = new Casa(nc, nb, c, a, l, b, numc, "Sin dueño");
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
        Edificio retorno = new Edificio(np, cl, d, "Sin dueño");
        return retorno;
    }

    static Solar newS() {
        System.out.print("Ancho: ");
        int a = sc.nextInt();
        System.out.print("Largo: ");
        int l = sc.nextInt();
        Solar retorno = new Solar(a, l, "Sin dueño");
        return retorno;
    }
}

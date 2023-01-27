
package lab2p2_andreaortez;

import java.util.ArrayList;

/**
 *
 * @author Usuario Autorizado
 */
public class Usuario {
    
    private String nombre;
    private int edad;
    private String user;
    private String contra;
    ArrayList usuario = new ArrayList ();

    //constructores
    public Usuario (){
        
    }
    
    public Usuario (String name, int age, String user, String pw){
        nombre = name;
        edad = age;
        this.user=user;
        contra=pw;
    }
    
    //mutadores
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList getUsuario() {
        return usuario;
    }

    public void setUsuario(ArrayList usuario) {
        this.usuario = usuario;
    }
    
    //
}

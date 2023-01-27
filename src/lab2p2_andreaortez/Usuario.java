
package lab2p2_andreaortez;

public class Usuario {
    
    private String nombre;
    private int edad;
    private String user;
    private String contra;

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
        return this.user;
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
    
//
}

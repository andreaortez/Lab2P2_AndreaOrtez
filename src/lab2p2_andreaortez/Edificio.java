
package lab2p2_andreaortez;

public class Edificio {
    private int npisos;
    private int clocales;
    private String direccion;
    private String dueño;
    
    public Edificio (){
        
    }
    
    public Edificio (int np, int cl, String d, String o){
        npisos=np;
        clocales=cl;
        direccion=d;
        dueño=o;
    }

    public int getNpisos() {
        return npisos;
    }

    public void setNpisos(int npisos) {
        this.npisos = npisos;
    }

    public int getClocales() {
        return clocales;
    }

    public void setClocales(int clocales) {
        this.clocales = clocales;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }
    
    
}

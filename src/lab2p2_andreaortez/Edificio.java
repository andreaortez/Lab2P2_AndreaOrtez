package lab2p2_andreaortez;

public class Edificio {

    private int npisos;
    private int clocales;
    private String direccion;
    private String dueño;
    private String[] estados = {"En construccion", "Lista", "Construccion en Espera", "En espera de Demolicion"};
    private String estado;

    public Edificio() {

    }

    public Edificio(int np, int cl, String d, String o) {
        npisos = np;
        clocales = cl;
        direccion = d;
        dueño = o;
        estado = estados[0];
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

    public String[] getEstados() {
        return estados;
    }

    public void setEstados(String[] estados) {
        this.estados = estados;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Edificio\nNúmero de pisos = " + npisos + "\nCantidad de locales = " + clocales
                + "\nDirección por referenciar = " + direccion + "\nDueño = " + dueño;
    }
}

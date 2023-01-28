
package lab2p2_andreaortez;

import java.awt.Color;

public class Casa {
    private int ncasa;
    private int nbloque;
    private Color c;
    private int ancho;
    private int largo;
    private int nbaños;
    private int ncuartos;
    private String dueño;
    private String[]estados = {"En construccion", "Lista", "Construccion en Espera", "En espera de Demolicion"};
    private String estado;
    
    public Casa (){
        
    }
    
    public Casa (int ncasa, int nbloque, Color c, int w, int l, int nbaños, int ncuartos, String d){
        this.ncasa=ncasa;
        this.nbloque=nbloque;
        this.c=c;
        this.ancho=w;
        this.largo=l;
        this.nbaños=nbaños;
        this.ncuartos=ncuartos;
        dueño=d;
        estado = estados[0];
    }
    
    public int getNcasa() {
        return ncasa;
    }

    public void setNcasa(int ncasa) {
        this.ncasa = ncasa;
    }

    public int getNbloque() {
        return nbloque;
    }

    public void setNbloque(int nbloque) {
        this.nbloque = nbloque;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getNbaños() {
        return nbaños;
    }

    public void setNbaños(int nbaños) {
        this.nbaños = nbaños;
    }

    public int getNcuartos() {
        return ncuartos;
    }

    public void setNcuartos(int ncuartos) {
        this.ncuartos = ncuartos;
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
        return "Casa\nNumero de Casa = " + ncasa + "\nNumero de Bloque = " + nbloque + "\nColor = " + c 
                + "\nAncho = " + ancho + "\nLargo = " + largo + "\nNumero de Baños = " + nbaños + "\nNumero de Cuartos = " 
                + ncuartos + "\nDueño = " + dueño;
    }
}

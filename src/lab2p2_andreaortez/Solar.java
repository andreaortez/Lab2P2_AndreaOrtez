
package lab2p2_andreaortez;

public class Solar {
    private double ancho;
    private double largo;
    private String dueño;
    private double area;
    
    public Solar(){
        
    }
    
    public Solar(double a, double l, String d) {
        this.ancho = a;
        this.largo = l;
        this.dueño = d;
        this.area=ancho*largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    @Override
    public String toString() {
        return "Solar\nAncho = " + ancho + "\nLargo = " + largo + "\nArea = " + area + "\nDueño = " + dueño;
    }
}

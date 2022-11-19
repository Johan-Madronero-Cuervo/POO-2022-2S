/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

public class Esfera extends FiguraGeometrica {
    private double radio;
    public Esfera(double radio) {
        this.radio = radio;
        this.setVolumen(CalcVolumen()); 
        this.setArea(CalcArea()); 

}
public double CalcVolumen() {
    double volumen = 1.333 * Math.PI * Math.pow(this.radio, 3.0);
    return volumen;
}
public double CalcArea() {
    double area = 4.0 * Math.PI * Math.pow(this.radio, 2.0);
    return area;
}
}


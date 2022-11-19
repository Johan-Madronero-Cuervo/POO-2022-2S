/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author liont
 */
public class Piramide extends FiguraGeometrica {
    private double base; 
    private double altura; 
    private double apotema; 

public Piramide(double base, double altura, double apotema) {
    this.base = base;
    this.altura = altura;
    this.apotema = apotema;
    this.setVolumen(CalcVolumen()); 
    this.setArea(CalcArea()); 
}

public double CalcVolumen() {
    double volumen = (Math.pow(base, 2.0) * altura) / 3.0;
    return volumen;
}

public double CalcArea() {
    double áreaBase = Math.pow(base, 2.0);
    double áreaLado = 2.0 * base * apotema;
    return áreaBase + áreaLado;
}
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;
public class Cilindro extends FiguraGeometrica{
    private double radio; 
    private double altura; 
    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
        this.setVolumen(CalcVolumen()); 
        this.setArea(CalcArea()); }
    public double CalcVolumen() {
        double volumen = Math.PI * altura * Math.pow(radio, 2.0);
        return volumen;}
    public double CalcArea() {
        double LadoCilindrico = 2.0 * Math.PI * radio * altura;
        double Caras = 2.0 * Math.PI * Math.pow(radio, 2.0);
        return LadoCilindrico + Caras;
}
}

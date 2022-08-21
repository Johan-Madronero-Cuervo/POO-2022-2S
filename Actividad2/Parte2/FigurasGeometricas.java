/* Implementación de clases encontradas en el libro escrito por Leonardo Bermón Angarita  */

package Actividad2.Parte2;

public class FigurasGeometricas
{
	public static void main(String[] args) {
		// Casos de prueba
	Circulo figura1 = new Circulo(2.0);
	Rectangulo figura2 = new Rectangulo(1.0,2.0);
	Cuadrado figura3 = new Cuadrado(3.0);
	TrianguloRectangulo figura4 = new TrianguloRectangulo(3.0,5.0);
	System.out.println("El área del círculo es = " + figura1.calcularArea());
	System.out.println("El perímetro del círculo es = " + figura1.calcularPerimetro());
	System.out.println();
	System.out.println("El área del rectángulo es = " + figura2.calcularArea());
	System.out.println("El perímetro del rectángulo es = " + figura2.
	calcularPerimetro());
	System.out.println();
	System.out.println("El área del cuadrado es = " + figura3.calcularArea());
	System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerimetro());
	System.out.println();
	System.out.println("El área del triángulo es = " + figura4.calcularArea());
	System.out.println("El perímetro del triángulo es = " + figura4.calcularPerimetro());
	figura4.calcularTipodeTriangulo();	
	}
}

abstract class FiguraGeometrica {

	public abstract Double calcularArea();
	public abstract Double calcularPerimetro();
}

class Circulo extends FiguraGeometrica {
	Double radio;

	public Circulo(Double r){
		radio = r;
	}

	public Double calcularArea(){
		return (Math.PI * Math.pow(radio, 2));
	}

	public Double calcularPerimetro(){
		return (2*Math.PI*radio);
	}
}

class Rectangulo extends FiguraGeometrica {
	Double base;
	Double altura;

	public Rectangulo(double b, double h){
		base = b;
		altura = h;
	}

	public Double calcularArea(){
		return (base * altura);
	}

	public Double calcularPerimetro(){
		return (2*base + 2*altura);
	}
}

class Cuadrado extends FiguraGeometrica {
	Double lado;

	public Cuadrado(Double l){
		lado = l;
	}

	public Double calcularArea(){
		return (Math.pow(lado,2));
	}

	public Double calcularPerimetro(){
		return (4*lado);
	}
}

class TrianguloRectangulo extends FiguraGeometrica {
	Double base;
	Double altura;
	public TrianguloRectangulo(Double b, Double h){
		base = b;
		altura = h;
	}

	public Double calcularArea(){
		return (0.5*base*altura);
	}

	public Double calcularPerimetro(){
		return (base + altura + calcularHipotenusa());
	}

	public Double calcularHipotenusa(){
		return Math.sqrt(Math.pow(base,2) + Math.pow(altura, 2));
	}

	public void calcularTipodeTriangulo(){
		if ((base == altura) && (base == calcularHipotenusa())){
			System.out.println("Equilatero");
		}

		else if ((base != altura) && (base != calcularHipotenusa())){
			System.out.println("Escaleno");
		}

		else{
			System.out.println("Isosceles");
		}
	}
}
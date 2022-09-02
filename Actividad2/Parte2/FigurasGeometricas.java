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
	Rombo figura5 = new Rombo(1.0, 2.0, 3.0, 4.0, 5.0, 6.0);
	Trapecio figura6 = new Trapecio(1.0, 2.0, 3.0, 4.0, 5.0);
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
	System.out.println("El perimetro del rombo es = " + figura5.calcularPerimetro());
	System.out.println("El area del rombo es = " + figura5.calcularArea());
	System.out.println("El perimetro del trapecio es = " + figura6.calcularPerimetro());
	System.out.println("El area del trapecio es = " + figura6.calcularArea());
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

class Rombo extends FiguraGeometrica {
	Double lado1;
	Double lado2;
	Double lado3;
	Double lado4;
	Double diagonalMenor;
	Double diagonalMayor;

		public Rombo(Double l1, Double l2, Double l3, Double l4, Double dMen, Double dMay){
		lado1 = l1;
		lado2 = l2;
		lado3 = l3;
		lado4 = l4;
		diagonalMenor = dMen;
		diagonalMayor = dMay;
	}
	
	public Double calcularArea(){
		return ((diagonalMayor*diagonalMenor)/2);
	}

	public Double calcularPerimetro(){
		return (lado1 + lado2 + lado3 + lado4);
	}
}

class Trapecio extends FiguraGeometrica {
	Double baseMenor;
	Double baseMayor;
	Double lado1;
	Double lado2;
	Double altura;

	public Trapecio(Double bMen, Double bMay, Double l1, Double l2, Double h){
		baseMenor = bMen;
		baseMayor = bMay;
		lado1 = l1;
		lado2 = l2;
		altura = h;
	}
	
	public Double calcularArea(){
		return (((baseMenor + baseMayor)*altura)/2);
	}

	public Double calcularPerimetro(){
		return (baseMenor + baseMayor + lado1 + lado2);
	}
}

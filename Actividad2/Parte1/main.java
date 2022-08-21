/*
*   Solución a los ejercicios propuestos Capítulo 3
*   
*   Ejercicios 18, 19, 21
*   
*/

// Recuerda cambiar el metodo
public class Main
{
	public static void main(String[] args) {
        Exercise18();
        System.out.println("\n");
		Exercise19(69.9);
		System.out.println("\n");
		Exercise21(69.9, 69.9, 69.9);
	}
	
	public static void Exercise18(){
        /* Obteniendo información de empleado */
        System.out.println("Ejercicio 18");
	    String codigoEmpleado = "69";
		String nombresEmpleado = "Gustavo Jacobo";
		Double horasTrabajadasMes = 69.0;
		Double valorHoraTrabajada = 500.0;
		Double porcentajeRetencionFuente = 0.13;

        Double salarioBrutoMensual = horasTrabajadasMes * valorHoraTrabajada;
        Double salarioNeto = salarioBrutoMensual - (salarioBrutoMensual*porcentajeRetencionFuente);

        System.out.println("Codigo: " + codigoEmpleado);
        System.out.println("Nombres: " + nombresEmpleado);
        System.out.println("Salario Bruto mensual:\n" + salarioBrutoMensual);
        System.out.println("Salario Neto mensual:\n" + salarioNeto);
	}
	
	public static void Exercise19(Double l){
	    System.out.println("Ejercicio 19");
        // Perimetro: suma de los lados
        Double perimetro = 3*l;
        // altura equilatero: sqrt(3)/2 * l
        Double altura = (Math.sqrt(3)/2) * l;
        // area: base * altura
        Double area = (Math.sqrt(3)/2) * Math.pow(l, 2);

        System.out.println("Perimetro: " + perimetro);
        System.out.println("Altura: " + altura);
        System.out.println("Area: " + area);
    }
    
    public static void Exercise21(Double lado1, Double lado2, Double lado3){
        System.out.println("Ejercicio 21");
        
        Double perimetro = lado1 + lado2 + lado3;
        Double semiperimetro = perimetro/2;
        // h = sqrt(a^2 - b^2/4)
        Double altura = Math.sqrt(Math.pow(lado1,2) - Math.pow(lado2,2)/4);
        Double area = altura * lado2;

        System.out.println("Perimetro: " + perimetro);
        System.out.println("Semiperimetro: " + semiperimetro);
        System.out.println("Area: " + area);
    }
}

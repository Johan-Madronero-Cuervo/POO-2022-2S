/*
*   Solución a los ejercicios propuestos Capítulo 3
*   
*   Ejercicios 18, 19, 21
*   
*/

import java.util.Scanner;

public class PropuestosCapitulo3
{
	public static void main(String[] args) {
        Exercise18();
        System.out.println("\n");
		Exercise19();
		System.out.println("\n");
		Exercise21();
	}
	
	public static void Exercise18(){
        /* Obteniendo información de empleado */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ejercicio 18");
        System.out.println("Ingrese el codigo de empleado: ");
	    String codigoEmpleado = entrada.nextLine();
        System.out.println("Ingrese el nombre del empleado: ");
		String nombresEmpleado = entrada.nextLine();
        System.out.println("Ingrese horas trabajadas al mes (double): ");
		Double horasTrabajadasMes = entrada.nextDouble();
        System.out.println("Ingrese valor hora trabajada (double): ");
		Double valorHoraTrabajada = entrada.nextDouble();
        System.out.println("Ingrese valor retencion de la fuente (double)");
		Double porcentajeRetencionFuente = entrada.nextDouble();
        /* Cerrar el scanner */
        entrada.close();

        Double salarioBrutoMensual = horasTrabajadasMes * valorHoraTrabajada;
        Double salarioNeto = salarioBrutoMensual - (salarioBrutoMensual*porcentajeRetencionFuente);

        System.out.println("Codigo: " + codigoEmpleado);
        System.out.println("Nombres: " + nombresEmpleado);
        System.out.println("Salario Bruto mensual:\n" + salarioBrutoMensual);
        System.out.println("Salario Neto mensual:\n" + salarioNeto);
	}
	
	public static void Exercise19(){
        Scanner entrada = new Scanner(System.in);
	    System.out.println("Ejercicio 19");
        System.out.println("Ingrese el valor del lado (double): ");
        Double lado = entrada.nextDouble();
        /* Cerrar el scanner */
        entrada.close();
        // Perimetro: suma de los lados
        Double perimetro = 3*lado;
        // altura equilatero: sqrt(3)/2 * l
        Double altura = (Math.sqrt(3)/2) * lado;
        // area: base * altura
        Double area = (Math.sqrt(3)/2) * Math.pow(lado, 2);

        System.out.println("Perimetro: " + perimetro);
        System.out.println("Altura: " + altura);
        System.out.println("Area: " + area);
    }
    
    public static void Exercise21(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ejercicio 21");
        System.out.println("Ingrese el valor del lado 1 (double): ");
        Double ladoOne = entrada.nextDouble();
        System.out.println("Ingrese el valor del lado 2 (double): ");
        Double ladoTwo = entrada.nextDouble();
        System.out.println("Ingrese el valor del lado 3 (double): ");
        Double ladoThree = entrada.nextDouble();
        /* Cerrar entrada */
        entrada.close();
        
        Double perimetro = ladoOne + ladoTwo + ladoThree;
        Double semiperimetro = perimetro/2;
        // h = sqrt(a^2 - b^2/4)
        Double altura = Math.sqrt(Math.pow(ladoOne,2) - Math.pow(ladoTwo,2)/4);
        Double area = altura * ladoTwo;

        System.out.println("Perimetro: " + perimetro);
        System.out.println("Semiperimetro: " + semiperimetro);
        System.out.println("Area: " + area);
    }
}

public class main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 7: ");
        exercise7(20, 25);
        System.out.println("");
        System.out.println("Ejercicio 10: ");
        exercise10(0001, "JUAN PABLO", 1500000, 4);
        System.out.println("");
        System.out.println("Ejercicio 11: ");
        exercise11(25, 26, 56);
        System.out.println("");
        System.out.println("Ejercicio 12: ");
        exercise12("Elias Jose", 53, 4000);
        System.out.println("");
        System.out.println("Ejercicio 13: ");
        exercise13(543450, "azul");
        System.out.println("");
        System.out.println("Ejercicio 14: ");
        exercise14(4200000, 250000, 3300000, 380320);
        System.out.println("");
        System.out.println("Ejercicio 15: ");
        exercise15(30, 54, 54, 54);

    }


    public static void exercise7(double A, double B) {
        /*Hacer un algoritmo que, dados dos valores numéricos A y B, escriba un mensaje diciendo
         *si A es mayor, menor o igual a B. 
         */
        if (A > B) {
            System.out.println("A es mayor que B");
        } else if (A < B) {
            System.out.println("A es menor que B");
        } else {
            System.out.println("A es igual que B");
        }
    }

    public static void exercise10(double num, String nombres, double patrimonio, int estrato){
        /*
         * Cierta universidad para liquidar el pago de matrícula de un estudiante le exige los
            siguientes datos:
            • Número de inscripción
            • Nombres
            • Patrimonio.
            • Estrato social.
            La universidad cobra un valor constante para cada estudiante de $50.000. Si el patrimonio
            es mayor que $2´000.000 y el estrato superior a 3, se le incrementa un porcentaje del 3%
            sobre el patrimonio. Hacer un algoritmo que muestre:
            • Número de inscripción.
            • Nombres.
            • Pago de matrícula. 
         */
        double constante = 50000;
        double matricula;

        if (patrimonio > 2000000 & estrato > 3){
            matricula = constante + (patrimonio * 0.03);
            System.out.println("Numero de inscripción: " + num);
            System.out.println("Nombres del estudiante: " + nombres);
            System.out.println("Matricula del estudiante: " + matricula);
        }
        else {
            matricula = constante;
            System.out.println("Numero de inscripción: " + num);
            System.out.println("Nombres del estudiante: " + nombres);
            System.out.println("Matricula del estudiante: " + matricula);
        }
    }


    public static void exercise11(double A, double B, double C){
        /*
         * Escribir un algoritmo que acepte tres números enteros diferentes y muestre el mayor de
         * ellos. 
         */
        if (A > B & A > C){
            System.out.println("El mayor es: " + A);
        }
        else if (B > A & B > C){
            System.out.println("El mayor es: " + B);
        }
        else {
            System.out.println("El mayor es: " + C);
        }
    }

    public static void exercise12(String nombres, int horas, int valor){
        /*
         *   Determinar la cantidad de dinero recibida por un trabajador por concepto de las horas
         *   semanales trabajadas en una empresa, sabiendo que cuando las horas de trabajo exceden
         *   de 40, el resto se considera horas extras y se pagan al doble de una hora normal, cuando
         *   no exceden de 8; si las horas extras exceden de 8, se pagan las primeras 8 al doble de lo
         *   que se paga una hora normal y el resto al triple. Del trabajador se conocen los siguientes
         *   datos: nombres, número de horas trabajadas en la semana y valor recibido por una hora
         *   normal de trabajo.
         */
        double sueldo;
        if (horas >= 40){
            int horasExtra = horas - 40;
            sueldo = valor * 40;

            if (horasExtra <= 8){
                sueldo = sueldo  + (horasExtra * valor * 2);
            }

            else {
                double triple = (horasExtra - 8) * valor * 3;
                double doble = 8 * valor * 2;
                sueldo = sueldo + (triple + doble);
            }

        }
        else{
            sueldo = horas * valor;
        }
        System.out.println("Nombres del empleado: " + nombres);
        System.out.println("Sueldo del empleado: " + sueldo);

    }

    public static void exercise13(double valcomp, String color){
        /*
         * Un almacén efectúa una promoción en la cual se hace un descuento sobre el valor de la
            compra total, según el color de la bolita que el cliente saque al pagar en caja. Si la bolita
            es blanca no se le hará descuento alguno, si es verde se le hará un 10% de descuento, si es
            amarilla un 25%, si es azul un
            50% y si es roja un 100%. Hacer un algoritmo para determinar la cantidad final que un
            cliente deberá pagar por su compra. Se sabe que sólo hay bolitas de los colores
            mencionados. 
         */
        double pdes;
        if (color.equals("blanco")){
            pdes = 0;
        }

        else if (color.equals("verde")){
            pdes = 0.1;
        }
        else if (color.equals("azul")){
            pdes = 0.5;
        }
        
        else if (color.equals("amarillo")){
            pdes = 0.25;
        }

        else {
            pdes = 1;
        }

        double valpag = valcomp - (valcomp * pdes);
        System.out.println("El cliente debe pagar: " + valpag);
    }

    public static void exercise14(double vd1, double vd2, double vd3, double salar){
        /*
         * Una empresa con tres departamentos tiene establecido un plan de incentivos para sus
            vendedores. Al final del período, a cada departamento se le pide el importe global de las
            ventas. A los departamentos que excedan el 33% de las ventas totales se les adiciona al
            salario de los vendedores un porcentaje equivalente al 20% del salario mensual. Las
            nóminas de los tres departamentos son iguales. Si se tienen los siguientes datos:
            • Ventas del departamento 1
            • Ventas del departamento 2
            • Ventas del departamento 3
            • Salario de los vendedores de cada departamento
            Hacer un algoritmo que determine cuánto recibirán los vendedores de cada departamento
            al finalizar el período
         */
        double salar1, salar2, salar3;
        double totven = vd1 + vd2 + vd3;
        double porven = 0.33 * totven;
        if (vd1 > porven){
            salar1 = salar + (0.2 * salar);
        }
        else{
            salar1 = salar;
        }

        if (vd2 > porven){
            salar2 = salar + (0.2 * salar);
        }
        else{
            salar2 = salar;
        }

        if (vd3 > porven){
            salar3 = salar + (0.2 * salar);
        }
        else{
            salar3 = salar;
        }
        System.out.println("El salario del vendedor dpto 1 es: " + salar1);
        System.out.println("El salario del vendedor dpto 2 es: " + salar2);
        System.out.println("El salario del vendedor dpto 3 es: " + salar3);
    }

    public static void exercise15(double a, double b, double c, double d){
        /*
         * Se tienen cuatro esferas (A, B, C, D) de las cuales se sabe que tres son de igual peso y una
            diferente. Elaborar un algoritmo que determine cuál es la esfera diferente y si es de mayor
            o menor peso. 
         */
        if ((a == b) & (a == c)){
            System.out.println("La  esfera D es la diferente");
            if (d > a){
                System.out.println("Y es la de mayor peso");
            }
            else{
                System.out.println("Y es la de menor peso");
            }
        }

        else if ((a == b) & (a == d)){
            System.out.println("La  esfera C es la diferente");
            if (c > a){
                System.out.println("Y es la de mayor peso");
            }
            else{
                System.out.println("Y es la de menor peso");
            }
        }

        else if ((a == c) & (a == d)){
            System.out.println("La  esfera B es la diferente");
            if (b > a){
                System.out.println("Y es la de mayor peso");
            }
            else{
                System.out.println("Y es la de menor peso");
            }
        }
        else if ((b == c) & (b == d)){
            System.out.println("La  esfera A es la diferente");
            if (a > b){
                System.out.println("Y es la de mayor peso");
            }
            else{
                System.out.println("Y es la de menor peso");
            }
        }
        else{
            System.out.println("No hay esferas diferentes");
        }
    }

}


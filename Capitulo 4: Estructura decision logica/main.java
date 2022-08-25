public class main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 7: ");
        exercise7(5, 10);
        System.out.println("");
        System.out.println("Ejercicio 10: ");
        exercise10(152, "Pepe Pepito", 2500000, 4);
        System.out.println("");
        System.out.println("Ejercicio 11: ");
        exercise11(5, 10, 20);
        System.out.println("");
        System.out.println("Ejercicio 12: ");
        exercise12("Pepito Pepita", 60, 100);

    }


    public static void exercise7(double A, double B) {
        if (A > B) {
            System.out.println("A es mayor que B");
        } else if (A < B) {
            System.out.println("A es menor que B");
        } else {
            System.out.println("A es igual que B");
        }
    }

    public static void exercise10(double num, String nombres, double patrimonio, int estrato){
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

}


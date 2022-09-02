package com.example.poo;
import java.util.Scanner;

public class EjerciciosPropuestos {
    public static void main(String[] args) {
        Ejercicio22();
        Ejercicio23();
        Ejercicio24();
    }
    public static void Ejercicio22(){
        System.out.println("Ejercicio 22");
        Empleado EmpleadoA = new Empleado();
        EmpleadoA.getValues();
        EmpleadoA.Salary();}
    public static void Ejercicio23(){
        System.out.println("Ejercicio 23");
        Ecuacion FBachiller = new Ecuacion();
        FBachiller.getNumbers();
        FBachiller.roots();
    }
    public static void Ejercicio24(){
        System.out.println("Ejercicio 24");
        Esfera Esfera1 = new Esfera();
        Esfera Esfera2 = new Esfera();
        Esfera Esfera3 = new Esfera();
        Esfera1.getvalues(); Esfera2.getvalues(); Esfera3.getvalues();
        if (Esfera1.Peso > Esfera2.Peso) {
            if (Esfera1.Peso > Esfera3.Peso) {
                System.out.println("La esfera mayor es: " + Esfera1.Name);
            } else {
                System.out.println("La esfera mayor es: " + Esfera3.Name);
            }
        } else if (Esfera2.Peso > Esfera3.Peso) {
            System.out.println("La esfera mayor es: " + Esfera2.Name);
        } else {
            System.out.println("La esfera mayor es: " + Esfera3.Name);
        }
    }
}
class Empleado {
    String Nombre;
    int    PrecioHora;
    int    HorasTrabajadasMes;
    public void getValues(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite el nombre del empleado");
        Nombre = input.next();
        System.out.println("Digite el precio de la hora trabajada por empleado");
        PrecioHora = input.nextInt();
        System.out.println("Digite la cantidad de horas que trabajo el empleado en el mes");
        HorasTrabajadasMes = input.nextInt();
    }
    public void Salary(){
        int SalarioBruto = PrecioHora * HorasTrabajadasMes;
        if (SalarioBruto>450000){
            System.out.println("El salario del empleado "  + Nombre +  " es $" + SalarioBruto);
        } else {System.out.println("El nombre del empleado es: "+Nombre);}
    }
}
class Ecuacion{
    double A;        //Coeficiente de X^2
    double B;        //Coeficiente de X
    double C; //Termino Independiente
    public void getNumbers(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite el coeficiente de la variable cuadratica");
        A = input.nextDouble();
        System.out.println("Digite el coeficiente de la variable lineal");
        B = input.nextDouble();
        System.out.println("Digite el valor del termino independiente");
        C = input.nextDouble();
    }
    public void roots(){
        double rootp = ((-B+Math.sqrt(Math.pow(B,2)-4*A*C))/ (2*A));
        double rootn = ((-B-Math.sqrt(Math.pow(B,2)-4*A*C))/ (2*A));
        System.out.println("La raices son: "+rootp+" y "+rootn);
    }
}
class Esfera {
    String Name;
    int Peso;
    public void getvalues(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite el nombre de la esfera");
        Name = input.next();
        System.out.println("Digite el peso de la esfera");
        Peso = input.nextInt();
    }
}
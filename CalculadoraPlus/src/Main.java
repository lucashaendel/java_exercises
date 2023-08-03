import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String suma = "suma";
        String resta = "resta";
        String multiplicacion = "multiplicacion";
        String division = "division";
        System.out.println("Bienvenido a la super calculadora");
        System.out.println("Ingresar el primer numero");
        double num = myObj.nextDouble();

        System.out.println("Ingresar la operacion: suma, resta, multiplicacion o division");
        String operacion = myObj.next();

        System.out.println("Ingresar el segundo numero");
        double numDos = myObj.nextDouble();

        if (operacion.equals(suma)){
            double result = num+numDos;
            System.out.println("El resultado de sumar los numeros "+num+" y "+numDos+" es "+result);
        } else if (operacion.equals(resta)){
            double result = num-numDos;
            System.out.println("El resultado de restar los numeros "+num+" y "+numDos+" es "+result);
        } else if (operacion.equals(multiplicacion)){
            double result = num*numDos;
            System.out.println("El resultado de multiplicar los numeros "+num+" y "+numDos+" es "+result);
        } else if (operacion.equals(division)){
            double result = num/numDos;
            System.out.println("El resultado de dividir los numeros "+num+" y "+numDos+" es "+result);
        }
    }
}
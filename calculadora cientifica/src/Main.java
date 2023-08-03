public class Main {

    public static void main(String[] args) {
        java.util.Scanner lector = new java.util.Scanner(System.in);
        System.out.println("Bienvenido a la super calculadora");

        System.out.println("Ingresar el primer numero");
        double primerNumero = Double.parseDouble(lector.nextLine());

        System.out.println("Ingresar la operacion: suma, resta, multiplicacion o division");
        String operacion = lector.nextLine();

        System.out.println("Ingresar el segundo numero");
        double segundoNumero = Double.parseDouble(lector.nextLine());

        if (operacion.equals("suma")) {
            double total = sumar(primerNumero, segundoNumero);
            System.out.println("El resultado de sumar los numeros " + primerNumero + " y " + segundoNumero + " es " + total);

        } else if (operacion.equals("resta")) {
            double total = restar(primerNumero, segundoNumero);
            System.out.println("El resultado de restar los numeros " + primerNumero + " y " + segundoNumero + " es " + total);

        } else if (operacion.equals("multiplicacion")) {
            double total = multiplicar(primerNumero, segundoNumero);
            System.out.println("El resultado de multiplicar los numeros " + primerNumero + " y " + segundoNumero + " es " + total);

        } else if (operacion.equals("division")) {
            double total = dividir(primerNumero, segundoNumero);
            System.out.println("El resultado de dividir los numeros " + primerNumero + " y " + segundoNumero + " es " + total);

        }

    }

    static void imprimirResultado(String operacion, double primerNumero, double segundoNumero, double resultado) {
        System.out.println("El resultado de " + obtenerOperacionComoTexto(operacion) + " los numeros " + primerNumero + " y " + segundoNumero + " es " + resultado);
    }

    static String obtenerOperacionComoTexto(String operacion) {
        if (operacion.equals("suma")) {
            return "sumar";
        } else if (operacion.equals("resta")) {
            return "restar";
        } else  if (operacion.equals("multiplicacion")) {
            return "multiplicar";
        } else if (operacion.equals("division")) {
            return "dividir";
        } else {
            return null;
        }
    }

    static double sumar(double numero1, double numero2) {
        return numero1+numero2;
    }

    static double restar(double numero1, double numero2) {
        return numero1-numero2;
    }

    static double multiplicar(double numero1, double numero2) {
        return numero1*numero2;
    }

    static double dividir(double numero1, double numero2) {
        return numero1/numero2;
    }

}
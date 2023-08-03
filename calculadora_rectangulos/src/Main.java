import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Ingresar el ancho del rectangulo:");
        double num1 = myObj.nextDouble();
        System.out.println("Ingresar el largo del rectangulo:");
        double num2 = myObj.nextDouble();
        System.out.println("Area: " + (num1 * num2));
        System.out.println("Perimetro: " + (num1*2 + num2*2));
    }
}
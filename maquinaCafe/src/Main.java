import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int priceCoffee = 2;
        int priceSugar = 1;
        double iva = 0.21;
        System.out.println("Bienvenido a la maquina de cafe");
        System.out.println("Cuantas cucharaditas de cafe queres? (Entre 1 y 3)");
        int sponCoffee = myObj.nextInt();
        System.out.println("Cuantas cucharaditas de azucar queres? (Entre 0 y 3)");
        int sponSugar = myObj.nextInt();
        System.out.println("Se despacha un pedido de cafe con "+sponCoffee+" cucharada/s de cafe y "+sponSugar+" cucharada/s de azucar");
        double noVat = (priceCoffee*sponCoffee)+(priceSugar*sponSugar);
        double vat = (noVat*iva)+noVat;

        System.out.println("El precio total sin IVA es: "+ noVat+" pesos");
        System.out.println("El precio total con IVA es: "+vat+" pesos");

    }
}
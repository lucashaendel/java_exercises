import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Bienvenido a la carniceria");
        System.out.println("Ingresa el total de la compra");
        double totalBuy = myInput.nextDouble();
        if (totalBuy < 1000) {
            System.out.println("Precio final: " + totalBuy);
        } else if (totalBuy < 3000) {
            System.out.println("Precio final: " + (totalBuy - (totalBuy * 0.10)));
        } else {
            System.out.println("Precio final: " + (totalBuy - (totalBuy * 0.20)));
        }
    }
}
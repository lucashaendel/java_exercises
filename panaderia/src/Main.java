import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        int valueMoon = 10;
        System.out.println("Bienvenido a la panaderia");
        System.out.println("Ingresa la cantidad de medialunas que queres comprar");
        double cantMoon = myInput.nextDouble();
        double total = valueMoon*cantMoon;
        if (cantMoon < 12){
            System.out.println("Precio total: "+(valueMoon*cantMoon));
        }else{
            System.out.println("Precio total: "+(total-(total*0.15)));
        }
    }
}
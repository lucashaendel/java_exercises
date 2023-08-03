import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Ingresar distancia en millas:");
        double distance= myObj.nextDouble();
        double kilometer = distance*1.60934;
        System.out.println("La distancia en kilometros es: "+kilometer);
    }
}
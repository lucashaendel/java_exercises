import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        double acumulador=0;
        System.out.println("Bienvenido al programa para calcular ahorros");
        System.out.println("Cuantos montos queres ingresar?");
        int montos = Integer.parseInt(myObj.nextLine());
        for(int i=1; i<=montos;i++){
            System.out.println("Ingresa el monto "+i+":");
            double monto = Double.parseDouble(myObj.nextLine());
            acumulador = acumulador + monto;
        }
        System.out.println("El total ahorrado es: "+acumulador+" pesos");
    }
}
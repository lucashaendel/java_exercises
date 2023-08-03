import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Ingresar nota 1:");
        int nota1= myObj.nextInt();
        System.out.println("Ingresar nota 2:");
        int nota2= myObj.nextInt();
        System.out.println("Ingresar nota 3:");
        int nota3= myObj.nextInt();

        System.out.println("El promedio de las notas es: "+((nota1+nota2+nota3)/3));
    }
}
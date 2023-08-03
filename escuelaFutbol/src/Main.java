import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner (System.in);
        System.out.println("Bienvenido a la escuela de futbol");
        System.out.println("Ingresa la cantidad de jugadores");
        int participants = myObj.nextInt();
        System.out.println("Ingresa la cantidad de jugadores por equipo");
        int playersForTeam = myObj.nextInt();
        int total = participants/playersForTeam;
        int resto = participants%playersForTeam;
        if(resto >0 ){
            System.out.println("Se formaron: "+total+" equipos");
            System.out.println("Hay "+resto+" jugadores sin equipo");
        }else {
            System.out.println("Se formaron: "+total+" equipos");
        }

    }

}
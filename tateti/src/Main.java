import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Bienvenidos al tateti (Version 1)");
        char[][] tablero = new char[3][3];
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[fila].length; columna++) {
                tablero[fila][columna] = '-';
            }
        }
        int jugada = 0;
        int jugador = 1;
        char ficha = 'X';
        while (jugada < 9) {
            System.out.println("Jugador " + jugador + ", ingresar fila de la jugada");
            int filaJugador = Integer.parseInt(lector.nextLine());
            System.out.println("Jugador " + jugador + ", ingresar columna de la jugada");
            int columnaJugador = Integer.parseInt(lector.nextLine());
            if (tablero[filaJugador][columnaJugador] == '-') {
                tablero[filaJugador][columnaJugador] = ficha;
                jugada++;
                if (jugada % 2 == 0) {
                    jugador = 1;
                    ficha = 'X';
                } else {
                    jugador = 2;
                    ficha = 'O';
                }
            } else {
                System.out.println("La posicion ya se encuentra ocupada!");
            }
            for (int fila = 0; fila < tablero.length; fila++) {
                for (int columna = 0; columna < tablero[fila].length; columna++) {
                    System.out.print(tablero[fila][columna] + " ");
                }
                System.out.println("");
            }
        }
    }
}

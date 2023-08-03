import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Bienvenidos al tateti (Version 2)");
        char[][] tablero = new char[3][3];

        for (int fila=0; fila < tablero.length; fila++) {
            for (int columna=0; columna<tablero[fila].length; columna++) {
                tablero[fila][columna] = '-';
            }
        }

        int jugada = 1;
        int jugador = 1;
        char ficha = 'X';
        boolean hayGanador = false;

        while (jugada < 10 && hayGanador == false) {

            System.out.println("Jugador " + jugador + ", ingresar fila de la jugada");
            int filaJugador = Integer.parseInt(lector.nextLine());
            System.out.println("Jugador " + jugador + ", ingresar columna de la jugada");
            int columnaJugador = Integer.parseInt(lector.nextLine());

            if (tablero[filaJugador][columnaJugador] == '-') {

                tablero[filaJugador][columnaJugador] = ficha;

                boolean hayGanadorEnFila = tablero[filaJugador][0] == tablero[filaJugador][1] && tablero[filaJugador][1] == tablero[filaJugador][2];
                boolean hayGanadorEnColumna = tablero[0][columnaJugador] == tablero[1][columnaJugador] && tablero[1][columnaJugador] == tablero[2][columnaJugador];
                boolean hayGanadorEnDiagonal1 = tablero[0][0] != '-' && tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2];
                boolean hayGanadorEnDiagonal2 = tablero[0][2] != '-' && tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0];
                if (hayGanadorEnFila || hayGanadorEnColumna || hayGanadorEnDiagonal1 || hayGanadorEnDiagonal2) {
                    hayGanador = true;
                }

                jugada++;

                if (jugador == 1) {
                    jugador = 2;
                    ficha = 'O';
                } else {
                    jugador = 1;
                    ficha = 'X';
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
        if (hayGanador) {
            if(jugada %2==0){
                jugador = 1;
            } else {
                jugador = 2;
            }
            System.out.println("Fin del juego, ganador jugador " + jugador);
        } else {
            System.out.println("Fin del juego, empate");
        }
    }
}
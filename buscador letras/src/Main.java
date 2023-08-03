import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner mySc = new Scanner(System.in);
        System.out.println("Bienvenido al buscador de letras");
        System.out.println("Ingresar palabra:");
        String word = mySc.nextLine();
        char [] wordArray = word.toCharArray();
        System.out.println("Ingresar letra:");
        String letter = mySc.nextLine();
        char [] letterArray = letter.toCharArray();
        for(int i=0 ; i<wordArray.length ; i++){
            if (wordArray[i] ==letterArray[0]){
                System.out.println("Se encontro la letra: " + letter + " en la posicion: " + i);
            }
        }
    }
}
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner mySc = new Scanner(System.in);
            System.out.println("Bienvenido al encriptador / desencriptador");
            System.out.println("Ingrese la operacion que desea realizar 1) Encriptar / 2) Desencriptar");
            int operation = Integer.parseInt(mySc.nextLine());
            System.out.println("Ingrese el corrimiento");
            int moveChar = Integer.parseInt(mySc.nextLine());
            System.out.println("Ingrese el texto");
            String text = mySc.nextLine();
            char[] textArray = text.toCharArray();
            char[] result = new char[textArray.length];
            if (operation ==1){
                for (int i=0 ; i<textArray.length ; i++){
                    result[i] = (char)(textArray[i]+moveChar);
                }
            } else if (operation == 2){
                for (int i=0 ; i<textArray.length ; i++){
                    result[i] = (char)(textArray[i]-moveChar);
                }
            }
            System.out.println("El resultado es:");
            System.out.println(result);
        }

    }
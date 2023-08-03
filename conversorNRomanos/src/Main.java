import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);
        System.out.println("Conversor de numeros arabigos en romanos");
        System.out.println("Ingresa un numero de 1 a 10");
        int num = myNum.nextInt();
        if (num <=10 && num > 0){
            if (num == 1){
                System.out.println("I");
            }else if (num == 2){
                System.out.println("II");
            }else if (num == 3){
                System.out.println("III");
            }else if (num == 4){
                System.out.println("IV");
            }else if (num == 5){
                System.out.println("V");
            }else if (num == 6){
                System.out.println("VI");
            }else if (num == 7){
                System.out.println("VII");
            }else if (num == 8){
                System.out.println("VIII");
            }else if (num == 9){
                System.out.println("IX");
            }else System.out.println("X");
        }else System.out.println("El numero no se encuentra entre el 1 y 10");
    }

}

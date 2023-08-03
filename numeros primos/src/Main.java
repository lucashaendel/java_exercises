import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("Ingresar primer numero:");
        int firstNum = Integer.parseInt(sc.nextLine());
        System.out.println("Ingresar ultimo numero:");
        int lastNum = Integer.parseInt(sc.nextLine());
        System.out.println("Numeros primos entre "+firstNum+" y "+lastNum);
        for (int i = firstNum; i <= lastNum; i++){
            for(int j = 1; j <= i; j++){
                if(i%j == 0){
                    count++;
                }
            }
            if(count ==2){
                System.out.println(i);
            }
            count = 0;
        }
    }
}
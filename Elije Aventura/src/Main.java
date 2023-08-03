import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Elige tu propia Aventura!");
        System.out.println("Te despiertas en medio del bosque");
        System.out.println("Que deseas hacer? (correr o caminar)");
        String runWalk = myObj.nextLine();
        if(runWalk.equals("correr")){
            System.out.println("Tras correr por varios kilometros, te desesperas y mueres. FIN!");
        } else if(runWalk.equals("caminar")){
            System.out.println("Llegaste a un lago, que deseas hacer? (cruzarlo o esperar)");
            String crossWait = myObj.nextLine();
            if(crossWait.equals("esperar")){
                System.out.println("De pronto viene un lobo, te ataca y mueres. FIN!");
            } else if (crossWait.equals("cruzarlo")){
                System.out.println("Aparece una bruja y te dice: Decime un numero que no sea divisible ni por 2 o 3 y te dejo seguir");
                int numDiv = Integer.parseInt(myObj.nextLine());
                if (numDiv %2 != 0 && numDiv % 3 != 0){
                    System.out.println("La bruja desaparece y te vienen a rescatar. GANASTE!");
                } else{
                    System.out.println("Tu respuesta es incorrecta y la bruja te convierte en un sapo. PERDISTE!");
                }
            }
        }
    }
}
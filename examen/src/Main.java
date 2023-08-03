import java.util.*;

public class Main {

    public static void main(String[] args) {
        java.util.Scanner lector = new java.util.Scanner(System.in);
        System.out.println("Examen DL2022 - Ingrese el punto a probar (1 a 4)");
        int operacion = Integer.parseInt(lector.nextLine());
        if (operacion == 1) {
            punto1(lector);
        }
        if (operacion == 2) {
            punto2(lector);
        }
        if (operacion == 3) {
            punto3(lector);
        }
        if (operacion == 4) {
            punto4(lector);
        }
    }

    static void punto1(java.util.Scanner lector) {
        int cantidadVacas = 0;
        double cantidadLeche = 0;
        double totalLeche = 0;
        int menorproduccion = 0 ;
        System.out.println("El Tambo");
        System.out.println("Ingresar la cantidad de vacas");
        cantidadVacas = Integer.parseInt(lector.nextLine());
        for (int i = 1; i<=cantidadVacas ; i++){
            System.out.println("Vaca: "+i);
            System.out.println("Ingresar cantidad de leche producida");
            cantidadLeche = Double.parseDouble(lector.nextLine());
            totalLeche = totalLeche + cantidadLeche;
            if(cantidadLeche <10){
                menorproduccion = menorproduccion + 1;
            }
        }
        System.out.println("Produccion total: "+totalLeche+" litros");
        System.out.println("Cantidad de vacas que produjeron menos de 10 litros: "+menorproduccion);

    }

    static void punto2(java.util.Scanner lector) {
        String corredor = "S";
        String name = "";
        String minName = "";
        String maxName = "";
        double time = 0;
        double minTime = 99;
        double maxTime = 0;
        System.out.println("La carrera");
        while (corredor.equals("S") || corredor.equals("s")){
            System.out.println("nombre");
            name = lector.nextLine();
            System.out.println("tiempo");
            time = Double.parseDouble(lector.nextLine());
            if (time<minTime) {
                minTime = time;
                minName = name;
            }
            if (time>maxTime) {
                maxTime = time;
                maxName = name;
            }
            System.out.println("Ingresar nuevo corredor? (S o N)");
            corredor = lector.nextLine();
        }
        System.out.println("Salio primero: "+minName+" con un tiempo de: "+minTime+" segundos");
        System.out.println("Salio ultimo: "+maxName+" con un tiempo de: "+maxTime+" segundos");
    }

    static void punto3(java.util.Scanner lector) {
        System.out.println("Contador de vocales");
        System.out.println("Ingresar texto");
        String texto = lector.nextLine();
        char[] letras = texto.toCharArray();
        // Agregar código aquí
        int count = 0;
        for (int i=0 ; i<letras.length ; i++){
            if (letras[i] == 'a' || letras[i] == 'e' || letras[i] == 'i' || letras[i] == 'o' || letras[i] == 'u') {
                count++;
            }
        }
        System.out.println("La cantidad de vocales es de: "+count);
    }



    static void punto4(java.util.Scanner lector) {
        System.out.println("Buscador de la primer letra en un texto");
        System.out.println("Ingresar texto");
        String texto = lector.nextLine();
        System.out.println("Ingresar letra");

        char letra = lector.nextLine().charAt(0);
        char[] letras = texto.toCharArray();

        // Agregar código aquí
        int position = 0;
        boolean seEncuentra = false;
        for (int i=0 ; i<letras.length ; i++){
            if(letras[i] == letra){
                seEncuentra = true;
                position = i;
                break;
            }
        }
        if(seEncuentra){
            System.out.println("Se encontro la letra en la posicion: "+position);
        } else {
            System.out.println("No se encontro la letra en el texto");
        }
    }

}

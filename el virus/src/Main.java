import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String response;
        int totalPeople=0;
        int totalInfected=0;
        float promMale = 0;
        float promFemale = 0;
        float promInfectedMax = 0;
        float promInfectedMaleMax = 0;
        float totalMale= 0;
        float totalFemale=0;
        System.out.println("Estadisticas Diarias:");
        do{
            totalPeople++;
            System.out.println("Ingresar nombre:");
            String name = sc.nextLine();
            System.out.println("Ingresar sexo (M o F)");
            String genero = sc.nextLine();
            System.out.println("Ingresar edad:");
            int age = Integer.parseInt(sc.nextLine());
            System.out.println("Infectado? (S o N)");
            String infected = sc.nextLine();
            System.out.println("Agregar otra persona? (S o N)");
            response = sc.nextLine();
            if(infected.equals("S") || infected.equals("s")){
                totalInfected++;
                if (genero.equals("M") || genero.equals("m")){
                    promMale++;
                    totalMale++;
                    if(age>60){
                        promInfectedMaleMax++;
                        promInfectedMax++;
                    }
                } else if (genero.equals("F") || genero.equals("f")){
                    promFemale++;
                    totalFemale++;
                    if(age>60){
                        promInfectedMax++;
                        totalFemale++;
                    }
                }
            } else if (genero.equals("M") || genero.equals("m")){
                totalMale++;
            } else if (genero.equals("F") || genero.equals("f")){
                totalFemale++;
            }
        } while (response.equals("S") || response.equals("s"));
        promMale = ((promMale*100)/totalMale);
        promFemale = ((promFemale*100)/totalFemale);
        promInfectedMax = ((promInfectedMax*100)/totalInfected);
        promInfectedMaleMax = ((promInfectedMaleMax*100)/totalInfected);
        System.out.println("Cantidad total de personas que hicieron el test: "+totalPeople);
        System.out.println("Cantidad total de personas infectadas: "+totalInfected);
        System.out.println("Promedio de hombres infectados: "+promMale+" %");
        System.out.println("Promedio de mujeres infectadas: "+promFemale+" %");
        System.out.println("Promedio de mayores de 60 infectados: "+promInfectedMax+" %");
        System.out.println("Promedio de hombres mayores de 60 infectados: "+promInfectedMaleMax+" %");
    }
}
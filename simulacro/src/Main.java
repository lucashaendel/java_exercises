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
        int cantidadProyectosA = 0;
        int cantidadProyectosB = 0;
        double sumaSueldosA = 0;
        double sumaSueldosB = 0;
        String ingresarNuevoProyecto = null;

        // Agregar código aquí
        String newEmployee = "S";
        String proyect = "";
        double sueldosA = 0;
        double sueldosB = 0;
        while (newEmployee.equals("S")){
            System.out.println("Ingresar proyecto: A o B");
            proyect = lector.nextLine();
            if (proyect.equals("A")){
                cantidadProyectosA = cantidadProyectosA+1;
                System.out.println("Ingresar sueldo mensual:");
                sueldosA = Double.parseDouble(lector.nextLine());
                sumaSueldosA = sumaSueldosA + sueldosA;
            } else if (proyect.equals("B")){
                cantidadProyectosB = cantidadProyectosB+1;
                System.out.println("Ingresar sueldo mensual:");
                sueldosB = Double.parseDouble(lector.nextLine());
                sumaSueldosB = sumaSueldosB + sueldosB;
            }
            System.out.println("Desea ingresar otro empleado? S o N");
            newEmployee = lector.nextLine();
        }

        System.out.println("Resultado:");
        System.out.println("Cantidad empleados proyectos tipo A: " + cantidadProyectosA);
        System.out.println("Promedio sueldos proyectos tipo A: " + sumaSueldosA/cantidadProyectosA);
        System.out.println("Cantidad empleados proyectos tipo B: " + cantidadProyectosB);
        System.out.println("Promedio sueldos proyectos tipo B: " + sumaSueldosB/cantidadProyectosB);

    }

    static void punto2(java.util.Scanner lector) {
        System.out.println("Ingresar cantidad de productos");
        int cantidad = Integer.parseInt(lector.nextLine());
        int marcaAOscura = 0;
        int marcaAClara = 0;
        int marcaBOscura = 0;
        int marcaBClara = 0;

        // Agregar código aquí
        String marca ="";
        String color ="";
        for (int i=1 ; i<=cantidad ; i++){
            System.out.println("Producto: "+i);
            System.out.println("Ingresar marca (A o B)");
            marca = lector.nextLine();
            if (marca.equals("A")){
                System.out.println("Ingresar color (C u O)");
                color = lector.nextLine();
                if (color.equals("C")){
                    marcaAClara = marcaAClara+1;
                } else if (color.equals("O")){
                    marcaAOscura = marcaAOscura+1;
                }
            } else if (marca.equals("B")){
                System.out.println("Ingresar color (C u O)");
                color = lector.nextLine();
                if (color.equals("C")){
                    marcaBClara = marcaBClara+1;
                } else if (color.equals("O")){
                    marcaBOscura = marcaBOscura+1;
                }
            }
        }

        System.out.println("Resultado:");
        System.out.println("A - clara: " + marcaAClara);
        System.out.println("A - oscura: " + marcaAOscura);
        System.out.println("B - clara: " + marcaBClara);
        System.out.println("B - oscura: " + marcaBOscura);
        System.out.println("clara: " + (marcaAClara + marcaBClara));
        System.out.println("oscura: " + (marcaBOscura + marcaBOscura));
    }

    static void punto3(java.util.Scanner lector) {
        System.out.println("Ingresar el numero maximo");
        int numeroMaximo = Integer.parseInt(lector.nextLine());
        System.out.println("Resultado:");
        // Agregar código aquí
        for (int i=1; i<=numeroMaximo ; i++){
            if (i%3 == 0 || i%5 == 0){
                System.out.println(i);
            }
        }
    }

    static void punto4(java.util.Scanner lector) {
        System.out.println("Ingresar numeros separados por coma");
        int[] numeros = obtenerVectorDeNumeros(lector.nextLine());
        // Agregar código aquí
        int resultado=0;
        for(int i=0; i<numeros.length ; i++){
            resultado = resultado + numeros[i];
        }
        System.out.println("Resultado: "+resultado);
    }

    // Dada una lista de numeros con coma esta función devuelve un vector con dichos números
    static int[] obtenerVectorDeNumeros(String numerosConComa) {
        int[] numeros = java.util.Arrays.stream(numerosConComa.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();
        return numeros;
    }

}

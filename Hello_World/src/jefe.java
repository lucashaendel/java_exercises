public class jefe {
    package domain;

import java.util.Scanner;

    public class Inicializador {

        public static void main(String[] args) {
            System.out.println("Bienvenido a la empresa ACME");
            Scanner lector = new Scanner(System.in);
            boolean terminar = false;
            Jefe jefe = null;
            do {
                mostrarMenu();
                int opcion = Integer.parseInt(lector.nextLine());
                if (opcion == 1) {
                    jefe = crearJefe(lector);
                } else if (opcion == 2) {
                    contratarEmpleado(lector,jefe);
                } else if (opcion == 3) {
                    despedirEmpleado(jefe);
                } else if (opcion == 4) {
                    mostrarInformacionJefe(jefe);
                } else if (opcion == 5) {
                    terminar = true;
                } else {
                    System.out.println("Opcion incorrecta");
                }
            } while(terminar == false);
        }

        private static void mostrarMenu() {
            String menu = "Ingrese opcion:\n";
            menu += "1. Cargar Jefe / " +
                    "2. Contratar Empleado / " +
                    "3. Despedir Empleado / " +
                    "4. Mostrar informacion Jefe / " +
                    "5. Salir";
            System.out.println(menu);
        }

        private static Jefe crearJefe(Scanner lector) {
            Jefe jefe = new Jefe();
            System.out.println("Ingresar nombre del jefe");
            jefe.setNombre(lector.nextLine());
            System.out.println("Ingresar edad del jefe");
            int edad = Integer.parseInt(lector.nextLine());
            jefe.setEdad(edad);
            return jefe;
        }

        private static void contratarEmpleado(Scanner lector, Jefe jefe) {
            if (jefe != null) {
                Empleado empleado = new Empleado();
                System.out.println("Ingresar nombre del empleado");
                empleado.setNombre(lector.nextLine());
                System.out.println("Ingresar edad del empleado");
                int edad = Integer.parseInt(lector.nextLine());
                empleado.setEdad(edad);
                jefe.contratarEmpleado(empleado);
            } else {
                System.out.println("No se puede contratar empleado si " +
                        "el jefe no esta cargado");
            }
        }

        private static void despedirEmpleado(Jefe jefe) {
            if (jefe != null) {
                jefe.despedirEmpleado();
            } else {
                System.out.println("No se puede despedir empleado " +
                        "si el jefe no esta cargado");
            }
        }

        private static void mostrarInformacionJefe(Jefe jefe ) {
            if (jefe != null) {
                System.out.println(jefe.obtenerDatos());
            } else {
                System.out.println("No se puede mostrar informacion " +
                        "si el jefe no esta cargado");
            }
        }

    }
}

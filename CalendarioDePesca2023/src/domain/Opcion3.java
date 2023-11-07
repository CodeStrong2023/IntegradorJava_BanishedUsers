package domain;

import java.util.Scanner;


public class Opcion3 {
    public static void registrarPesca() {
        Scanner entrada = new Scanner(System.in);
        int MAX_REGISTROS = 99; // Se define una variable en mayus (constante) que representa el número máximo de registros de pescado que se pueden ingresar
        RegistroPescado[] registros = new RegistroPescado[MAX_REGISTROS]; // Creamos un arreglo con la dimension de max_registros
        int n; // se define n que sirve para almacenar la cantidad de registros de pescado que el usuario planea ingresar
        boolean salir = false; 

        do {
            // Pedimos la cantidad al usuario que se almacena en n y se crea el arreglo
            System.out.print("Ingrese cantidad de variedad que pescó (1-" + MAX_REGISTROS + "): ");
            n = entrada.nextInt();
            System.out.println("");
            
            // If para que no se pase de 99 
            if (n >= 1 && n <= MAX_REGISTROS) {
                // Ciclo for para recorrer el arreglo e ingresar tipo y cantidad
                for (int i = 0; i < n; i++) {
                    System.out.print("Ingrese el TIPO de pescado número " + (i + 1) + ": ");
                    String tipo = entrada.next();
                    System.out.println("");
                    System.out.print("Ingrese la CANTIDAD de pescado número " + (i + 1) + ": ");
                    int cantidad = entrada.nextInt();
                    System.out.println("");
                    registros[i] = new RegistroPescado(tipo, cantidad);
                }

                System.out.println("Listado de pesca:");
                System.out.println("");
                System.out.println("Cantidad    |   Tipo");
                
                // Ciclo para mostrar la cantidad y tipo el arreglo
                for (int i = 0; i < n; i++) {
                    System.out.println("   " + registros[i].getCantidad() + "       |   " + registros[i].getTipo());
                }
                
                System.out.println(""); // Salto de Linea
                
                // Preguntamos al usuario que hacer despues de mostrar el arreglo
                System.out.println("Si usted desea SALIR presione:  (1)");
                System.out.println("Si usted desea hacer otro registro de pesca presione: (2)");
                int opcion = entrada.nextInt();

                if (opcion == 1) {
                    salir = true;
                    System.out.println("Salió exitosamente");
                }
            } else {
                // Si ingreso una cantidad mayor a 99 se le da 2 opciones
                System.out.println("Usted ha ingresado una cantidad inválida. Vuelva a intentar.");
                System.out.println("");
                System.out.print("Presione: 1 para volver a ingresar la cantidad, o 2 para salir: ");
                int opcion = entrada.nextInt();

                if (opcion == 2) {
                    salir = true;
                    System.out.println("Salió exitosamente");
                }
            }
        } while (!salir);
    }
}
// Clase para generar tipo y cantidad con sus get y set
class RegistroPescado {
    private String tipo;
    private int cantidad;

    public RegistroPescado(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}

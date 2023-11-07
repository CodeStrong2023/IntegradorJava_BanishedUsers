package domain;

import static domain.AnimacionInicio.AnimacionInicio;
import static domain.Opcion1.submenuRegistro;
import java.io.IOException;
import java.util.Scanner;


public class Menu {
    
    static Scanner entrada = new Scanner(System.in);
    static int opcion = 0; // Variable para la opción elegida del usuario
    
    public static void Menu()throws IOException, InterruptedException{
        System.out.println("Maximiza ventana-consola y presiona ENTER :D");
        int read = System.in.read(); // Espera el ENTER para avanzar
        AnimacionInicio(); // Llamamos al método AnimacionInicio
            
        while(opcion != 4){ // Ciclo para continuar con el menu hasta que se digite 4 (Opcion4)
	try{ //Try catch para evitar que el programa termine si hay un error
            System.out.println(" _______________M E N U_______________");
            System.out.println("|                                     |");
            System.out.println("|           1. REGISTRO               |");
            System.out.println("|   2. CONSULTAR EL ESTADO DE LA LUNA |");
            System.out.println("|       3. REGISTRO DE PESCA          |");
            System.out.println("|            4. SALIR                 |");
            System.out.println("|_____________________________________|");
            
        // Digitar una opción
        System.out.println("");
        System.out.print(" Digite una opción --> ");
	opcion = Integer.parseInt(entrada.nextLine());
        System.out.println("");
	
	//Switch para las opciones
	switch(opcion){
	case 1 -> {
            submenuRegistro(); // Llamamos al SubMenu de Opcion1
            break;}
	case 2 -> {
            Opcion2.calcularFaseLunar(); // Llamamos al método de la clase Opcion2
            break;
        }
	case 3 -> {
            Opcion3.registrarPesca(); // Llamamos a la método de la clase Opcion3
            break;}
	case 4 -> {
            Opcion4.Salir();
            break;
        }
	default -> System.out.println("Error! El número: " + opcion + " no es una opción");
	}
				
	System.out.println("\n");
				
	}catch(Exception e){ // Por si hay un error imprime el msj y vuelve a ejecutar el ciclo while
            System.out.println("Error! Digite una opción");
            }
        }
    }
}

package test;

import static domain.AnimacionInicio.AnimacionInicio;
import domain.FaseLunar;
import static domain.Registro.submenuRegistro;
import domain.RegistroPez;
import domain.Salir;
import java.io.IOException;
import java.util.Scanner;

public class testMenu {
    	static Scanner entrada = new Scanner(System.in);
	static int opcion = 0; // Variable para la opción elegida del usuario
        
        public static void main(String[] args)throws IOException, InterruptedException{
            
        System.out.println("Maximiza ventana-consola y presiona ENTER :D");
        int read = System.in.read(); // Espera el ENTER para avanzar
        AnimacionInicio(); // Llamamos al método AnimacionInicio
            
        while(opcion != 4){ // Ciclo para continuar con el menu hasta que se digite 4 (Salir)
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
            submenuRegistro(); // Llamamos al SubMenu de Registro
            break;}
	case 2 -> {
            FaseLunar.calcularFaseLunar(); // Llamamos al método de la clase FaseLunar
            break;
        }
	case 3 -> {
            RegistroPez.registrarPesca(); // Llamamos a la método de la clase RegistroPez
            break;}
	case 4 -> {
            Salir.Salir();
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


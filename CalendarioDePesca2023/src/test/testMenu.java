package test;

import java.util.Scanner;

public class testMenu {
    	static Scanner entrada = new Scanner(System.in);
	static int opcion = 0; //opción elegida del usuario
        
        public static void main(String[] args){
            
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
        System.out.print(" Digite una opción --> ");
	opcion = Integer.parseInt(entrada.nextLine());
        System.out.println("");
	
	//Switch para las opciones
	switch(opcion){
	case 1 -> {
            // Menu de Registro;
            break;}
	case 2 -> {
            // Consultar estado de la Luna
            break;
        }
	case 3 -> {
            // Registro de Pesca
            break;}
	case 4 -> {
            // Salir (agregar mensaje)
            break;
        }
	default -> System.out.println("Error! El número: " + opcion + " no es una opción");
	}
				
	System.out.println("\n");
				
	}catch(Exception e){
            System.out.println("Error! Digite una opción");
            }
        }
    }
        
  
    // Define la clase Usuario
    static class Usuario {
        private String nombre;
        private String apellido;
        private int edad;
        private String domicilio;

        public Usuario(String nombre, String apellido, int edad, String domicilio) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.domicilio = domicilio;
        }

        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public int getEdad() {
            return edad;
        }

        public String getDomicilio() {
            return domicilio;
        }
    }
}


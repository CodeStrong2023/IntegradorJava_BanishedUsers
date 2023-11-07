package domain;

// Clase para la opción 2 del menú

import java.util.Scanner;

public class Opcion2 {
    static Scanner entrada = new Scanner(System.in);
    static int mesElegido;
    static int fecha;
    // Método para calcular la fase lunar por ingreso de mes y fecha
    public static void calcularFaseLunar(){
        
        do {
            System.out.println("Ingrese un mes para saber el estado de la luna (1-12): ");
            System.out.println("");
            System.out.println("""
            1. Enero
            2. Febrero
            3. Marzo
            4. Abril
            5. Mayo
            6. Junio
            7. Julio
            8. Agosto
            9. Septiembre
            10. Octubre
            11. Noviembre
            12. Diciembre
            """);
            
            mesElegido = Integer.parseInt(entrada.nextLine());  

            // condicional para verificar si el valor de "mesElegido" está dentro del rango (1-12)
            if (mesElegido < 1 || mesElegido > 12) { // Si el valor No es valido el ciclo do while se repite
                System.out.println("Mes inválido.");
                System.out.println("");
            // si el valor es válido, obtiene el nombre del mes correspondiente (método 3) y muestra el msj
            } else {
                String nombreMes = obtenerNombreMes(mesElegido);
                System.out.println("Usted ha seleccionado el mes de: " + nombreMes);
                System.out.println("");
            
            switch (mesElegido){ // utilizamos la estrucutura switch para entrar en los case (1-12) dependiendo el mes seleccionado
                case 1: // Para Enero
                    while (true) { // se utiliza el ciclo while para verificar si el valor de fecha esta dentro del rango
                        System.out.print("Ingrese un día del mes: ");
                        fecha = Integer.parseInt(entrada.nextLine());
                        if (fecha >= 1 && fecha <= 31) {
                            break; // fecha válida, sale del ciclo interno
                        } else {
                            System.out.println("");
                            System.out.println("Día inválido. Ingrese un valor entre 1 y 31");
                            System.out.println("");
                        }
                    }
                    System.out.println("");
                        if (fecha >= 1 && fecha <= 5) { // entra al condicial if-elseif y verificamos la fecha ingresada correspondiende al estado lunar 
                            System.out.println("El estado de la luna es: Creciente");
                        } else if (fecha >= 6 && fecha <= 13) {
                            System.out.println("El estado de la luna es: Llena");
                        } else if (fecha >= 14 && fecha <= 20) {
                            System.out.println("El estado de la luna es: Menguante");
                        } else if (fecha >= 21 && fecha <= 27) {
                            System.out.println("El estado de la luna es: Nueva");
                        } else if (fecha >= 28 && fecha <= 31) {
                            System.out.println("El estado de la luna es: Creciente");
                        }
                        break;
                case 2: // Febrero
                    while (true) {
                        System.out.print("Ingrese un día del mes: ");
                        fecha = Integer.parseInt(entrada.nextLine());
                        if (fecha >= 1 && fecha <= 28) {
                            break; // Fecha válida, salir del bucle interno.
                        } else {
                            System.out.println("");
                            System.out.println("Día inválido. Ingrese un valor entre 1 y 28");
                            System.out.println("");
                        }
                    }
                    System.out.println("");
                    if (fecha >= 1 && fecha <= 4){
                        System.out.println("El estado de la luna es: Creciente");
                    } else if (fecha >= 5 && fecha <= 12){
                        System.out.println("El estado de la luna es: Llena");
                    } else if (fecha >= 13 && fecha <= 19){
                        System.out.println("El estado de la luna es: Menguante");
                    } else if (fecha >= 20 && fecha <= 26){
                        System.out.println("El estado de la luna es: Nueva");
                    } else if (fecha >= 27 && fecha <= 28){
                        System.out.println("El estado de la luna es: Creciente");
                    }
                    break;
                case 3: // Marzo
                    while (true) {
                        System.out.print("Ingrese un día del mes: ");
                        fecha = Integer.parseInt(entrada.nextLine());
                        if (fecha >= 1 && fecha <= 31) {
                            break; // Fecha válida, salir del bucle interno.
                        } else {
                            System.out.println("");
                            System.out.println("Día inválido. Ingrese un valor entre 1 y 31");
                            System.out.println("");
                        }
                    }
                    System.out.println("");
                    if (fecha >= 1 && fecha <= 6){
                        System.out.println("El estado de la luna es: Creciente");
                    } else if (fecha >= 7 && fecha <= 13){
                        System.out.println("El estado de la luna es: Llena");
                    } else if (fecha >= 14 && fecha <= 20){
                        System.out.println("El estado de la luna es: Menguante");
                    } else if (fecha >= 21 && fecha <= 27){
                        System.out.println("El estado de la luna es: Nueva");
                    } else if (fecha >= 28 && fecha <= 31){
                        System.out.println("El estado de la luna es: Creciente");
                    } 
                    break;
                case 4: // Abril
                    while (true) {
                        System.out.print("Ingrese un día del mes: ");
                        fecha = Integer.parseInt(entrada.nextLine());
                        if (fecha >= 1 && fecha <= 29) {
                            break; // Fecha válida, salir del bucle interno.
                        } else {
                            System.out.println("");
                            System.out.println("Día inválido. Ingrese un valor entre 1 y 29");
                            System.out.println("");
                        }
                    }
                    System.out.println("");
                    if (fecha >= 1 && fecha <= 5){
                        System.out.println("El estado de la luna es: Creciente");
                    } else if (fecha >= 6 && fecha <= 12){
                        System.out.println("El estado de la luna es: Llena");
                    } else if (fecha >= 13 && fecha <= 19){
                        System.out.println("El estado de la luna es: Menguante");
                    } else if (fecha >= 20 && fecha <= 26){
                        System.out.println("El estado de la luna es: Nueva");
                    } else if (fecha >= 27 && fecha <= 29){
                        System.out.println("El estado de la luna es: Creciente");
                    }
                    break;
                case 5: // Mayo
                    while (true) {
                        System.out.print("Ingrese un día del mes: ");
                        fecha = Integer.parseInt(entrada.nextLine());
                        if (fecha >= 1 && fecha <= 31) {
                            break; // Fecha válida, salir del bucle interno.
                        } else {
                            System.out.println("");
                            System.out.println("Día inválido. Ingrese un valor entre 1 y 31");
                            System.out.println("");
                        }
                    }
                    System.out.println("");
                    if (fecha >= 1 && fecha <= 4){
                        System.out.println("El estado de la luna es: Creciente");
                    } else if (fecha >= 5 && fecha <= 11){
                        System.out.println("El estado de la luna es: Llena");
                    } else if (fecha >= 12 && fecha <= 18){
                        System.out.println("El estado de la luna es: Menguante");
                    } else if (fecha >= 19 && fecha <= 26){
                        System.out.println("El estado de la luna es: Nueva");
                    } else if (fecha >= 27 && fecha <= 31){
                        System.out.println("El estado de la luna es: Creciente");
                    } 
                    break;
                case 6: // Junio
                    while (true) {
                        System.out.print("Ingrese un día del mes: ");
                        fecha = Integer.parseInt(entrada.nextLine());
                        if (fecha >= 1 && fecha <= 30) {
                            break; // Fecha válida, salir del bucle interno.
                        } else {
                            System.out.println("");
                            System.out.println("Día inválido. Ingrese un valor entre 1 y 30");
                            System.out.println("");
                        }
                    }
                    System.out.println("");
                    if (fecha >= 1 && fecha <= 3){
                        System.out.println("El estado de la luna es: Creciente");
                    } else if (fecha >= 4 && fecha <= 9){
                        System.out.println("El estado de la luna es: Llena");
                    } else if (fecha >= 10 && fecha <= 17){
                        System.out.println("El estado de la luna es: Menguante");
                    } else if (fecha >= 18 && fecha <= 25){
                        System.out.println("El estado de la luna es: Nueva");
                    } else if (fecha >= 26 && fecha <= 30){
                        System.out.println("El estado de la luna es: Creciente");
                    } 
                    break;
                case 7: // Julio
                    while (true) {
                        System.out.print("Ingrese un día del mes: ");
                        fecha = Integer.parseInt(entrada.nextLine());
                        if (fecha >= 1 && fecha <= 29) {
                            break; // Fecha válida, salir del bucle interno.
                        } else {
                            System.out.println("");
                            System.out.println("Día inválido. Ingrese un valor entre 1 y 29");
                            System.out.println("");
                        }
                    }
                    System.out.println("");
                    if (fecha >= 1 && fecha <= 2){
                        System.out.println("El estado de la luna es: Creciente");
                    } else if (fecha >= 3 && fecha <= 8){
                        System.out.println("El estado de la luna es: Llena");
                    } else if (fecha >= 9 && fecha <= 16){
                        System.out.println("El estado de la luna es: Menguante");
                    } else if (fecha >= 17 && fecha <= 24){
                        System.out.println("El estado de la luna es: Nueva");
                    } else if (fecha >= 25 && fecha <= 29){
                        System.out.println("El estado de la luna es: Creciente");
                    }
                    break;
                case 8: // Agosto
                    while (true) {
                        System.out.print("Ingrese un día del mes: ");
                        fecha = Integer.parseInt(entrada.nextLine());
                        if (fecha >= 1 && fecha <= 31) {
                            break; // Fecha válida, salir del bucle interno.
                        } else {
                            System.out.println("");
                            System.out.println("Día inválido. Ingrese un valor entre 1 y 31");
                            System.out.println("");
                        }
                    }
                    System.out.println("");
                    if (fecha >= 1 && fecha <= 7){
                        System.out.println("El estado de la luna es: Neutra");
                    } else if (fecha >= 8 && fecha <= 15){
                        System.out.println("El estado de la luna es: Menguante");
                    } else if (fecha >= 15 && fecha <= 23){
                        System.out.println("El estado de la luna es: Nueva");
                    } else if (fecha >= 24 && fecha <= 29){
                        System.out.println("El estado de la luna es: Creciente");
                    } else if (fecha >= 30 && fecha <= 31){
                        System.out.println("El estado de la luna es: Neutra");
                    }
                    break;
                case 9: // Septiembre
                    while (true) {
                        System.out.print("Ingrese un día del mes: ");
                        fecha = Integer.parseInt(entrada.nextLine());
                        if (fecha >= 1 && fecha <= 30) {
                            break; // Fecha válida, salir del bucle interno.
                        } else {
                            System.out.println("");
                            System.out.println("Día inválido. Ingrese un valor entre 1 y 30");
                            System.out.println("");
                        }
                    }
                    System.out.println("");
                    if (fecha >= 1 && fecha <= 5){
                        System.out.println("El estado de la luna es: Neutra");
                    } else if (fecha >= 6 && fecha <= 13){
                        System.out.println("El estado de la luna es: Menguante");
                    } else if (fecha >= 14 && fecha <= 21){
                        System.out.println("El estado de la luna es: Nueva");
                    } else if (fecha >= 22 && fecha <= 28){
                        System.out.println("El estado de la luna es: Creciente");
                    } else if (fecha >= 29 && fecha <= 30){
                        System.out.println("El estado de la luna es: Neutra");
                    } 
                    break;
                case 10: // Octubre
                    while (true) {
                        System.out.print("Ingrese un día del mes: ");
                        fecha = Integer.parseInt(entrada.nextLine());
                        if (fecha >= 1 && fecha <= 31) {
                            break; // Fecha válida, salir del bucle interno.
                        } else {
                            System.out.println("");
                            System.out.println("Día inválido. Ingrese un valor entre 1 y 31");
                            System.out.println("");
                        }
                    }
                    System.out.println("");
                    if (fecha >= 1 && fecha <= 5){
                        System.out.println("El estado de la luna es: Neutra");
                    } else if (fecha >= 6 && fecha <= 13){
                        System.out.println("El estado de la luna es: Menguante");
                    } else if (fecha >= 14 && fecha <= 21){
                        System.out.println("El estado de la luna es: Nueva");
                    } else if (fecha >= 22 && fecha <= 27){
                        System.out.println("El estado de la luna es: Creciente");
                    } else if (fecha >= 28 && fecha <= 31){
                        System.out.println("El estado de la luna es: Neutra");
                    }
                    break;
                case 11: // Noviembre
                    while (true) {
                        System.out.print("Ingrese un día del mes: ");
                        fecha = Integer.parseInt(entrada.nextLine());
                        if (fecha >= 1 && fecha <= 30) {
                            break; // Fecha válida, salir del bucle interno.
                        } else {
                            System.out.println("");
                            System.out.println("Día inválido. Ingrese un valor entre 1 y 30");
                            System.out.println("");
                        }
                    }
                    System.out.println("");
                    if (fecha >= 1 && fecha <= 4){
                        System.out.println("El estado de la luna es: Neutra");
                    } else if (fecha >= 5 && fecha <= 12){
                        System.out.println("El estado de la luna es: Menguante");
                    } else if (fecha >= 13 && fecha <= 19){
                        System.out.println("El estado de la luna es: Nueva");
                    } else if (fecha >= 20 && fecha <= 26){
                        System.out.println("El estado de la luna es: Creciente");
                    } else if (fecha >= 27 && fecha <= 30){
                        System.out.println("El estado de la luna es: Neutra");
                    } else {
                        System.out.println("Día inválido. Ingrese un valor entre 1 y 30");
                    } 
                    break;
                case 12: // Diciembre
                    while (true) {
                        System.out.print("Ingrese un día del mes: ");
                        fecha = Integer.parseInt(entrada.nextLine());
                        if (fecha >= 1 && fecha <= 30) {
                            break; // Fecha válida, salir del bucle interno.
                        } else {
                            System.out.println("");
                            System.out.println("Día inválido. Ingrese un valor entre 1 y 30");
                            System.out.println("");
                        }
                    }
                    System.out.println("");
                    if (fecha >= 1 && fecha <= 4){
                        System.out.println("El estado de la luna es: Neutra");
                    } else if (fecha >= 5 && fecha <= 11){
                        System.out.println("El estado de la luna es: Menguante");
                    } else if (fecha >= 12 && fecha <= 18){
                        System.out.println("El estado de la luna es: Nueva");
                    } else if (fecha >= 19 && fecha <= 25){
                        System.out.println("El estado de la luna es: Creciente");
                    } else if (fecha >= 26 && fecha <= 30){
                        System.out.println("El estado de la luna es: Neutra");
                    }
                    break;               
            }
                System.out.println("");
                int respuesta; // inicamos una variable para decidir que hacer despues de mostrar el estado lunar
                do {
                    System.out.print("Desea ingresar otra fecha? (1 = Sí, 2 = No): "); // damos 2 opciones
                    respuesta = Integer.parseInt(entrada.nextLine());
                    
                    if (respuesta != 1 && respuesta != 2) { // condicional para verficar si el valor es valido en el rango o no
                    System.out.println("Opción no válida. Ingrese 1 para Sí o 2 para No");
                    }
                } while (respuesta != 1 && respuesta != 2); // do while para repetir si el valor no es valido
                if (respuesta == 2) { 
                    break; // sale del bucle si el usuario elige "No" y regresa al menú principal
            }
        }
    }while(true);
}
        
    
    
    // Método para obtener el nombre del mes
    public static String obtenerNombreMes(int mes) {
        String[] nombresMeses = { // Usamos un array 0 = enero, 1 = febrero..
        "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
            if (mes >= 1 && mes <= 13) {
                return nombresMeses[mes - 1]; // -1 para que enero sea 1, febrero 2, etc..
            }
                return "Mes Desconocido";
            }    
}



package opcion2mejorada;

import java.util.Scanner;


public class Ejecutable {
    public static void main(String[] args) {
//        boolean salir = false;
        Scanner entrada = new Scanner(System.in);
        Calendariolunar cl = new Calendariolunar();
        do{
            
            
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
            
            while (true) {
                System.out.print("Mes: ");
                cl.mes = Integer.parseInt(entrada.nextLine());
                System.out.print("Día: ");
                cl.dia = Integer.parseInt(entrada.nextLine());
                if (cl.mes >= 1 && cl.mes <= 12 || cl.dia >= 1 && cl.dia <= 31) {
                    break;
                } else {
                    System.out.println("");
                    System.out.println("Fecha Incorrecta, Ingrese otra");
                    System.out.println("");
                }
            }
            
            System.out.println("");
            String nombreMes = obtenerNombreMes(cl.mes);
            System.out.println("• Fecha: " + cl.dia + " de " + nombreMes + " de 2023");
            System.out.println("");
        
            cl.algoritmo();

                if ((cl.total >= 0 && cl.total <= 6) || (cl.total == 29)) {
                    System.out.println("• Fase Lunar: Luna Nueva");
                    System.out.println("");
                    System.out.println("• Pronostrico de Pique: Bueno");
                } else if (cl.total >= 7 && cl.total <= 13) {
                    System.out.println("• Fase Lunar: Cuarto Creciente");
                    System.out.println("");
                    System.out.println("• Pronostrico de Pique: Bueno");
                } else if (cl.total >= 14 && cl.total <= 20) {
                    System.out.println("• Fase Lunar: Luna Llena");
                    System.out.println("");
                    System.out.println("• Pronostrico de Pique: Regular-Malo");
                } else {
                    System.out.println("• Fase Lunar: Cuarto Menguante");
                    System.out.println("");
                    System.out.println("• Pronostrico de Pique: Regular");
                }
            
            System.out.println("");    
                
            int respuesta;
                do {
                    System.out.print("Desea ingresar otra fecha? (1 = Sí, 2 = No): ");
                    respuesta = Integer.parseInt(entrada.nextLine());
                    
                    if (respuesta != 1 && respuesta != 2) {
                    System.out.println("Opción no válida. Ingrese 1 para Sí o 2 para No");
                    }
                } while (respuesta != 1 && respuesta != 2);
                if (respuesta == 2) { 
                    break;
            }
        }while(true);
    }
    
    public static String obtenerNombreMes(int mes) {
        String[] nombresMeses = {
        "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
            if (mes >= 1 && mes <= 13) {
                return nombresMeses[mes - 1];
            }
                return "Mes Desconocido";
            }
}
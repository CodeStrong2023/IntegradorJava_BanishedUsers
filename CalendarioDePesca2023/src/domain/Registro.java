package domain;
import java.util.ArrayList;
import java.util.Scanner;

public class Registro {
    static Scanner entrada = new Scanner(System.in);
    static int opcion = 0; //opción elegida del usuario
    static ArrayList<Registro> listaUsuarios = new ArrayList<>(); // Colección para almacenar usuarios

        private String nombre;
        private String apellido;
        private int edad;
        private String domicilio;
        
        // Definimos el constructor método con sus get
        public Registro(String nombre, String apellido, int edad, String domicilio) {
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
        
        
        // Definimos método para el submenu
        public static void submenuRegistro() {
        int opcion;
        while (true) {
            System.out.println("---- Submenú de Registro ----");
            System.out.println("1. Registrarse");
            System.out.println("2. Mostrar Usuarios Registrados");
            System.out.println("3. Volver al menú principal");
            System.out.println("Digite una opción");

            opcion = Integer.parseInt(entrada.nextLine());
            
            switch (opcion) {
                case 1 -> registrarUsuario();
                case 2 -> mostrarUsuariosRegistrados();
                case 3 -> {return; // Volver al menú principal
                }
                default -> System.out.println("Número no reconocido");
            }
        }
    }
        
        public static void registrarUsuario() {
            System.out.println("Ingrese su Nombre:");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese su Apellido:");
            String apellido = entrada.nextLine();
            System.out.println("Ingrese su Edad:");
            int edad = Integer.parseInt(entrada.nextLine());
            System.out.println("Ingrese su Domicilio:");
            String domicilio = entrada.nextLine();

            // Crear un nuevo usuario y agregarlo a la lista
            Registro nuevoUsuario = new Registro(nombre, apellido, edad, domicilio);
            listaUsuarios.add(nuevoUsuario);

            System.out.println("Registro exitoso.");
    }

        public static void mostrarUsuariosRegistrados() {
            System.out.println("Usuarios Registrados:");
                for (Registro usuario : listaUsuarios) {
                System.out.println("NOMBRE: " + usuario.getNombre() + " " + usuario.getApellido() + " | " + "EDAD: " + usuario.getEdad() + " | " + "DIRECCIÓN: " + usuario.getDomicilio());
//            System.out.println("Nombre: " + usuario.getNombre());
//            System.out.println("Apellido: " + usuario.getApellido());
//            System.out.println("Edad: " + usuario.getEdad());
//            System.out.println("Domicilio: " + usuario.getDomicilio());
                System.out.println();
        }
    }
    }


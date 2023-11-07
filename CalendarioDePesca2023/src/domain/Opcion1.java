package domain;
import java.util.ArrayList; // Importamos ArrayList para utilizar arreglos dinámicas 
import java.util.Scanner;

public class Opcion1 {
    static Scanner entrada = new Scanner(System.in);
//    static int opcion = 0; //opción elegida del usuario
    static ArrayList<Opcion1> listaUsuarios = new ArrayList<>(); // arreglo para almacenar usuarios

        private String nombre;
        private String apellido;
        private int edad;
        private String direccion;
        
        // Definimos el constructor método con sus get
        public Opcion1(String nombre, String apellido, int edad, String direccion) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.direccion = direccion;
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

        public String getDireccion() {
            return direccion;
        }
        
        
        // Definimos método para el submenu
        public static void submenuRegistro() {
        int opcion;
        while (true) {
            System.out.println(" ____________S U B  M E N U___________ ");
            System.out.println("|                                     |");
            System.out.println("|           1. REGISTRARSE            |");
            System.out.println("|   2. MOSTRAR USUARIOS REGISTRADOS   |");
            System.out.println("|     3. VOLVER AL MENU PRINCIPAL     |");
            System.out.println("|_____________________________________|");
            System.out.println("");
            System.out.print("Digite una opción: ");
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
            System.out.print("Ingrese su Nombre: ");
            String nombre = entrada.nextLine();
            System.out.print("Ingrese su Apellido: ");
            String apellido = entrada.nextLine();
            System.out.print("Ingrese su Edad: ");
            int edad = Integer.parseInt(entrada.nextLine());
            System.out.print("Ingrese su Dirección: ");
            String direccion = entrada.nextLine();

            // Crear un nuevo usuario y agregarlo a la lista
            Opcion1 nuevoUsuario = new Opcion1(nombre, apellido, edad, direccion);
            listaUsuarios.add(nuevoUsuario); // método especial de arraylist para agregar el dato (.add)

            System.out.println("Registro exitoso.");
    }

        public static void mostrarUsuariosRegistrados() {
            System.out.println("");
            System.out.println("Usuarios Registrados:");
                for (Opcion1 usuario : listaUsuarios) { // Ciclo para listar los usuarios dentro del arreglo dinamico
                    System.out.println("");
                System.out.println("NOMBRE: " + usuario.getNombre() + " " + usuario.getApellido() + " | " + "EDAD: " + usuario.getEdad() + " | " + "DIRECCIÓN: " + usuario.getDireccion());
//            System.out.println("Nombre: " + usuario.getNombre());
//            System.out.println("Apellido: " + usuario.getApellido());
//            System.out.println("Edad: " + usuario.getEdad());
//            System.out.println("Domicilio: " + usuario.getDomicilio());
                System.out.println();
        }
    }
    }


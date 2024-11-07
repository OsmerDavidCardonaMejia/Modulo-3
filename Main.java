package biblioteca_virtual;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        biblioteca.agregarLibro(new Libro("Cien años de soledad", "Gabriel Garcia Márquez", 1967, "Novela", true));
        biblioteca.agregarLibro(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605, "Novela", true));

        do 
        {
            System.out.println("\n---- Menu Biblioteca Virtual Osmer Cardona----");
            System.out.println("1. Agregar libro");
            System.out.println("2. Buscar libro por titulo");
            System.out.println("3. Buscar libro por autor");
            System.out.println("4. Prestar libro");
            System.out.println("5. Devolver libro");
            System.out.println("6. Mostrar libros disponibles");
            System.out.println("7. Calificar libro");
            System.out.println("8. Salir");
            System.out.print("Elija una opcion: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch(opcion)
            {
                case 1:
                    System.out.print("Ingrese el titulo del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese el año de publicacion: ");
                    int anio = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Ingrese el genero del libro: ");
                    String genero = scanner.nextLine();
                    System.out.print("¿Esta disponible el libro? (true/false): ");
                    boolean disponible = scanner.nextBoolean();
                    biblioteca.agregarLibro(new Libro(titulo, autor, anio, genero, disponible));
                    System.out.println("Libro agregado con exito.");
                    break;

                case 2:
                    System.out.print("Ingrese el titulo del libro: ");
                    String tituloBusqueda = scanner.nextLine();
                    biblioteca.buscarPorTitulo(tituloBusqueda);
                    break;

                case 3:
                    System.out.print("Ingrese el autor del libro: ");
                    String autorBusqueda = scanner.nextLine();
                    biblioteca.buscarPorAutor(autorBusqueda);
                    break;

                case 4:
                    System.out.print("Ingrese el titulo del libro a prestar: ");
                    String tituloPrestar = scanner.nextLine();
                    biblioteca.prestarLibro(tituloPrestar);
                    break;

                case 5:
                    System.out.print("Ingrese el titulo del libro a devolver: ");
                    String tituloDevolver = scanner.nextLine();
                    biblioteca.devolverLibro(tituloDevolver);
                    break;

                case 6:
                    System.out.println("Libros disponibles en la biblioteca:");
                    biblioteca.mostrarLibrosDisponibles();
                    break;

                case 7:
                    System.out.print("Ingrese el titulo del libro a calificar: ");
                    String tituloCalificar = scanner.nextLine();
                    System.out.print("Ingrese la calificación (1-5): ");
                    int calificacion = scanner.nextInt();
                    biblioteca.calificarLibro(tituloCalificar, calificacion);
                    break;

                case 8:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion no valida, intente de nuevo.");
            }

        } while (opcion != 8);

        scanner.close(); 
    }
}

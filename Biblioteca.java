package biblioteca_virtual;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) 
    {
        libros.add(libro);
    }

    public void buscarPorTitulo(String titulo)
    {
        for (Libro libro : libros)
        {
            if (libro.getTitulo().equalsIgnoreCase(titulo))
            {
                System.out.println(libro);
                return;
            }
        }
        System.out.println("No se encontro el libro con titulo: " + titulo);
    }

    public void buscarPorAutor(String autor) 
    {
        for (Libro libro : libros) 
        {
            if (libro.getAutor().equalsIgnoreCase(autor))
            {
                System.out.println(libro);
            }
        }
    }

    public void prestarLibro(String titulo)
    {
        for (Libro libro : libros)
        {
            if (libro.getTitulo().equalsIgnoreCase(titulo) && libro.isDisponible()) 
            {
                libro.setDisponible(false);
                System.out.println("Libro prestado: " + titulo);
                return;
            }
        }
        System.out.println("El libro no esta disponible o no se encontro: " + titulo);
    }

    public void devolverLibro(String titulo) 
    {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo) && !libro.isDisponible()) 
            {
                libro.setDisponible(true);
                System.out.println("Libro devuelto: " + titulo);
                return;
            }
        }
        System.out.println("No se encontro el libro prestado: " + titulo);
    }

    public void mostrarLibrosDisponibles() 
    {
        for (Libro libro : libros) 
        {
            if (libro.isDisponible()) 
            {
                System.out.println(libro);
            }
        }
    }

    public void calificarLibro(String titulo, int calificacion)
    {
        for (Libro libro : libros)
        {
            if (libro.getTitulo().equalsIgnoreCase(titulo))
            {
                libro.agregarCalificacion(calificacion);
                System.out.println("Libro calificado: " + titulo);
                return;
            }
        }
        System.out.println("No se encontro el libro con titulo: " + titulo);
    }
}

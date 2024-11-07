package biblioteca_virtual;

import java.util.ArrayList;

public class Libro 
{
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String genero;
    private boolean disponible;
    private ArrayList<Integer> calificaciones;

    public Libro(String titulo, String autor, int anioPublicacion, String genero, boolean disponible)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.genero = genero;
        this.disponible = disponible;
        this.calificaciones = new ArrayList<>();
    }

    public String getTitulo()
    {
        return titulo;
    }

    public String getAutor()
    {
        return autor;
    }

    public int getAnioPublicacion()
    {
        return anioPublicacion;
    }

    public String getGenero() 
    {
        return genero;
    }

    public boolean isDisponible()
    {
        return disponible;
    }

    public void setDisponible(boolean disponible) 
    {
        this.disponible = disponible;
    }

    public void agregarCalificacion(int calificacion)
    {
        calificaciones.add(calificacion);
    }

    public double obtenerPromedioCalificaciones()
    {
        if (calificaciones.isEmpty()) 
        {
            return 0.0;
        }
        int suma = 0;
        for (int calificacion : calificaciones) 
        {
            suma += calificacion;
        }
        return (double) suma / calificaciones.size();
    }

    @Override
    public String toString()
    {
        return "Titulo: " + titulo + ", Autor: " + autor + ", Anio de publicacion: " + anioPublicacion +
               ", Genero: " + genero + ", Disponible: " + (disponible ? "Si" : "No") +
               ", Calificación promedio: " + obtenerPromedioCalificaciones();
    }
}

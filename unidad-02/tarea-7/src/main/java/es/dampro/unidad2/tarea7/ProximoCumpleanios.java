package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 *Clase que calcula cuando es el proximo cumpleaños de una persona.
 * @author ahdodev
 * @version 1.0.0
 */
public final class ProximoCumpleanios {
    private ProximoCumpleanios() { }

    /**
     * Programa principal. Calcula mi proximo cumpleanios, el 03/12/2004 contando desde hoy.
     * @param args
     */
    public static void main(String[] args) {
        LocalDate nacimiento = LocalDate.of(2004,12,3);
        LocalDate hoy = LocalDate.now();
        LocalDate proximo = calcularProximoCumpleanios(nacimiento, hoy);
        System.out.println("Nacio el: " + nacimiento);
        System.out.println("Su proximo cumpleanios es el: " + proximo);
    }

    /**
     *Funcion que calcula la fecha del proximo cumpleanios,contando primero si hoy es el dia.
     * Pongo el cumpleaños en el año de hoy y si ya ha pasado, en el anio siguiente. withYear cambia
     * solo el 29/02 por el 28/02 si el anio no es bisiesto. Si el nacimiento es futuro ocurre un
     * IllegalArgumentException.
     * @param nacimiento LocalDate fecha de nacimiento
     * @param hoy LocalDate fecha de hoy
     * @return LocalDate con la fecha del proximo  cumpleanios
     */
    public static LocalDate calcularProximoCumpleanios(LocalDate nacimiento, LocalDate hoy) {
        if(nacimiento.isAfter(hoy)){
            throw new IllegalArgumentException("El nacimiento no puede ser en futuro");
        }
        LocalDate cumple = nacimiento.withYear(hoy.getYear());
        if (cumple.isBefore(hoy)) {
            return nacimiento.withYear(hoy.getYear() + 1);
        }
        return cumple;
    }
}

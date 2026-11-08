package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Clase que comprueba si un texto es una fecha válida en formato dd/MM/uuuu.
 * @author ahdodev
 * @version 1.0.0
 */
public final class ValidadorFechas {
    private ValidadorFechas() { }

    /**
     * Programa principal. Prueba una fecha que existe y otra que no.
     */
    public static void main(String[] args) {
        System.out.println("29/02/2024 es válida: " + validarFecha("29/02/2024"));
        try {
            validarFecha("29/02/2025");
        } catch (DateTimeParseException e) {
            System.out.println("29/02/2025 no es válida, 2025 no es bisiesto");
        }
    }

    /**
     * Pasa un texto tipo "29/02/2024" a LocalDate. Uso el formato dd/MM/uuuu en
     * modo STRICT, así que el día y el mes tienen que tener dos cifras y la fecha
     * tiene que existir. Si no, LocalDate.parse lanza DateTimeParseException.
     * @param texto String con la fecha escrita como dd/MM/uuuu
     * @return LocalDate con la fecha ya convertida
     */
    public static LocalDate validarFecha(String texto) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/uuuu")
                .withResolverStyle(ResolverStyle.STRICT);
        return LocalDate.parse(texto, formato);
    }
}
package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Clase que pasa una fecha y hora de una zona horaria a otra.
 * @author ahdodev
 * @version 1.0.0
 */
public final class ConversorZonasHorarias {
    private ConversorZonasHorarias() { }

    /**
     * Programa principal. Coge la hora de ahora en Canarias y enseña
     * qué hora es en ese mismo momento en Madrid.
     * @param args argumentos de la línea de comandos (no se usan)
     */
    public static void main(String[] args) {
        ZoneId canarias = ZoneId.of("Atlantic/Canary");
        ZoneId madrid = ZoneId.of("Europe/Madrid");
        //la hora de ahora mismo en Canarias
        ZonedDateTime ahora = ZonedDateTime.now(canarias);
        ZonedDateTime enMadrid = convertirZona(ahora, madrid);
        System.out.println("En Canarias: " + ahora);
        System.out.println("En Madrid: " + enMadrid);
    }

    /**
     * Convierte una fecha y hora a otra zona horaria sin cambiar el momento,
     * o sea que es el mismo instante pero con la hora de la otra zona.
     * Uso withZoneSameInstant en vez de sumar horas a mano.
     * @param fechaOrigen ZonedDateTime fecha y hora con su zona de origen
     * @param zonaDestino ZoneId zona a la que queremos pasarla
     * @return ZonedDateTime con la misma hora vista en la zona de destino
     */
    public static ZonedDateTime convertirZona(ZonedDateTime fechaOrigen, ZoneId zonaDestino) {
        //11:33 en Canarias -> 12:33 en Madrid
        return fechaOrigen.withZoneSameInstant(zonaDestino);
    }
}
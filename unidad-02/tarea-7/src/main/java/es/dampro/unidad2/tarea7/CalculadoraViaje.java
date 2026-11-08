package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Clase que calcula la fecha y hora de llegada de un viaje.
 * @author ahdodev
 * @version 1.0.0
 */
public final class CalculadoraViaje {
    private CalculadoraViaje() { }

    /**
     * Programa principal. Calcula a qué hora llega un viaje que sale el
     * 15/06/2026 a las 22:30 y dura 5 horas y 45 minutos.
     * @param args argumentos de la línea de comandos (no se usan)
     */
    public static void main(String[] args) {
        LocalDateTime salida = LocalDateTime.of(2026, 6, 15, 22, 30);
        LocalDateTime llegada = calcularLlegada(salida, 5, 45);
        System.out.println("Sale el: " + salida);
        System.out.println("Llega el: " + llegada);
    }

    /**
     * Suma las horas y los minutos del viaje a la salida para saber la llegada.
     * Si pasa de medianoche cambia de día solo. Si las horas o los minutos
     * son negativos da IllegalArgumentException.
     * @param salida LocalDateTime fecha y hora de salida
     * @param horas long horas que dura el viaje
     * @param minutos long minutos que dura el viaje
     * @return LocalDateTime con la fecha y hora de llegada
     */
    public static LocalDateTime calcularLlegada(LocalDateTime salida, long horas, long minutos) {
        if (horas < 0 || minutos < 0) {
            throw new IllegalArgumentException("El viaje no puede durar algo negativo");
        }
        //22:30 + 5h -> 03:30 del día siguiente, + 45 min -> 04:15
        return salida.plusHours(horas).plusMinutes(minutos);
    }
}
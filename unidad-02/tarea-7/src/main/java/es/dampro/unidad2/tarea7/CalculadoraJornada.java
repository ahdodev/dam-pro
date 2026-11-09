package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 *Clase que calcula el tiempo rabajado en una jornada quitando el descanso.
 * @author ahdodev
 * @version 1.0.0
 */
public final class CalculadoraJornada {
    private CalculadoraJornada() { }

    /**
     * Programa que calcula lo que se trabaja, entrando a las 8:30, saliendo a las 17:00 y con 30 minutos de descanso.
     * @param args
     */
    public static void main(String[] args) {
        LocalTime entrada = LocalTime.of(8,30);
        LocalTime salida = LocalTime.of(17,0);
        Duration trabajado =calcularTiempoTrabajado(entrada, salida, 30);
        System.out.println("Horas trabajadas: " + trabajado.toHours());
        System.out.println("duracion: " + trabajado);

    }
    /**
     *Funcion que calcula lo que se ha trabajado entre la entrada y la  salida del mismo dia y le
     * resta los minutos de descanso. La salida tiene que ser despues de la jornada y el descanso no puede
     * ser negativo ni mas largo que la jornada.
     * @param entrada LocalTime hora de entrada
     * @param salida LocalTime hora de salida
     * @param descansoMinutos int minutos de descanso que se restan
     * @return Duration con el tiempo trabajado
     */
    public static Duration calcularTiempoTrabajado(LocalTime entrada, LocalTime salida, int descansoMinutos) {
        if (!salida.isAfter(entrada)){
           throw new IllegalArgumentException("La salida tiene que ser despues de la entrada");
        }
        Duration jornada = Duration.between(entrada,salida);
        if (descansoMinutos < 0 || descansoMinutos > jornada.toMinutes()) {
            throw new IllegalArgumentException("El descanso no es valido.");
        }

        return jornada.minusMinutes(descansoMinutos);
    }
}

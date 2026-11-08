package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Clase que calcula cuántos días faltan para un evento.
 * @author ahdodev
 * @version 1.0.0
 */
public final class CuentaAtrasEvento {
    private CuentaAtrasEvento() { }

    /**
     * Programa principal. Calcula los días que faltan desde hoy
     * hasta la salida del GTA VI, el 19 de noviembre de 2026.
     * @param args argumentos de la línea de comandos (no se usan)
     */
    public static void main(String[] args) {
        LocalDate salidaGta = LocalDate.of(2026, 11, 19);
        System.out.println("Faltan " + calcularDiasRestantes(LocalDate.now(), salidaGta)
                + " días para que salga el GTA VI");
    }

    /**
     * Calcula los días que hay desde hoy hasta el evento.
     * Da un número positivo si falta, 0 si es hoy y negativo si ya pasó.
     * @param hoy LocalDate fecha de hoy
     * @param evento LocalDate fecha del evento
     * @return long con los días que faltan
     */
    public static long calcularDiasRestantes(LocalDate hoy, LocalDate evento) {
        return ChronoUnit.DAYS.between(hoy, evento);
    }
}
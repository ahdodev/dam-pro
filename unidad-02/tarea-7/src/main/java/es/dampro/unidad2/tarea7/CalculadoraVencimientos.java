package es.dampro.unidad2.tarea7;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

/**
 * Clase que calcula la fecha de vencimiento sumando años, meses y días.
 * @author ahdodev
 * @version 1.0.0
 */
public final class CalculadoraVencimientos {
    private CalculadoraVencimientos() { }

    /**
     * Programa principal. Calcula cuándo vence algo que empieza el 31/01/2026
     * y dura un mes.
     */
    public static void main(String[] args) {
        LocalDate inicio = LocalDate.of(2026, 1, 31);
        LocalDate vencimiento = calcularVencimiento(inicio, 0, 1, 0);
        System.out.println("Empieza el: " + inicio);
        System.out.println("Vence el: " + vencimiento);
    }

    /**
     * Calcula un vencimiento sumando primero los años, luego los meses y al
     * final los días. Se pueden poner números negativos para ir hacia atrás.
     * Si el mes no tiene ese día, LocalDate lo ajusta solo (31/01 + 1 mes = 28/02).
     * @param fecha LocalDate fecha de la que se parte
     * @param dias int días que se suman
     * @param meses int meses que se suman
     * @param anios int años que se suman
     * @return LocalDate con la fecha de vencimiento
     */
    public static LocalDate calcularVencimiento(LocalDate fecha, int dias, int meses, int anios) {
        LocalDate vencimiento = fecha.plusYears(anios);
        vencimiento = vencimiento.plusMonths(meses);
        vencimiento = vencimiento.plusDays(dias);
        return vencimiento;
    }
}
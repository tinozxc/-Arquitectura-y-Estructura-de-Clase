package Chapter3_Java_Day_5_6.Day6_ArrayList_Fechas.Working_with_Dates_and_Times;

import java.time.*;

public class WorkingWithPeriods {

    public static void main(String[] args)
    {
        System.out.println("    MANIPULACION DE FECHAS Y HORAS EN JAVA  ");

        // 1. SUMAR TIEMPO A LocalDate

        System.out.println("1. SUMAR TIEMPO A LocalDate");

        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println("Fecha original: " + date);  // 2014-01-20

        // Sumar 2 dias
        date = date.plusDays(2);
        System.out.println("Despues de plusDays(2): " + date);  // 2014-01-22

        // Sumar 1 semana
        date = date.plusWeeks(1);
        System.out.println("Despues de plusWeeks(1): " + date);  // 2014-01-29

        // Sumar 1 mes (cuidado con años bisiestos!)
        date = date.plusMonths(1);
        System.out.println("Despues de plusMonths(1): " + date);  // 2014-02-28

        // RESTAR TIEMPO A LocalDateTime

        System.out.println(" RESTAR TIEMPO A LocalDateTime");
        System.out.println("----------------------------------------");

        LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date2, time);
        System.out.println("Fecha y hora original: " + dateTime);  // 2020-01-20T05:15

        // Restar 1 dia
        dateTime = dateTime.minusDays(1);
        System.out.println("Despues de minusDays(1): " + dateTime);  // 2020-01-19T05:15

        // Restar 10 horas (cambia la fecha)
        dateTime = dateTime.minusHours(10);
        System.out.println("Despues de minusHours(10): " + dateTime);  // 2020-01-18T19:15

        // Restar 30 segundos (ahora muestra segundos)
        dateTime = dateTime.minusSeconds(30);
        System.out.println("Despues de minusSeconds(30): " + dateTime);  // 2020-01-18T19:14:30

        System.out.println("\nExplicacion:");
        System.out.println("  * Java solo muestra segundos/nanosegundos cuando son relevantes");
        System.out.println("  * Restar horas puede cambiar la fecha si cruza la medianoche");
        System.out.println();

        //  ENCADENAMIENTO DE METODOS (CHAINING)

        System.out.println("3. ENCADENAMIENTO DE METODOS (CHAINING)");
        System.out.println("------------------------------------------------------------");

        // Version larga (sin encadenamiento)
        LocalDateTime dt1 = LocalDateTime.of(2020, Month.JANUARY, 20, 5, 15);
        dt1 = dt1.minusDays(1);
        dt1 = dt1.minusHours(10);
        dt1 = dt1.minusSeconds(30);
        System.out.println("Version larga: " + dt1);

        // Version con encadenamiento (mas limpia)
        LocalDateTime dt2 = LocalDateTime.of(2020, Month.JANUARY, 20, 5, 15)
                .minusDays(1)
                .minusHours(10)
                .minusSeconds(30);
        System.out.println("Version con chaining: " + dt2);
        System.out.println("  * El encadenamiento hace el codigo mas legible");

        //  ERROR COMUN: METODOS INCORRECTOS PARA EL TIPO

        // LocalDate NO tiene minutos
        LocalDate date4 = LocalDate.of(2020, Month.JANUARY, 20);
        System.out.println("LocalDate: " + date4);

        try {
            // Esto NO COMPILA - LocalDate no tiene plusMinutes()
            // date4 = date4.plusMinutes(1);
            System.out.println("  plusMinutes() NO existe en LocalDate");
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }

        // LocalTime NO tiene dias
        LocalTime time2 = LocalTime.of(5, 15);
        System.out.println("LocalTime: " + time2);

    }
}

package Chapter3_Java.Day6_ArrayList_Fechas.Working_with_Dates_and_Times;

import java.time.*;

public class WorkingWithPeriods {

    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println("     MANIPULACION DE FECHAS Y HORAS EN JAVA                ");
        System.out.println("============================================================\n");

        // ============================================================
        // 1. SUMAR TIEMPO A LocalDate
        // ============================================================
        System.out.println("1. SUMAR TIEMPO A LocalDate");
        System.out.println("------------------------------------------------------------");

        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println("Fecha original: " + date);  // 2014-01-20

        // Sumar 2 dias
        date = date.plusDays(2);
        System.out.println("Despues de plusDays(2): " + date);  // 2014-01-22

        // Sumar 1 semana
        date = date.plusWeeks(1);
        System.out.println("Despues de plusWeeks(1): " + date);  // 2014-01-29

        // Sumar 1 mes (¡cuidado con años bisiestos!)
        date = date.plusMonths(1);
        System.out.println("Despues de plusMonths(1): " + date);  // 2014-02-28

        // Sumar 5 años
        date = date.plusYears(5);
        System.out.println("Despues de plusYears(5): " + date);  // 2019-02-28

        System.out.println("\nExplicacion:");
        System.out.println("  * Java ajusta automaticamente fechas invalidas");
        System.out.println("  * Ej: 29 de febrero en año no bisiesto -> 28 de febrero");
        System.out.println();

        // ============================================================
        // 2. RESTAR TIEMPO A LocalDateTime
        // ============================================================
        System.out.println("2. RESTAR TIEMPO A LocalDateTime");
        System.out.println("------------------------------------------------------------");

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

        // ============================================================
        // 3. ENCADENAMIENTO DE METODOS (CHAINING)
        // ============================================================
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

        System.out.println("\nExplicacion:");
        System.out.println("  * El encadenamiento hace el codigo mas legible");
        System.out.println("  * Cada metodo devuelve un nuevo objeto inmutable");
        System.out.println();

        // ============================================================
        // 4. ERROR COMUN: IGNORAR EL RESULTADO
        // ============================================================
        System.out.println("4. ERROR COMUN: IGNORAR EL RESULTADO");
        System.out.println("------------------------------------------------------------");

        LocalDate date3 = LocalDate.of(2020, Month.JANUARY, 20);
        System.out.println("Fecha original: " + date3);

        // ¡ERROR! No se asigna el resultado
        date3.plusDays(10);  // Este resultado se pierde
        System.out.println("Despues de plusDays(10) sin asignar: " + date3);  // ¡Sigue igual!

        // FORMA CORRECTA
        date3 = date3.plusDays(10);
        System.out.println("Despues de plusDays(10) con asignacion: " + date3);

        System.out.println("\nExplicacion:");
        System.out.println("  * Las clases son INMUTABLES");
        System.out.println("  * plusDays() devuelve un NUEVO objeto");
        System.out.println("  * Si no asignas el resultado, se pierde el cambio");
        System.out.println("  * ¡Siempre asigna el resultado a una variable!");
        System.out.println();

        // ============================================================
        // 5. ERROR COMUN: METODOS INCORRECTOS PARA EL TIPO
        // ============================================================
        System.out.println("5. ERROR COMUN: METODOS INCORRECTOS PARA EL TIPO");
        System.out.println("------------------------------------------------------------");

        // LocalDate NO tiene minutos
        LocalDate date4 = LocalDate.of(2020, Month.JANUARY, 20);
        System.out.println("LocalDate: " + date4);

        try {
            // Esto NO COMPILA - LocalDate no tiene plusMinutes()
            // date4 = date4.plusMinutes(1);
            System.out.println("  * plusMinutes() NO existe en LocalDate");
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }

        // LocalTime NO tiene dias
        LocalTime time2 = LocalTime.of(5, 15);
        System.out.println("LocalTime: " + time2);

        try {
            // Esto NO COMPILA - LocalTime no tiene plusDays()
            // time2 = time2.plusDays(1);
            System.out.println("  * plusDays() NO existe en LocalTime");
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }

        System.out.println("\nExplicacion:");
        System.out.println("  * LocalDate solo tiene metodos de FECHA");
        System.out.println("  * LocalTime solo tiene metodos de HORA");
        System.out.println("  * LocalDateTime tiene TODOS los metodos");
        System.out.println();

        // ============================================================
        // 6. METODOS DISPONIBLES POR TIPO
        // ============================================================
        System.out.println("6. METODOS DISPONIBLES POR TIPO");
        System.out.println("------------------------------------------------------------");

        System.out.println("\nLocalDate (SOLO FECHA):");
        System.out.println("  * plusDays(long days)");
        System.out.println("  * plusWeeks(long weeks)");
        System.out.println("  * plusMonths(long months)");
        System.out.println("  * plusYears(long years)");
        System.out.println("  * minusDays(long days)");
        System.out.println("  * minusWeeks(long weeks)");
        System.out.println("  * minusMonths(long months)");
        System.out.println("  * minusYears(long years)");

        System.out.println("\nLocalTime (SOLO HORA):");
        System.out.println("  * plusHours(long hours)");
        System.out.println("  * plusMinutes(long minutes)");
        System.out.println("  * plusSeconds(long seconds)");
        System.out.println("  * plusNanos(long nanos)");
        System.out.println("  * minusHours(long hours)");
        System.out.println("  * minusMinutes(long minutes)");
        System.out.println("  * minusSeconds(long seconds)");
        System.out.println("  * minusNanos(long nanos)");

        System.out.println("\nLocalDateTime (FECHA + HORA):");
        System.out.println("  * TODOS los metodos de LocalDate");
        System.out.println("  * TODOS los metodos de LocalTime");

        System.out.println();

        // ============================================================
        // 7. EJEMPLOS PRACTICOS
        // ============================================================
        System.out.println("7. EJEMPLOS PRACTICOS");
        System.out.println("------------------------------------------------------------");

        // Ejemplo 1: Calcular fecha de entrega (7 dias despues)
        LocalDate hoy = LocalDate.now();
        LocalDate entrega = hoy.plusDays(7);
        System.out.println("Fecha de entrega (7 dias): " + entrega);

        // Ejemplo 2: Calcular vencimiento (30 dias despues)
        LocalDate vencimiento = hoy.plusDays(30);
        System.out.println("Fecha de vencimiento (30 dias): " + vencimiento);

        // Ejemplo 3: Hace una semana
        LocalDate haceUnaSemana = hoy.minusWeeks(1);
        System.out.println("Hace una semana: " + haceUnaSemana);

        // Ejemplo 4: Proximo año
        LocalDate proximoAnio = hoy.plusYears(1);
        System.out.println("Proximo año: " + proximoAnio);

        // Ejemplo 5: Hora en 2 horas y 30 minutos
        LocalTime ahora = LocalTime.now();
        LocalTime masTarde = ahora.plusHours(2).plusMinutes(30);
        System.out.println("En 2 horas y 30 minutos: " + masTarde);

        // Ejemplo 6: Combinando fecha y hora
        LocalDateTime fechaHora = LocalDateTime.of(hoy, ahora);
        LocalDateTime fechaHoraFutura = fechaHora.plusDays(5).plusHours(3);
        System.out.println("En 5 dias y 3 horas: " + fechaHoraFutura);

        System.out.println();

        // ============================================================
        // 8. RESUMEN DE PUNTOS CLAVE
        // ============================================================
        System.out.println("8. RESUMEN DE PUNTOS CLAVE");
        System.out.println("------------------------------------------------------------");

        System.out.println("\nPUNTOS IMPORTANTES:");
        System.out.println("  1. Las clases son INMUTABLES - siempre asignar el resultado");
        System.out.println("  2. LocalDate solo tiene metodos de fecha");
        System.out.println("  3. LocalTime solo tiene metodos de hora");
        System.out.println("  4. LocalDateTime tiene TODOS los metodos");
        System.out.println("  5. Java ajusta automaticamente fechas invalidas");
        System.out.println("  6. El encadenamiento (chaining) hace el codigo mas limpio");

        System.out.println("\nERRORES COMUNES:");
        System.out.println("  * date.plusDays(10); // IGNORAR el resultado");
        System.out.println("  * LocalDate.of(2020, 1, 20).plusMinutes(1); // NO COMPILA");
        System.out.println("  * LocalTime.of(5, 15).plusDays(1); // NO COMPILA");

        System.out.println("\n============================================================");
        System.out.println("FIN DE LA DEMOSTRACION");
        System.out.println("============================================================");
    }
}

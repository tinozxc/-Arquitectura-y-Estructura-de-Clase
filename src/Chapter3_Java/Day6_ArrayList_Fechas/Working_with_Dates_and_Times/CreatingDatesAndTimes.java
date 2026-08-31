package Chapter3_Java.Day6_ArrayList_Fechas.Working_with_Dates_and_Times;

import java.time.*;
import java.util.*;

/*
 * DEMOSTRACION DE FECHAS Y HORAS EN JAVA
 *
 * Esta clase muestra todos los conceptos importantes sobre el manejo de fechas y horas
 * usando el paquete java.time (Java 8+)
 *
 * Incluye:
 * - Creacion de fechas y horas actuales
 * - Creacion de fechas y horas especificas
 * - Combinacion de fecha y hora
 * - Comparativa con la vieja API (Date/Calendar)
 * - Manejo de errores y excepciones
 * - Metodos disponibles y firmas
 */
public class CreatingDatesAndTimes {

    public static void main(String[] args) {

        System.out.println("     DEMOSTRACION COMPLETA DE FECHAS Y HORAS        ");
        System.out.println("===============================================\n");

        // 1. CREAR FECHAS Y HORAS ACTUALES

        System.out.println("1. FECHAS Y HORAS ACTUALES");
        System.out.println("--------------------------------------------");

        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha actual (LocalDate.now()): " + fechaActual);

        LocalTime horaActual = LocalTime.now();
        System.out.println("Hora actual (LocalTime.now()): " + horaActual);

        LocalDateTime fechaHoraActual = LocalDateTime.now();
        System.out.println("Fecha y hora actual (LocalDateTime.now()): " + fechaHoraActual);

        System.out.println("\nExplicacion:");
        System.out.println("  LocalDate -> Solo fecha (YYYY-MM-DD)");
        System.out.println("  LocalTime -> Solo hora (HH:MM:SS.nnn)");
        System.out.println("  LocalDateTime -> Fecha + hora con 'T' separador");
        System.out.println();


        // 2. CREAR FECHAS ESPECIFICAS

        System.out.println("CREAR FECHAS ESPECIFICAS");
        System.out.println("-----------------------------------------");

        // Usando enum Month (mas legible)
        LocalDate fecha1 = LocalDate.of(2026, Month.AUGUST, 18);
        System.out.println("Con Month enum: " + fecha1);

        // Usando numero de mes (1 = Enero, 12 = Diciembre)
        LocalDate fecha2 = LocalDate.of(2026, 8, 18);
        System.out.println("Con numero de mes: " + fecha2);

        System.out.println("\nExplicacion:");
        System.out.println("  * Los meses van de 1 a 12 (no de 0 a 11 como en Calendar)");
        System.out.println("  * Month.JANUARY = 1, Month.FEBRUARY = 2, etc.");
        System.out.println("  * Usar Month enum es mas legible y menos propenso a errores");
        System.out.println();


        //  MANEJO DE ERRORES EN FECHAS

        System.out.println(" MANEJO DE ERRORES EN FECHAS");
        System.out.println("-----------------------------------");

        // Mes invalido
        try {
            LocalDate fechaInvalida = LocalDate.of(2026, 13, 1);
            System.out.println("Esto no se ejecuta"); // mes 13 no existe
        } catch (DateTimeException e) {
            System.out.println("ERROR: Mes invalido - " + e.getMessage());
        }

        // Dia invalido
        try {
            // ojo aqui validamos por el dia del mes si realmente tiene ese dia
            //cuidado en eso
            LocalDate fechaInvalida = LocalDate.of(2026, 2, 30);
            System.out.println("Esto no se ejecuta");
        } catch (DateTimeException e) {
            System.out.println("ERROR: Dia invalido - " + e.getMessage());
        }

        System.out.println();


        //  CREAR HORAS ESPECIFICAS

        System.out.println(" CREAR HORAS ESPECIFICAS");
        System.out.println("------------------------------------------------------------");

        // Solo hora y minutos
        LocalTime hora1 = LocalTime.of(6, 15);
        System.out.println("Hora y minuto: " + hora1);

        // Con segundos
        LocalTime hora2 = LocalTime.of(6, 15, 30);
        System.out.println("Hora, minuto y segundo: " + hora2);

        // Con nanosegundos
        LocalTime hora3 = LocalTime.of(6, 15, 30, 200);
        System.out.println("Con nanosegundos: " + hora3);

        System.out.println("\nExplicacion:");
        System.out.println("   Horas: 0-23 (formato 24h)");
        System.out.println("   Minutos: 0-59");
        System.out.println("   Segundos: 0-59");
        System.out.println("   Nanosegundos: 0-999,999,999");
        System.out.println();


        //  MANEJO DE ERRORES EN HORAS

        System.out.println("MANEJO DE ERRORES EN HORAS");
        System.out.println("--------------------------------");

        try {
            LocalTime horaInvalida = LocalTime.of(25, 0);
            System.out.println("Esto no se ejecuta"); // fuera del limite de 24H
        } catch (DateTimeException e) {
            System.out.println("ERROR: Hora invalida - " + e.getMessage());
        }

        try {
            LocalTime minutoInvalido = LocalTime.of(14, 60);
            // solo existe hasta el 59 de 60 ya se considera 1H
            System.out.println("Esto no se ejecuta");
        } catch (DateTimeException e) {
            System.out.println("ERROR: Minuto invalido - " + e.getMessage());
        }

        System.out.println();


        //  CREAR LOCALDATETIME (FECHA + HORA)
        System.out.println(" CREAR LOCALDATETIME (FECHA + HORA)");
        System.out.println("--------------------------------------");

        // Opcion 1: Todo en una linea
        LocalDateTime dt1 = LocalDateTime.of(2026, Month.AUGUST, 18, 14, 30, 45);
        System.out.println("Opcion 1 (todo junto): " + dt1);

        // Opcion 2: Combinando LocalDate y LocalTime
        LocalDate fecha = LocalDate.of(2026, 8, 18);
        LocalTime hora = LocalTime.of(14, 30, 45);
        LocalDateTime dt2 = LocalDateTime.of(fecha, hora);
        System.out.println("Opcion 2 (combinado): " + dt2);

        // Opcion 3: Con minutos solamente
        LocalDateTime dt3 = LocalDateTime.of(2026, 8, 18, 14, 30);
        System.out.println("Opcion 3 (sin segundos): " + dt3);

        System.out.println("\nExplicacion:");
        System.out.println("   La 'T' separa fecha y hora en el String");
        System.out.println("   Se pueden combinar objetos LocalDate y LocalTime");
        System.out.println("   Hay multiples firmas de metodos disponibles");
        System.out.println();


        //  ERROR COMUN: USAR NEW

        System.out.println("ERROR COMUN: USAR 'new'");
        System.out.println("---------------------------------");

        try {
            // Esto NO COMPILA - las clases tienen constructores privados
      //      LocalDate fechaInvalida = new LocalDate(2026, 8, 18);
            System.out.println("Esto no se ejecuta");
        } catch (Exception e) {
            System.out.println("ERROR: No se puede usar 'new' con LocalDate: " + e);
        }

        System.out.println("\nExplicacion:");
        System.out.println("  TODAS las clases tienen constructores privados");
        System.out.println("  Se debe usar el metodo estatico .of()");
        System.out.println("   Si ves 'new' con fechas, esta mal");
        System.out.println();


        // 8 COMPARATIVA: VIEJO vs NUEVO

        System.out.println(" VIEJA FORMA (Date/Calendar) vs NUEVA FORMA (java.time)");
        System.out.println("---------------------------------------");

        System.out.println("\nVIEJA FORMA (Java 7 y anterior):");
        System.out.println("   Fecha actual: " + new Date());
        System.out.println("   Meses empiezan en 0 (0 = Enero, 11 = Diciembre)");

        Calendar cal = Calendar.getInstance();
        cal.set(2015, Calendar.JANUARY, 1);
        System.out.println("  * 1 de enero 2015: " + cal.getTime());

        Calendar cal2 = new GregorianCalendar(2015, 0, 1);
        System.out.println("  * 1 de enero 2015 (con 0): " + cal2.getTime());

        System.out.println("\nNUEVA FORMA (Java 8+):");
        System.out.println("  * Fecha actual: " + LocalDate.now());
        System.out.println("  * Meses empiezan en 1! (1 = Enero, 12 = Diciembre)");
        System.out.println("  * 1 de enero 2015: " + LocalDate.of(2015, Month.JANUARY, 1));
        System.out.println("  * 1 de enero 2015 (con numero): " + LocalDate.of(2015, 1, 1));


        System.out.println("   Aspecto      | Vieja (Date/Calendar) | Nueva (java.time)    ");
        System.out.println("  -------------------");
        System.out.println("   Meses      | 0-11 (confuso)    | 1-12 (intuitivo)  ");
        System.out.println("   Solo fecha    | No existe    | LocalDate    ");
        System.out.println("   Solo hora     | No existe     | LocalTime    ");
        System.out.println("   Constructor   | new Date()    | LocalDate.now()     ");


        //  METODOS DISPONIBLES (FIRMAS)

        System.out.println(" METODOS DISPONIBLES Y FIRMAS");
        System.out.println("-------------------------------------------");

        System.out.println("\nLocalDate.of():");
        System.out.println("  * LocalDate.of(int year, int month, int dayOfMonth)");
        System.out.println("  * LocalDate.of(int year, Month month, int dayOfMonth)");


    }
}

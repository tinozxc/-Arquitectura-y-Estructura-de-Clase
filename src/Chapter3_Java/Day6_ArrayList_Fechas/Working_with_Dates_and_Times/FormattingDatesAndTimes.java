package Chapter3_Java.Day6_ArrayList_Fechas.Working_with_Dates_and_Times;

import java.time.*;
import java.time.format.*;

public class FormattingDatesAndTimes {

    public static void main(String[] args) {


        //  DATOS DE EJEMPLO

        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dt = LocalDateTime.of(date, time);

        System.out.println("=== FORMATEO DE FECHAS Y HORAS ===\n");

        //  METODOS PARA EXTRAER DATOS

        System.out.println("METODOS GET:");
        System.out.println("  getDayOfWeek(): " + date.getDayOfWeek());   // MONDAY
        System.out.println("  getMonth(): " + date.getMonth());           // JANUARY
        System.out.println("  getYear(): " + date.getYear());             // 2020
        System.out.println("  getDayOfYear(): " + date.getDayOfYear());   // 20
        System.out.println();


        // FORMATOS ISO (PREDEFINIDOS)

        System.out.println("  ISO_LOCAL_DATE: " + date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println("  ISO_LOCAL_TIME: " + time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println("  ISO_LOCAL_DATE_TIME: " + dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));


        //  FORMATOS PERSONALIZADOS (ofPattern)

        System.out.println("FORMATOS PERSONALIZADOS:");

        // Ejemplos  MM = mes , dd = dia , yyyy= año . hh = hora , mm = minuto
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println("  'MMMM dd, yyyy, hh:mm': " + dt.format(f1));

        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
        System.out.println("  'MM/dd/yyyy HH:mm': " + dt.format(f2));

        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy hh:mm:ss a");
        System.out.println("  'EEEE, MMMM dd, yyyy hh:mm:ss a': " + dt.format(f3));
        System.out.println();


        //  ERRORES COMUNES (MM vs mm)
        System.out.println("ERRORES COMUNES:");
        System.out.println("  Fecha: " + dt);

        // CORRECTO: MM = mes, mm = minuto
        DateTimeFormatter correcto = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
        System.out.println("  CORRECTO (MM=mes, mm=minuto): " + dt.format(correcto));

        // ERROR: mm usado como mes
        DateTimeFormatter erroneo = DateTimeFormatter.ofPattern("mm/dd/yyyy HH:mm");
        System.out.println("  ERROR (mm=minuto, NO mes): " + dt.format(erroneo));
        System.out.println();

    }
}
package Chapter3_Java.Day6_ArrayList_Fechas.Working_with_Dates_and_Times;

import java.time.*;
import java.time.format.*;

public class FormattingDatesAndTimes {

    public static void main(String[] args) {

        // ============================================
        // 1. DATOS DE EJEMPLO
        // ============================================
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dt = LocalDateTime.of(date, time);

        System.out.println("=== FORMATEO DE FECHAS Y HORAS ===\n");

        // ============================================
        // 2. METODOS PARA EXTRAER DATOS
        // ============================================
        System.out.println("METODOS GET:");
        System.out.println("  getDayOfWeek(): " + date.getDayOfWeek());   // MONDAY
        System.out.println("  getMonth(): " + date.getMonth());           // JANUARY
        System.out.println("  getYear(): " + date.getYear());             // 2020
        System.out.println("  getDayOfYear(): " + date.getDayOfYear());   // 20
        System.out.println();

        // ============================================
        // 3. FORMATOS ISO (PREDEFINIDOS)
        // ============================================
        System.out.println("FORMATOS ISO:");
        System.out.println("  ISO_LOCAL_DATE: " + date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println("  ISO_LOCAL_TIME: " + time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println("  ISO_LOCAL_DATE_TIME: " + dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println();

        // ============================================
        // 4. FORMATOS LOCALIZADOS (SHORT, MEDIUM)
        // ============================================
        System.out.println("FORMATOS LOCALIZADOS:");

        // SHORT
        DateTimeFormatter shortDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println("  SHORT (fecha): " + shortDate.format(dt));
        System.out.println("  SHORT (fecha+hora): " + shortDateTime.format(dt));

        // MEDIUM
        DateTimeFormatter mediumDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println("  MEDIUM (fecha+hora): " + mediumDateTime.format(dt));
        System.out.println();

        // ============================================
        // 5. TABLA: QUE SE PUEDE FORMATEAR CON QUE
        // ============================================
        System.out.println("TABLA DE COMPATIBILIDAD:");
        System.out.println("  +----------------------+-----------+--------------+-----------+");
        System.out.println("  | Formatter            | LocalDate | LocalDateTime| LocalTime |");
        System.out.println("  +----------------------+-----------+--------------+-----------+");
        System.out.println("  | ofLocalizedDate()    | SI        | SI (fecha)   | NO        |");
        System.out.println("  | ofLocalizedDateTime()| NO        | SI           | NO        |");
        System.out.println("  | ofLocalizedTime()    | NO        | SI (hora)    | SI        |");
        System.out.println("  +----------------------+-----------+--------------+-----------+");

        // DEMOSTRACION DE ERROR
        try {
            DateTimeFormatter soloFecha = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
            soloFecha.format(time);  // ERROR
        } catch (Exception e) {
            System.out.println("\n  ERROR: " + e.getClass().getSimpleName());
            System.out.println("  No se puede formatear LocalTime como fecha");
        }
        System.out.println();

        // ============================================
        // 6. FORMATOS PERSONALIZADOS (ofPattern)
        // ============================================
        System.out.println("FORMATOS PERSONALIZADOS:");

        // Ejemplos
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println("  'MMMM dd, yyyy, hh:mm': " + dt.format(f1));

        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
        System.out.println("  'MM/dd/yyyy HH:mm': " + dt.format(f2));

        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        System.out.println("  'EEE, MMM dd, yyyy': " + dt.format(f3));

        DateTimeFormatter f4 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy hh:mm:ss a");
        System.out.println("  'EEEE, MMMM dd, yyyy hh:mm:ss a': " + dt.format(f4));
        System.out.println();

        // ============================================
        // 7. SIGNIFICADO DE PATRONES
        // ============================================
        System.out.println("SIGNIFICADO DE PATRONES:");
        LocalDateTime demo = LocalDateTime.of(2020, 1, 5, 14, 5, 30);

        System.out.println("  FECHA:");
        System.out.println("    M    -> " + demo.format(DateTimeFormatter.ofPattern("M")));
        System.out.println("    MM   -> " + demo.format(DateTimeFormatter.ofPattern("MM")));
        System.out.println("    MMM  -> " + demo.format(DateTimeFormatter.ofPattern("MMM")));
        System.out.println("    MMMM -> " + demo.format(DateTimeFormatter.ofPattern("MMMM")));
        System.out.println("    d    -> " + demo.format(DateTimeFormatter.ofPattern("d")));
        System.out.println("    dd   -> " + demo.format(DateTimeFormatter.ofPattern("dd")));
        System.out.println("    yy   -> " + demo.format(DateTimeFormatter.ofPattern("yy")));
        System.out.println("    yyyy -> " + demo.format(DateTimeFormatter.ofPattern("yyyy")));
        System.out.println("    EEE  -> " + demo.format(DateTimeFormatter.ofPattern("EEE")));
        System.out.println("    EEEE -> " + demo.format(DateTimeFormatter.ofPattern("EEEE")));

        System.out.println("\n  HORA:");
        System.out.println("    h    -> " + demo.format(DateTimeFormatter.ofPattern("h")));
        System.out.println("    hh   -> " + demo.format(DateTimeFormatter.ofPattern("hh")));
        System.out.println("    H    -> " + demo.format(DateTimeFormatter.ofPattern("H")));
        System.out.println("    HH   -> " + demo.format(DateTimeFormatter.ofPattern("HH")));
        System.out.println("    m    -> " + demo.format(DateTimeFormatter.ofPattern("m")));
        System.out.println("    mm   -> " + demo.format(DateTimeFormatter.ofPattern("mm")));
        System.out.println("    s    -> " + demo.format(DateTimeFormatter.ofPattern("s")));
        System.out.println("    ss   -> " + demo.format(DateTimeFormatter.ofPattern("ss")));
        System.out.println("    a    -> " + demo.format(DateTimeFormatter.ofPattern("a")));
        System.out.println();

        // ============================================
        // 8. TABLA RESUMEN DE PATRONES
        // ============================================
        System.out.println("TABLA RESUMEN DE PATRONES:");
        System.out.println("  +----------+-------------------------------------+");
        System.out.println("  | Patron   | Significado                         |");
        System.out.println("  +----------+-------------------------------------+");
        System.out.println("  | yyyy     | Año (4 digitos)                     |");
        System.out.println("  | yy       | Año (2 digitos)                     |");
        System.out.println("  | MMMM     | Mes (nombre completo)               |");
        System.out.println("  | MMM      | Mes (nombre abreviado)              |");
        System.out.println("  | MM       | Mes (2 digitos)                     |");
        System.out.println("  | dd       | Dia (2 digitos)                     |");
        System.out.println("  | EEEE     | Dia semana (nombre completo)        |");
        System.out.println("  | EEE      | Dia semana (nombre abreviado)       |");
        System.out.println("  | HH       | Hora (24h, 2 digitos)               |");
        System.out.println("  | hh       | Hora (12h, 2 digitos)               |");
        System.out.println("  | mm       | Minuto (2 digitos)                  |");
        System.out.println("  | ss       | Segundo (2 digitos)                 |");
        System.out.println("  | a        | AM/PM                               |");
        System.out.println("  +----------+-------------------------------------+");
        System.out.println();

        // ============================================
        // 9. ERRORES COMUNES (MM vs mm)
        // ============================================
        System.out.println("ERRORES COMUNES:");
        System.out.println("  Fecha: " + dt);

        // CORRECTO: MM = mes, mm = minuto
        DateTimeFormatter correcto = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
        System.out.println("  CORRECTO (MM=mes, mm=minuto): " + dt.format(correcto));

        // ERROR: mm usado como mes
        DateTimeFormatter erroneo = DateTimeFormatter.ofPattern("mm/dd/yyyy HH:mm");
        System.out.println("  ERROR (mm=minuto, NO mes): " + dt.format(erroneo));
        System.out.println();

        // ============================================
        // 10. RESUMEN PUNTOS CLAVE
        // ============================================
        System.out.println("=== PUNTOS CLAVE ===");
        System.out.println("  1. MM (MAYUSCULA) = MES, mm (MINUSCULA) = MINUTO");
        System.out.println("  2. SHORT = formato corto, MEDIUM = formato medio");
        System.out.println("  3. LocalDate solo se formatea como fecha");
        System.out.println("  4. LocalTime solo se formatea como hora");
        System.out.println("  5. LocalDateTime se formatea como fecha y/o hora");
        System.out.println("  6. Dos formas de usar: formatter.format(obj) o obj.format(formatter)");
        System.out.println("  7. HH = 24h, hh = 12h (con a para AM/PM)");
        System.out.println("  8. ofLocalizedDate() NO funciona con LocalTime");
        System.out.println("  9. ofLocalizedTime() NO funciona con LocalDate");
        System.out.println("  10. ofPattern() para formatos personalizados");
        System.out.println();

        System.out.println("============================================================");
        System.out.println("FIN");
        System.out.println("============================================================");
    }
}
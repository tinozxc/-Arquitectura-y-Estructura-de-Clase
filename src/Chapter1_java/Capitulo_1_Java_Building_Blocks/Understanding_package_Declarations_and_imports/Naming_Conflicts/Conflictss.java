package Chapter1_java.Capitulo_1_Java_Building_Blocks.Understanding_package_Declarations_and_imports.Naming_Conflicts;


import java.util.Date;

public class Conflictss {
    //si necesitas realmente usar 2 claes con el mismo nombre..
    Date date;
    java.sql.Date sqlDate;


    // forma secundaria en importe
    /*
    * O bien, podrías no tener ninguno de los dos mediante una importación y
    *  utilizar siempre el nombre de clase totalmente cualificado:
     * */
    // public class Conflictss   {
    //     java.util.Date date;
    //     java.sql.Date sqlDate;
    //   }
}

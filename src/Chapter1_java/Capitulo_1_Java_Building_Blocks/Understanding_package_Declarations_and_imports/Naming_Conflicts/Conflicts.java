package Chapter1_java.Capitulo_1_Java_Building_Blocks.Understanding_package_Declarations_and_imports.Naming_Conflicts;

import java.util.Date;

public class Conflicts {

    Date date;
    // some more code

    //import java.util.*;
    // import java.sql.* // DOES NOT COMPILE , java no sabe que decidir cual usar
    // date es typo es ambiguo

    // import java.util.date;
    // import java.sql;

    //
    //¿Qué hace Java con los empates de precedencia?
    /*
    Java es lo suficientemente inteligente como para detectar que este código no es válido.
    * */
    //import java.util.Date;
    // import java.sql.Date;

    //error : The import java.sql.Date collides with another import statement

}

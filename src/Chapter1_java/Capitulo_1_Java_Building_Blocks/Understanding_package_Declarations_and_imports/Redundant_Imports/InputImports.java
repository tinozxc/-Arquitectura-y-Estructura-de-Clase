package Chapter1_java.Capitulo_1_Java_Building_Blocks.Understanding_package_Declarations_and_imports.Redundant_Imports;

import java.nio.file.Files;
import java.nio.file.Paths;

public class InputImports {

    public void read(Files file){
        Paths.get("name");
    }

    // import java.nio.file.*;

    // the Other asnwer is to import both class explicitly;
    // estos de aqui estan correctamente importados
    // import java.nio.file.Files;
    // import java.nio.file.Path;

    // imports that don't work;
    // import java.nio.*;  // NO GOOD - a wildCard solo funciona
                            // en nombre de clases , no en "files.*.files"
    // import java.nio.*.* // NO GOOD - tu puedes tener solo un wildcard
                            // y debe estar al final
    // import java.nio.files.Paths.*; // NO GOOD - tu no puedes importar metodos
                                      // solo nombres de clases

}

package Chapter1_java.Capitulo_1_Java_Building_Blocks.Understanding_package_Declarations_and_imports.Redundant_Imports;

import java.nio.file.Files;
import java.nio.file.Paths;

public class InputImports {

    public void read(Files file){
        Paths.get("name");
    }

    // import java.nio.file.*;

    // the Other asnwer is to import both class explicitly;

    // import java.nio.file.Files;
    // import java.nio.file.Path;

    // imports that don't work;
    // import java.nio.*;  // NO GOOD - a wildCard only matches
                            // class names, not "files.*Files
    // import java.nio.*.* // NO GOOD - you can only have one wildcard
                            // and it must be at the end
    // import java.nio.files.Paths.*; // NO GOOD - you cannot import methods
                                      // only class names

}

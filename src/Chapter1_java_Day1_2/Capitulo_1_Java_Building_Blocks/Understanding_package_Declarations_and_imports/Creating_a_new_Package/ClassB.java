package Chapter1_java_Day1_2.Capitulo_1_Java_Building_Blocks.Understanding_package_Declarations_and_imports.Creating_a_new_Package;

public class ClassB {
    /*El directorio estructurado de tu computadora es relativo con el nombre del paquete*/
    // C:/temp/packageb/ClassB.java
    public static void main(String[] args){
        ClassA a;
        System.out.println("Go it");
    }
}
  // Windows setUp
// crea 2 archivos

/*
*  C:/temp/packagea/ClassA.java
* C:/temp/packagea/ClassB.java
* */

// MAC/Linux setup tanto en linux y en MAC su forma es asi

/*
*  /tmp/packagea/ClassA.java
*  /tmp/packagea/ClassB.java
*
* */

// para compilar
// javac packagea/ClassA.java  packageb/ClassB.java

// y correr al archivo clase

// java packageb.ClassB

//generacion de un JarS

//Windows -cp ".C:/temp/someOtherLocation;c:/temp/myJar.jar" myPackage.MyClass
//--------------------------------------------------------------------
// y Mac OS/linux
// java -cp  ".:/temp/someOtherLocation;c:/temp/myJar.jar" myPackage.MyClass

// Finally ,tu puedes usar un wildcard(*) to match all the Jars

// java -cp ".C:/temp/DirectoryWithJars/*" myPackage.MyClass

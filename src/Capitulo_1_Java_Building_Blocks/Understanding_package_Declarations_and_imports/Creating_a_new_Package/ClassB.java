package Capitulo_1_Java_Building_Blocks.Understanding_package_Declarations_and_imports.Creating_a_new_Package;

public class ClassB {

    // C:/temp/packageb/ClassB.java
    public static void main(String[] args){
        ClassA a;
        System.out.println("Go it");
    }
}
  // Windows setUp
// create the two files

/*
*  C:/temp/packagea/ClassA.java
* C:/temp/packagea/ClassB.java
* */

// MAC/Linux setup

/*
*  /tmp/packagea/ClassA.java
*  /tmp/packagea/ClassB.java
*
* */

// to compile
// javac packagea/ClassA.java  packageb/ClassB.java

// to Run

// java packageb.ClassB

//generacion de un JarS

//Windows -cp ".C:/temp/someOtherLocation;c:/temp/myJar.jar" myPackage.MyClass

// and Mac OS/linux
// java -cp  ".:/temp/someOtherLocation;c:/temp/myJar.jar" myPackage.MyClass

// Finally , you can use a wildcard(*) to match all the Jars

// java -cp ".C:/temp/DirectoryWithJars/*" myPackage.MyClass

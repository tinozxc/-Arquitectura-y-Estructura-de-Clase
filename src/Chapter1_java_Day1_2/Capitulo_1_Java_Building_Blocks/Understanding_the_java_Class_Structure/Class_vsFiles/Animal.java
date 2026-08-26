package Chapter1_java_Day1_2.Capitulo_1_Java_Building_Blocks.Understanding_the_java_Class_Structure.Class_vsFiles;

//se  2 clases en el mismo archivo pero es
// !importante java permite una clase publica solo 1 public
// si en caso se pusiera 2 public tendria problemas de error de compilación.
 public class Animal {

    String name;
}

// clase animal2 sin public, permitido en una clase public Animal
  class Animal2 {
   private String name;
}

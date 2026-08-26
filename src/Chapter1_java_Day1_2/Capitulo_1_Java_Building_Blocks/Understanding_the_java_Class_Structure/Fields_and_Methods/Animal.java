package Chapter1_java_Day1_2.Capitulo_1_Java_Building_Blocks.Understanding_the_java_Class_Structure.Fields_and_Methods;

//clase Animal que obtendra atributos y metodos que seran declarados y asignados
public class Animal {

    String name; // declaracion de nombre

    public String getName(){
        return name;
    } // obtener nombre del atributo

    // establece un nombre al campo correspondiente
    public void setName(String newName){ // establecer un nombre
        name = newName;
    }

    //public int numberVisitors(int month) retorno de una variable tipo int

}

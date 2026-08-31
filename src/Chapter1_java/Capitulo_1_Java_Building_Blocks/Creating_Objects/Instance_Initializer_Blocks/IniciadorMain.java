package Chapter1_java.Capitulo_1_Java_Building_Blocks.Creating_Objects.Instance_Initializer_Blocks;


//las llaves ({}).
// El código que hay entre las llaves se
//denomina «bloque de código». A veces, este código se denomina
// «el código que hay dentro de las llaves».

public class IniciadorMain {
    public  static void main(String[] args){

        {System.out.println("Fathers");}

    }
}

 // {System.out.println("Snowy");} // falla al compilar no esta adentro del main

/*
Si no hay el mismo número de llaves de apertura ({)
y de cierre (}), el código no se compila. No importa que un par de llaves esté
dentro del mét0do main(): sigue contando.
A la hora de contar los inicializadores de instancia, ten en cuenta que sí importa si las llaves
están dentro de un mét0do. Solo hay un par de llaves fuera de un método. La línea 6 es un
inicializador de instancia.

 */


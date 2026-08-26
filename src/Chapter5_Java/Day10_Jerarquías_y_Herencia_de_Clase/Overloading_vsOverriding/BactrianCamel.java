package Chapter5_Java.Day10_Jerarquías_y_Herencia_de_Clase.Overloading_vsOverriding;


//el método hijo debe tener como mínimo, el mismo nivel de accesibilidad que
// el método padre. En el ejemplo,
// el método padre utiliza el modificador «protected», pero el
//método hijo utiliza el modificador «private», lo que hace que sea menos
// accesible en el método hijo que
//en el método padre. También incumple la cuarta regla de la sobrescritura de métodos:
// el tipo de retorno método padre y del método hijo deben ser de misma dirección.
//tipo de retorno del método padre es String, mientras que el tipo de retorno del método hijo
//es `int`, y ninguno de los dos van a la misma dirección con el otro.
public class BactrianCamel extends Camel{

    /*
    private int getNumberOfHumps() { // DOES NOT COMPILE uno es privado
        //el otro es protected
        return 2;
    }
        */
}

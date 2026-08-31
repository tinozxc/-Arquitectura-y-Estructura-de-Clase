package chapter4_Java.Day7_Métodos_y_EncapsulamientoI.Static_and_Methods;
//Es un bloque de código encerrado en { }, precedido por la palabra static, que
// corre automáticamente una sola vez: cuando la clase se usa por primera vez
// (se carga en memoria).
public class StaticInitialization {

    private static final int NUM_SECONDS_PER_HOUR; //statico y final

    static {  // bloque de codigo estatico inicializa esto
        int numSecondsPerMinute = 60;
        int numMinutesPerHour = 60;
        NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
    }


         private static int one;              // static normal, sin inicializar
        private static final int two;        // final static, SIN valor aún (pendiente)
         private static final int three = 3;  // final static, YA inicializada aquí mismo
      //   private static final int four;       //  NO COMPILA


    //bloque estatico inicializador
    static {
            one = 1;      //  OK, "one" es static normal (no final), se puede asignar/reasignar libremente
            two = 2;       // OK, esta es la PRIMERA (y única) asignación de "two" → válido
     //      three = 3;     //  NO COMPILA
     //       two = 4;       //  NO COMPILA
        }

}

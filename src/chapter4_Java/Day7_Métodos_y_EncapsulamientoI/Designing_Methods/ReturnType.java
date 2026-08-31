package chapter4_Java.Day7_Métodos_y_EncapsulamientoI.Designing_Methods;

public class ReturnType {

    public void walk1() { }                 // OK: void, return statement es opcional
    public void walk2() { return; }          // OK: void, con return vacío (sin valor)
    public String walk3() { return ""; }     // OK: retorna un String como corresponde

    // public String walk4() { }             // NO COMPILA: falta el return statement
    // public walk5() { }                    // NO COMPILA: falta el tipo de retorno

    String walk6(int a) {
        if (a == 4) return "";
        // NO COMPILA: si a != 4, el método termina sin devolver nada
        // el compilador exige que TODOS los caminos posibles retornen un valor
        return ""; // si no colocamos esto falla o algo
    }

    // ---- El valor a retornar debe ser ASIGNABLE al tipo declarado ----
    int integer() {
        return 9; // OK: 9 es un int
    }

    int integerExpanded() {
        int temp = 9;
        return temp; // OK: mismo razonamiento, explícito con variable local
    }

    // int longMethod() {
    //     return 9L; // NO COMPILA: 9L es long, no cabe en un int sin cast explícito
    // }

    // int longExpanded() {
    //     int temp = 9L; // NO COMPILA: no podés guardar un long en una variable int
    //     return temp;
    // }

}

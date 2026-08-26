package Chapter5_Java.Day10_Jerarquías_y_Herencia_de_Clase.Introducing_Class_Inheritance.DefiningConstructors;

// ===================== Ejemplo 2: Código que NO compila =====================

//  ERROR: super() no es la primera línea del constructor
public class Zoo {
    public Zoo() {
        System.out.println("Zoo created");
     //   super(); // DOES NOT COMPILE
        // super() debe ser SIEMPRE la primera instrucción del constructor
    }
}

//  Ejemplo 3: Otro código que NO compila
/*
//  ERROR: solo puede haber UNA llamada a super() o this(),
// y debe ser la primera línea. Aquí aparece una segunda vez.
public class Zoo {
    public Zoo() {
        super();                    // Primera línea: correcto hasta aquí
        System.out.println("Zoo created");
        super();                    // DOES NOT COMPILE
        // No se puede llamar a super() más de una vez,
        // ni en ninguna posición que no sea la primera línea
    }
}

 */


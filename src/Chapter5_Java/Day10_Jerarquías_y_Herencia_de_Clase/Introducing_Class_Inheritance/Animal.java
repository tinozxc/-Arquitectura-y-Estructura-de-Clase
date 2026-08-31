package Chapter5_Java.Day10_Jerarquías_y_Herencia_de_Clase.Introducing_Class_Inheritance;

//la herencia es la cual una clase hija hereda sus comportamientos y metodos de la clase padre
public class Animal {
    // Atributo privado: SOLO es accesible dentro de esta misma clase (Animal)
    private int age;

    // Método público "getter": permite LEER el valor de age desde fuera,
    // incluso desde subclases como Lion
    public int getAge() {
        return age;
    }

    // Método público "setter": permite MODIFICAR el valor de age desde fuera
    public void setAge(int age) {
        this.age = age; // "this.age" es el atributo de la clase, "age" es el parámetro
    }
}


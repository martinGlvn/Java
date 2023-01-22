package a_Ejercicios;

public class E3 {

    //crear un bucle que permita concatenar textos e imprima el resultado.
    public static void main(String[] args) {

        String[] nombres = {"Hola", "mi", "nombre", "es", "martin"};
        String suma = "";

        for (int i = 0; i < nombres.length; i++) {
            suma = suma + nombres[i];
            System.out.printf(" "+nombres[i]);
        }

    }






}

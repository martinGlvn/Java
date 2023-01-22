package BasicSintax;

import java.util.Scanner;

public class Learn5Condicionales {
    public static void main(String[] args) {

        System.out.println("Practicando Condicionales");

        //Condicional if =
        int edad = 20;

        if (edad >= 20) {
            System.out.println("Es mayor a 19");
        } else {
            System.out.println("Es menor a 19");
        }

        //Operador Booleano && If
        int edad2 = 22;
        int cantidadDePersonas = 4;
        boolean esPareja = cantidadDePersonas > 1;
        boolean puedeEntrar = edad2 >= 20 && esPareja;
        if (puedeEntrar) {
            System.out.printf("Usted cumple los requisitos para entrar");
        } else {
            System.out.println("Usted no cumple los requisitos para entrar");
        }


        //Ejemplo de como calculadora basica de variables utilizando user inputs ==>

        Scanner scanner = new Scanner(System.in); // => Definimos el uso de scanner

        System.out.print("Ingresa el 1er numero \n"); // Pedimos al usuario un valor
        double number1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Ingresa el 2do numero \n"); // Pedimos al usuario un valor
        double number2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Que operacion deseas realizar? "); //Preguntamos al usuario
        String operation = scanner.nextLine();

        //Realizamos los calculos dependiendo la operacion que desee el usuario =>
        if (operation.equals("suma")) {
            System.out.printf("El resultado de la suma de %f + %f = %f", number1, number2, number1 + number2);
        } else if (operation.equals("resta")) {
            System.out.printf("El resultado de la resta de %f - %f = %f", number1, number2, number1 - number2);
        } else if (operation.equals("multiplicacion")) {
            System.out.printf("El resultado de la resta de %f * %f = %f", number1, number2, number1 * number2);
        } else if (operation.equals("division")) {
            System.out.printf("El resultado de la resta de %f / %f = %f", number1, number2, number1 / number2);
        } else {
            System.out.printf("%s la operacion requerida no esta permitida", operation);
        }


        //Para mejorar el rendimiento y eficiencia de nuestro codigo podriamos utilizar "SWITCH"


        Scanner scanner2 = new Scanner(System.in); // => Definimos el uso de scanner

        System.out.print("Ingresa el 1er numero \n"); // Pedimos al usuario un valor
        double numero1 = scanner2.nextDouble();
        scanner2.nextLine();

        System.out.print("Ingresa el 2do numero \n"); // Pedimos al usuario un valor
        double numero2 = scanner2.nextDouble();
        scanner2.nextLine();

        System.out.print("Que operacion deseas realizar? "); //Preguntamos al usuario
        String operacion = scanner2.nextLine();


        //Switch permite evaluar casos posibles en este caso "sum" y "sub"
        switch (operacion) {
            case "sum":
                System.out.printf("El resultado de la suma de %f + %f = %f", numero1, numero2, numero1 + numero2);
                break; //El break frena el ciclo una vez finaliza esta condicion
            case "sub":
                System.out.printf("El resultado de la suma de %f - %f = %f", numero1, numero2, numero1 - numero2);
                break; //El break frena el ciclo una vez finaliza esta condicion
            //Default se ejecutara si ningun caso se establece x parte del usuario en este caso!!!
            default:
                System.out.printf("%s la operacion requerida no esta permitida", operation);
        }



    }
}

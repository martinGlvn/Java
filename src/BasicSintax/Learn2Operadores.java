package BasicSintax;
public class Learn2Operadores {
    public static void main(String[] args) {

        //Operadores Aritmeticos ==>

        int number1 = 10;
        int number2 = 5;

        //Suma
        System.out.println(number1 + number2);
        //Resta
        System.out.println(number1 - number2);
        //Multiplicacion
        System.out.println(number1 * number2);
        //Division
        System.out.println(number1 / number2);
        //Modulo
        System.out.println(number1 % number2);

        
        //Operadores de Igualdad ==>

        int number3 = 10;
        int number4 = 5;

        //Igualdad
        System.out.println(number3 == number4);
        //Distinto
        System.out.println(number3 != number4);
        //Mayor a
        System.out.println(number3 > number4);
        //Menor a
        System.out.println(number3 < number4);
        //Mayor o igual
        System.out.println(number3 >= number4);
        //Menor o igual
        System.out.println(number3 <= number4);



        //Operadores de Comparacion
        int edad = 21;

        boolean isStudent = false;
        boolean isLibrary = true;

        // a y b
        System.out.println(edad >= 20 && edad >= 50);
        // a o b
        System.out.println(isStudent || isLibrary);
        // distinto
        System.out.println(!isStudent);
        //
    }

    

}

package BasicSintax;
public class Learn1Variables {
    public static void main(String[] args) {

        //VARIABLES ===>

        int edad = 28;
        System.out.println("Mi edad es " + edad);
        edad = 25 + 50;
        System.out.println("Mi edad ahora es " + edad);
        String name = "Martin";
        System.out.println("Mi nombre es " + name);


        //Tipos de Datos ===> "PRIMITIVOS" a estos se les asigna un valor
        long numberLong = 243432424242434243l; //64bits
        short numberShort = 32434;  //16bits
        byte numberByte = 16; //8 bits
        float numberFloat = 2.5F; //32bits

        //Decimals
        double dinero = 50.25;
        float money = 3.40f;

        //Booleans
        boolean isTrue = true;
        boolean isFalse = false;


        //Casteo de Variables
        double dato1 = 50.10;
        int datoCasteado = (int) dato1;
        System.out.println(datoCasteado);
        //Casteo ejemplo 2
        double numero = 5.5;
        int numero2 = (int) numero;
        System.out.println(numero2);


        //Characters es la representacion de un unico caracter sea number or String en estas
        //podemos almacenar valores que representan simbolos o caracteres especiales...
        char cSymbol = '\u00A9';
        char percentSymbol = '%';



    }
}

package BasicSintax;


public class Learn7Ciclos {
    public static void main(String[] args) {
        

        /*===================Ciclos FOR===================
         * 
         * El ciclo FOR funciona de la misma manera que while con la diferencia que se ejecutara 1 vez
         * se de o no la condicion, ademas que el alcance de la variable en for no es global en cambio en
         * while la variable si es global...
         * 
         * 
         * 1- El primer ejemplo muestra como el contador va desde 0 a 10 y imprime cada uno de sus numeros
         * 2- En el ejemplo 2 utilizamos el "anexado de 2 for" logrando las tablas del 1 hasta el 10
         * 3- En el tercer ejemplo utilizamos break para frenar el 2do for anexado en caso de que columna > fila
         * 4- Mientras index sea menor a la longitud del array imprimiremos la posicion numbers[index]
         */

        
        
        for (int contador4 = 0; contador4 <= 10; contador4++) {
            System.out.println(contador4);
        }



        for (int contador5 = 0; contador5 <= 10; contador5++) {
            for (int multiplicacion = 0; multiplicacion <= 10; multiplicacion++) {
                System.out.println(contador5 * multiplicacion);
                System.out.println(" ");
            }
            System.out.println();
        }


        
        for (int fila = 0; fila <= 10; fila++) {
            for (int columna = 0; columna <= 10; columna++) {
                if(columna > fila){
                    break;//Break frena el ciclo "si se cumple no ejecuta mas el ciclo"
                }
                System.out.println("*");
                System.out.println(" ");
            }
            System.out.println();
        }



        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        for(int index = 1; index < numbers.length; index++){
            System.out.println(numbers[index]);
        }


        /*===================Ciclos WHILE===================
         * 
         * While nos permitira utilizar variables globales es decir que esten fuera
         * del alcance {...} ademas solo se ejecutara cuando la condicion se cumpla
         * lo contrario a for que pase lo que pase se ejecutara siempre por lo menos
         * una vez se cumpla o no la condicion...
         * 
         * 
         * 1- Mientras contador sea <= 10 se sumara por cilo +1 a la varible contador
         * 2- Mientras contador2 sea <= 10 se sumara por ciclo +3 a la variable contador
         * 3- En el tercer ejemplo formamos la sucesion de numeros del 1 a 10 
         * 4-
         */


        int contador = 0;
        while (contador <= 10) { //Mientras contador sea <= 10 sumada +1...
            contador++;
            System.out.println(contador);
        }

        
        int contador2 = 0;
        while (contador2 <= 10) { //Mientras contador sea <= 10 sumada + 3...
            contador2 += 3;
            System.out.println(contador);
        }

        
        int contador3 = 0;
        int total = 0;
        while (contador3 <= 10) { //Mientras contador3 sea <= 10 sumaremos todos los valores
            total = total + contador3; 
            contador3++;
        }
        System.out.println(total);


        //For
        for (int i = 0; i < 2; i++) {
            System.out.println("hola mundo");
        }

        String[] nombres = {"Martin", "Ignacio", "Roberto"};
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        int suma = 0;
        int[] numeros = {5, 9, 10};
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }

        //For Each =>

        String[] nombres2 = {"Martin", "Ignacio", "Roberto"};
        for (String nombre : nombres2) {
            System.out.println(nombre);
        }

        int suma2 = 0;
        int[] numeros2 = {10,50,22};
        for (int numero : numeros2){
            suma2 += numero;
        }
        System.out.println(suma2);

        

        
    }
}

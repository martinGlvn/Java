package BasicSintax;

import java.util.Arrays;


public class Learn6Arrays {
    public static void main(String[] args) {

        // Los arrays nos permiten colocar multiples valores dentro de una variable...

        char vowels[] = new char[5]; //Creacion de array con con un maxico de 5 caracteres

        vowels[0] = 'a';
        vowels[1] = 'b';
        vowels[2] = 'c';
        vowels[3] = 'd';
        vowels[4] = 'e';

        System.out.println(vowels[0]); //Imprimir un solo elemento
        System.out.println(Arrays.toString(vowels)); //Imprimir todos los elementos

         
        int numbers[] = {1, 2, 3, 4, 5}; // creacion de un array con todos sus elementos al inicio.
        System.out.println(Arrays.toString(numbers)); //Imprimir todos los elementos
        

        //Reemplazar elementos de un array-matriz
        numbers[2] = 10;

        
       /* Metodos de Arrays mas utilizados =>
        * 1- Conoces la longitud total de un array ".length"
        * 2- Ordenar un array ".sort"
        * 3- Ordenar dentro de un rango de parametros es decir solo en una seccion aplicaremos ".sort"
        * 4- Buscar un elemento especifico dentro de un array ".sort"
        * 5- Busqueda dentro de un rango especifico del array ".binarySearch"
        * 6- Modificamos todos los elementos de un array por uno ".fill"
        * 7- Modificamos multiples elementos especifiando las posiciones de inicio y final ".fill"
        * 8- Utilizamos el metodo correcto para crear una copía de un array ".copyOf"
        * 9- Copiamos solo un rango especifico de un array "copyOfRange"
        */

        System.out.println(numbers.length);//Longitud total


        char vocales[] = {'e', 'a', 'u', 'o', 'i'}; //Vocales desordenadas
        Arrays.sort(vocales);//Ordenar vocales
        System.out.println(Arrays.toString(vocales));

        
        int inicioOrden = 1; //Definimos desde donde...
        int finalizoOrden = 3;//Definimos hasta donde...
        Arrays.sort(vocales, inicioOrden, finalizoOrden);//ordenamos dsd el indice 1 a 3
        System.out.println(Arrays.toString(vocales));


        char key = 'i'; //Definimos el elemento a buscar
        int busquedaElmento = Arrays.binarySearch(vocales, key); // Almacenamos en una variable el elemento encontrado.
        System.out.println(busquedaElmento); //Imprimimos el elemento encontrado.


        int inicioBusqueda = 1;//Definicimos 1ra posicion de busqueda
        int finalBusqueda = 4;//Definimos ultimo elemento de busqueda
        char key2 = 'o';//Definimos elemento a buscar
        int busquedaItems = Arrays.binarySearch(vocales, inicioBusqueda, finalBusqueda, key2);//Iniciamos la busqueda
        System.out.println(busquedaItems);//posicion #3


        Arrays.fill(vocales, 'i');//Utilizamos el metodo fill y pasamos el parametro a utilizar
        System.out.println(Arrays.toString(vocales));//[i,i,i,i,i]


        int modificarDesde = 1;//Inicio
        int modificarHasta = 4;//Fin
        Arrays.fill(vocales, modificarDesde, modificarHasta, 't'); //Desde donde hasta donde modificar
        System.out.println(vocales);//['a','t','t','t','u']


        int numerosSinCopia[] = {1,2,3,4,5,6,7,8,9,10}; //Array creado para realizarle una copia correcta
        int copiaDeNumeros[] = Arrays.copyOf(numerosSinCopia, numerosSinCopia.length); //Especificamos el arrays y la longitud.
        System.out.println(Arrays.toString(copiaDeNumeros));//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


        int inicioCopia = 1;//Inicio
        int finalizoCopia = 4;//Fin
        int rangoDeCopia[] = Arrays.copyOfRange(numerosSinCopia, inicioCopia, finalizoCopia);//Incio de copia a fin
        System.out.println(Arrays.toString(rangoDeCopia));//[2,3,4]



    }
}

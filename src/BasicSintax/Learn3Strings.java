package BasicSintax;
public class Learn3Strings {
    public static void main(String[] args) {

        //Cuando Comparamos strings con el mismo contenido
        //el valor de ambos es asignado es decir que son iguales.
        String name = "Martin";
        String name2 = "Martin";
        System.out.println(name == name2);// => True

        //En cambio si creamos 2 string como objeto cada string
        //contedra un valor unico siendo variables diferentes con el mismo contenido.
        String apellido = new String("Galvan");
        String apellido2 = new String("Galvan");
        System.out.println(apellido == apellido2); // => False

        
        //Concatenacion de Variables =>

        String name3 = "Martin Galvan";
        int edad = 19;

        //Ejemplo 1 => El menos utilizado
        System.out.println("Mi nombre es " + name3 + " y mi edad es " + edad);
        //Ejemplo 2 => El menos utilizado
        String metodoDos = String.format("Mi nombre es %s y mi edad es %d", name3, edad);
        System.out.println(metodoDos);

        
        //Metodos de Strings =>

        //Comprobar Longitud de la cadena
        String hola = "la longitud";
        System.out.println(hola.length()); //Comprobamos la longitud de la cadena => 11

        //Comprobamos si la variable esta vacia o no => True || False
        String cadena = "";
        System.out.println(cadena.isEmpty());//Comprobamos si cadena contiene caracteres o no => True

        //Convertimos la cadena a mayusculas
        String mayus = "martin";
        System.out.println(mayus.toUpperCase()); // => MARTIN

        //Convetimos la cadena a minusculas
        String minus = "MARTIN";
        System.out.println(minus.toLowerCase()); // => martin

        //Comprobar si el contenido de las variables son iguales => equals comprueba la igualdad del contenido...
        String iguales = new String("abc");
        String iguales2 = new String("abc");
        System.out.println(iguales == iguales2); // => False
        System.out.println(iguales.equals(iguales2)); // => True

        //Comprobar la igualdad del contenido ignorando las Minusculas o Mayusculas
        String igualdad = "PRUEBA";
        String igualdad2 = "pRuEbA";
        System.out.println(igualdad.equalsIgnoreCase(igualdad2)); // => True

        //Reemplazar valores dentro de una cadena
        String color1 = "mi color favorito es el rojo";
        System.out.println(color1.replace("rojo", "blue")); // => "mi color favorito es el blue"

        //Comprobar si la cadena contiene un dato especifico
        String auto = "Mercedez Benz 1981";
        System.out.println(auto.contains("1981")); // => True

        
        System.out.println(hola);
        
        

    }
}

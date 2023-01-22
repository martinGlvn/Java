package BasicSintax;

public class Learn8Funciones {

    public static void main(String[] args) {

        /* ===========Funciones===========
        */
        imprimeDatos();


        /* ===========Funciones con Parametros===========
        */
        imprimirSaludo("Martin");
        sumarDatos(50, 90);

        System.out.println();
    }
    static void imprimeDatos(){
        System.out.println("Probando Funciones");
    }

    static void imprimirSaludo(String name){
        System.out.println("hola como estas "+name);
    }

    static int sumarDatos(int sum, int sum2){
        return sum + sum2;
    }

    //Funciones Anonimas


}

package a_Ejercicios;

public class E2 {

    //Crear una función que reciba un precio y devuelva el precio con el IVA incluido.
    public static void main(String[] args) {
        System.out.println(calcularIva(25));
    }

    static double calcularIva(double producto) {
        double iva = 1.21;
        return producto * iva;
    }

}

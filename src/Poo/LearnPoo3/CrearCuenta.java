package Poo.LearnPoo3;

public class CrearCuenta {

    public static void main(String[] args) {
        //Creando una cuenta gracias a la clase cuenta =>
        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.saldo = 1000;
        System.out.println(primeraCuenta.saldo);

        Cuenta segundaCuenta = new Cuenta();
        segundaCuenta.saldo = 500;
        System.out.println(segundaCuenta.saldo);



    }



}

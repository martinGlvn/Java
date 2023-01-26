package Poo.LearnPoo3;

public class TestReferencia {

    public static void main(String[] args) {

        Cliente diego = new Cliente();
        diego.nombre = "Diego";
        diego.documento = "432355252";
        diego.telefono = "324233252";

        Cuenta cuentaDeDiego = new Cuenta();
        cuentaDeDiego.agencia = 1;
        cuentaDeDiego.titular = diego;

        System.out.println(cuentaDeDiego.titular.documento);
        System.out.println(cuentaDeDiego.titular);


    }


}

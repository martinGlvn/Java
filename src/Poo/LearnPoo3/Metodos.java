package Poo.LearnPoo3;

public class Metodos {

    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta();
        miCuenta.saldo = 300;
        miCuenta.depositar(200);
        System.out.println(miCuenta.saldo);
        miCuenta.retirar(100);
        System.out.println(miCuenta.saldo);

        Cuenta cuentaNacho = new Cuenta();
        cuentaNacho.depositar(1000);
        boolean puedeTransferir = cuentaNacho.transferir(500, miCuenta);
        if(puedeTransferir){
            System.out.println("Transferencia Exitosa");
        }else {
            System.out.println("No es posible");
        }
        System.out.println(cuentaNacho.saldo);
        System.out.println(miCuenta.saldo);

    }
}

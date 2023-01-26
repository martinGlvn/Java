package Poo.LearnPoo3;

public class Cuenta {
    double saldo;
    int agencia;
    int numero;
    Cliente titular;



    /* Metodos =>
     * 1- El metodo Depositar nos permite sumar dinero a nuestra cuenta atraves de la viable valor
     * 2- El metodo Retirar nos permite retirar dinero de nuestra atraves de 2 parametros "cantidad" y "cuenta".
     * 3- El metodo Transferir
     */
    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(double valor, Cuenta cuenta) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            cuenta.depositar(valor);
            return true;
        }
        return false;
    }


}

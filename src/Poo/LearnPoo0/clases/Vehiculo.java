package Poo.LearnPoo0.clases;

public class Vehiculo {

    //1- Atributos
    protected String fabricante;
    protected String modelo;
    protected double cc;
    protected int year;
    protected boolean sport;
    protected int speed;
    protected Motor motor;//motor es un objeto("atributo") que amplia cracteristicas a nuestro "vehiculo"

    // 2 => Constructores...
    //Constructores => En este caso el constructor nos permite crear un objeto vehiculo
    //rapidomente aunque en este caso la creacion seria de un objeto vacio ya que no recibe paramentros.
    //Sobrecarga => Cuando hablamos de sobrecarga hacemos referencia a la duplicacion de metodos donde lo unico que
    //cambia son sus parametros.
    public Vehiculo() {
    }

    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport, int speed, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }

    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Vehiculo(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }


    //3- Metodos (comportamiento)
    //Encapsulamiento => lo utilizamos cuando deseamos protejer la visibilidad de nuestros atributos para
    //esto creamos un metodo get.
    public void acelerar(int quantity) {
        this.speed += quantity;
    }



}

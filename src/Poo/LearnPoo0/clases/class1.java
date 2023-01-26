package Poo.LearnPoo0.clases;

import Poo.LearnPoo0.herencia.Moto;

public class class1 {

    public static void main(String[] args) {


        //Creacion de Objetos => utilizando el "Constructor" de la clase Vehiculo

        Vehiculo toyotaHilux = new Vehiculo(); //Objeto vacio =>

        Motor motorGti = new Motor("GTI", 190, 450.0, 8);
        Vehiculo ferrariHs = new Vehiculo //Objeto con parametros utilizando el constructor =>
                (
                        "Ferrari",
                        "Hs", 3.0,
                        2020,
                        true,
                        0,
                        motorGti
                );

        Moto hondaKz = new Moto();




    }
}

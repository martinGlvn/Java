package Poo.LearnPoo0.herencia;

import Poo.LearnPoo0.clases.Motor;
import Poo.LearnPoo0.clases.Vehiculo;

public class Moto extends Vehiculo {

    boolean baul;

    public Moto(){}

    public Moto(String fabricante, String modelo, double cc, int year, boolean sport, int speed, Motor motor) {
        super(fabricante, modelo, cc, year, sport, speed, motor);
        this.baul = baul;
    }
}

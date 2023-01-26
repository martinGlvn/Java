package a_Ejercicios.E4;


public class Main {

    public static void main(String[] args) {

        SmartDevice SmartPhone = new SmartDevice
                (
                        "Iphone 14",
                        true,
                        128,
                        4000,
                        6.28,
                        true,
                        true,
                        true
                );
        SmartPhone.mostrarDatos();

        SmartDevice SmartWatch = new SmartDevice
                (
                        "SmartWatch",
                        false,
                        8,
                        1000,
                        2.30,
                        false,
                        true,
                        true
                );
    }



}

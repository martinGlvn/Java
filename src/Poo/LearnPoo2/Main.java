package Poo.LearnPoo2;

public class Main {
    public static void main(String[] args) {

        Persona persona1;

        persona1 = new Persona();
        persona1.nombre = "Martin";
        persona1.edad = 24;
        persona1.mostrarDatos();

        Persona persona2 = new Persona();
        persona2.nombre = "Ignacio";
        persona2.edad = 25;
        persona2.mostrarDatos();


    }
}

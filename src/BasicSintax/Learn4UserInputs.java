package BasicSintax;
import java.util.Scanner;

public class Learn4UserInputs {
    public static void main(String[] args) {

        //Obtener datos de usuarios como entrada
        Scanner scanner = new Scanner(System.in); //Establecemos el objeto Scanner.

        System.out.print("What is your name \n");
        String name = scanner.nextLine(); //Almacenamos los datos Ingresados por el usuario

        System.out.print("Hold are you? \n");
        int age = scanner.nextInt(); //Almacenamos los datos Ingresados por el usuario


        if (name != "martin" && age <= 18) {
            System.out.println("Eres un usuario no registrado o tu edad no es la permitida ");
        }else{
            System.out.println("Tienes el ingreso permitido");
        }

        scanner.close(); //Cerramos el objeto establecido para que pueda ser ejecutado
    }
}

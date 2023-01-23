package Poo;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

//Definimos nuestra clase a utilzar =>
public class User {
    public String name; //Nombre de usuario
    public LocalDate birthDay; //Tipo de dato especial que almacenara el cumpleaños del usuario
    public ArrayList<Book> books = new ArrayList<Book>();

    public void borrow(Book book) {
        this.books.add(book);
    }

    public int age() {
        int age = Period.between(this.birthDay, LocalDate.now()).getYears();
        return age;
    }//Entre birthday y la fecha actual obtiene mi edad actual...

}
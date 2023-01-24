package Poo.LearnPoo1;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

//Definimos nuestra clase a utilzar =>
public class User {
    private String name; //Nombre de usuario
    private LocalDate birthDay; //Tipo de dato especial que almacenara el cumpleaños del usuario
    private ArrayList<Book> books = new ArrayList<Book>();

    User(String name, String birthDay){
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay);
    }

    public String getName(){
        return this.name;
    }
    public String getBirthDay(){
        return this.birthDay.toString();
    }

    public String borrowedBooks(){
        return this.books.toString();
    }

    public void borrow(Book book) {
        this.books.add(book);
    }
    public int age() {
        int age = Period.between(this.birthDay, LocalDate.now()).getYears();
        return age;
    }//Entre birthday y la fecha actual obtiene mi edad actual...

}
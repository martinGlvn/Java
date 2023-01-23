package Poo;

import java.time.LocalDate;

public class ObjetcUser {
    public static void main(String[] args) {

        //Primer Usuario =>
        User user = new User();
        user.name = "Martin Galvan";
        user.birthDay = LocalDate.parse("2005-01-30");

        //Libros prestados del usuario =>
        Book book = new Book();
        book.title = "Sherlock Holmes";
        book.author = "Kafka";
        user.borrow(book);

        System.out.printf( //Imprimimos los Datos del primer usuario
                "%s warn born back in %s and he is now %d years old.\n",
                user.name,
                user.birthDay.toString(),
                user.age()
        );

        System.out.printf("%s has borrowed these books: %s\n", user.name, user.books.toString());


    }
}

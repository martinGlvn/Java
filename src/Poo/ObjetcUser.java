package Poo;

public class ObjetcUser {
    public static void main(String[] args) {

        //Primer Usuario =>
        User user = new User("Martin Galvan", "2005-01-30");
        //Libros prestados del usuario =>
        Book book = new Book("Sherlock Holmes", "Kafka");

        user.borrow(book);

        System.out.printf( //Imprimimos los Datos del primer usuario
                "%s warn born back in %s and he is now %d years old.\n",
                user.getName(),
                user.getBirthDay(),
                user.age()
        );

        System.out.printf("%s has borrowed these books: %s\n", user.getName(), user.borrowedBooks());


    }
}

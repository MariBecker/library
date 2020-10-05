package view;
import model.Book;

import java.util.Scanner;

public class CreateBookView {

    public static Book createBook() {
        Scanner input = new Scanner(System.in);

        System.out.println("______ Criar Livro ______");
        System.out.println("Digite as informações solicitadas.");

        System.out.println("Título: ");
        String title = input.nextLine();
        System.out.println("Autor: ");
        String author = input.nextLine();

        Book book = new Book(1, title, author);

        return book;
    }
}

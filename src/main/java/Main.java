import controller.BookController;
import model.Book;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Scanner;
import static view.CreateBookView.*;
import static view.MenuView.*;

public class Main {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        showMenu();

        int selectedOption = input.nextInt();

        Book newBook = null;
        BookController bookController = new BookController();

        switch(selectedOption) {
            case 1:
                newBook = createBook();
                break;
            case 2:
                System.out.println("Opção 02 não implementada ainda.");
                break;
            default:
                System.out.println("Selecione um opção valida");
        }
        
        bookController.create(newBook, "src/dados.json");




    }
}

package controller;

import model.Book;
import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;

public class BookController {

    private ArrayList<Book> books = new ArrayList<Book>();

    private static String fromBookToJson(Book book) {
        String json = new Gson().toJson(book);
        return json;
    }

    private static Book fromJsonToBook(String jsonBook) {
        Book book = new Gson().fromJson(jsonBook, Book.class);
        return book;
    }

    public void create(Book book, String file) throws IOException {
        //Cria um Output Stream
        OutputStream fos = new FileOutputStream(file);
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        //Converte o Objeto Book em Json
        String json = fromBookToJson(book);

        //Escreve no arquivo e fecha o arquivo
        bw.newLine();
        bw.write(json);
        bw.close();
    }

    public ArrayList<Book> listAllBooks() {
        return books;
    }
}

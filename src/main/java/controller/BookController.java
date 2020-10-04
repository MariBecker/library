package controller;
import model.Book;
import com.google.gson.Gson;

import java.io.*;

public class BookController {

    private static String serializeBook(Book book){
        Gson gson = new Gson();
        String json = gson.toJson(book);
        return json;
    }

    private static Book deserializeBook(String jsonBook){
        Gson gson = new Gson();
        Book book = gson.fromJson(jsonBook, Book.class);
        return book;
    }

    public void print(Book book){
        System.out.println(serializeBook(book));
    }

    public void save(Book book, String file) throws IOException {
        //Cria um Output Stream
        OutputStream fos = new FileOutputStream(file);
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        //Converte o Objeto Book em Json
        String json = serializeBook(book);

        //Escreve no arquivo e fecha o arquivo
        bw.write(json);
        bw.close();
    }
}

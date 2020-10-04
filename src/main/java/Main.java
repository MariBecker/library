import java.io.*;

import controller.BookController;
import model.*;

public class Main {
    public static void main(String[] args) throws IOException {

//        // Lê os dados binários
//        InputStream fis = new FileInputStream("src/dados.txt");
//        // Converte os binários para characters
//        Reader isr = new InputStreamReader(fis);
//        // Converte os characteres para uma linha inteira
//        BufferedReader br = new BufferedReader(isr);
//
//        String linha = br.readLine();
//
//        while (linha != null) {
//            System.out.println(linha);
//            linha = br.readLine();
//        }
//
//        br.close();

        Book livro = new Book(1, "livro volume 1", "Roger Oliver");
        BookController controller = new BookController();

        controller.Save(livro, "src/dados.json");

    }
}

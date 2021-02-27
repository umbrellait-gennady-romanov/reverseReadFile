import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String path = "/Users/gennadyromanov/Documents/Metro/Clean_Enrich_Cardholder.json";

        try {
            EndFileBufferRead endFileBufferRead = new EndFileBufferRead(new File(path));
            System.out.println(endFileBufferRead.readEnd());
            for(int i = 0; i < endFileBufferRead.buffer.length; i++) {

                System.out.print((char) endFileBufferRead.buffer[i]);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
            e.printStackTrace();
        }

    }
}

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String path = "/Users/gennadyromanov/Documents/Metro/Clean_Enrich_Cardholder.json";
        int bufferSize = 1024 * 1;

        try {
            EndFileBufferRead endFileBufferRead = new EndFileBufferRead(new File(path), bufferSize);
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

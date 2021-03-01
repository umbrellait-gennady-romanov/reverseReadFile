import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) {

        String path = "";
        int bufferSize = 1024 * 4;

        try {
            System.out.println("read start file:");
            FileRead fileRead = new FileRead(new File(path), bufferSize);
            System.out.println(fileRead.readBuf() + " bytes");
            for(int i = 0; i < fileRead.buffer.length; i++) {

                System.out.print((char) fileRead.buffer[i]);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
            e.printStackTrace();
        }

        try {
            System.out.println();
            System.out.println("read end file:");
            EndFileRead endFileBufferRead = new EndFileRead(new File(path), bufferSize);
            System.out.println(endFileBufferRead.readEnd() + " bytes");
            for(int i = 0; i < endFileBufferRead.buffer.length; i++) {

                System.out.print((char) endFileBufferRead.buffer[i]);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
            e.printStackTrace();
        }


    }
}

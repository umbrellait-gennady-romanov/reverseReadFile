import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileRead {
    private RandomAccessFile in;
    public byte[] buffer;

    public FileRead(File file, int bufferSize) throws IOException {
        in = new RandomAccessFile(file, "r");
        buffer = new byte[bufferSize];
    }

    public int readBuf() throws IOException {
        return in.read(buffer);
    }
}

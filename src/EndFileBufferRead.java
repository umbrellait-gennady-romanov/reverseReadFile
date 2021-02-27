import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class EndFileBufferRead {

    private static final int BUFFER_SIZE = 1024 * 1;

    private RandomAccessFile in;
    public byte[] buffer;
    private long currentBufferPos;

    public EndFileBufferRead(File file) throws IOException {
        in = new RandomAccessFile(file, "r");
        buffer = new byte[BUFFER_SIZE];
        currentBufferPos = file.length() - BUFFER_SIZE;
    }

    public int readEnd() throws IOException {

        if (currentBufferPos < 0 ) {
            return -1;
        }
        in.seek(currentBufferPos);
        return in.read(buffer);
    }

}

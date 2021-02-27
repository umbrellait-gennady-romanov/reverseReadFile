import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class EndFileBufferRead {

    private static final int BUFFER_SIZE = 1024 * 4;

    private RandomAccessFile in;
    public byte[] buffer;
    private long currentBufferPos;

    public EndFileBufferRead(File file, int bufferSize) throws IOException {
        in = new RandomAccessFile(file, "r");
        buffer = new byte[bufferSize];
        currentBufferPos = file.length() - bufferSize;
    }

    public int readEnd() throws IOException {

        if (currentBufferPos < 0 ) {
            return -1;
        }
        in.seek(currentBufferPos);
        return in.read(buffer);
    }

}

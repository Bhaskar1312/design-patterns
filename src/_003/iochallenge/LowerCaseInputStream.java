package _003.iochallenge;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a {@code FilterInputStream}
     * by assigning the  argument {@code in}
     * to the field {@code this.in} so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or {@code null} if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = in.read();
        return c==-1? c: Character.toLowerCase((char)c);
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int res = in.read(b, offset, len);
        for(int i=offset;i<offset+res;i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(
                                    new BufferedInputStream(
                                        new FileInputStream("test.txt")));
            while ((c=in.read())!=-1) {
                System.out.print((char)c);
            }
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

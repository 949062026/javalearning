import java.io.*;

public class SequenceInputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        Reader r1 = new FileReader("A.java");
        Reader r2 = new FileReader("B.java");
        Writer writer = new FileWriter("C.java");
        int ch = 0;
        while ((ch=r1.read())!=-1){
            writer.write(ch);
        }
        while ((ch=r2.read())!=-1){
            writer.write(ch);
        }
        r1.close();
        r2.close();
        writer.close();

    }
}

import java.io.*;

public class SequenceInputStreamDemo {
    public static void main(String[] args) throws IOException{
        InputStream s1 = new FileInputStream("/Users/wangguangze/Desktop/代码/javalearning/src/A.java");
        InputStream s2 = new FileInputStream("/Users/wangguangze/Desktop/代码/javalearning/src/B.java");
        SequenceInputStream sis = new SequenceInputStream(s1,s2);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C.java"));

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len=sis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bos.close();
    }
}

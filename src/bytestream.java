//Wap a Java program to read from file input.txt and write its contents to output.txt 
import java.io.*;

public class bytestream {
    public static void main(String[] args) throws Exception {
        FileInputStream in =null;
        FileOutputStream out=null;
        try {
            in=new FileInputStream("input.txt");
            out=new FileOutputStream("output.txt");
            int c;
            while ((c=in.read())!=-1) {
                out.write(c);
                
            }
        } catch (IOException e) {
            // TODO: handle exception
            throw e;

        }
        finally
        {
            System.out.println("Finally block executed");
            in.close();
            out.close();
        }
    }
    
}

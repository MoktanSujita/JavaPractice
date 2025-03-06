import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        FileReader in =null;
        FileWriter out=null;
        try {
            in=new FileReader("in.txt");
            out=new FileWriter("out.txt");
            int c;
            while ((c=in.read())!=-1) {
                out.write(c);
                
            }
        }
        finally
        {
            System.out.println("Finally block executed!");
            if(in!=null)
            {
                in.close();
            }
            if (out!=null) 
            {
                out.close();  
            }
        }
        }
    }


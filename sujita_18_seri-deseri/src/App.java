
//Write a java program to deserialize and serialize objects

import java.io.*;
public class App{
    public static void main(String[] args)throws Exception{
       
        try {
            Employee emp=new Employee();
            emp.Id=1;
            emp.Name="sujita";
            emp.Address="ktm";        
             FileOutputStream out= new FileOutputStream("input.txt");
             ObjectOutputStream obout=new ObjectOutputStream(out);
             obout.writeObject(emp);
             obout.close();
             out.close();
             System.out.println("Object is serialized");

             FileInputStream in =new FileInputStream("input.txt");
             ObjectInputStream obinput=new ObjectInputStream(in);
             Employee demp =(Employee)obinput.readObject();
             in.close();
             obinput.close();
             System.out.println(demp.Name+ "" +demp.Address+"" +demp.Id);
        } 
        catch (IOException e) {
           e.printStackTrace();
        }
        
    }

}


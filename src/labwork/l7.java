package labwork;

import java.util.Scanner;

public class l7 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try
        {
          System.out.println("Enter your numerator");
          int a=scanner.nextInt();
          System.out.println("Enter your denominator");
          int b=scanner.nextInt();
          if(b==0)
          {
            throw new ArithmeticException("Cannot divide by zero");
          }
          int result=a/b;
          System.out.println("result" +result);

        }
        catch(ArithmeticException e)
        {
            System.err.println("Error" +e.getMessage());
        }
        catch(Exception e)
        {
            System.err.println("Error:Invalid input!Please enter integers only.");
        }
        finally
        {
            System.out.println("Finally block executed");
            scanner.close();
        }
    }
}
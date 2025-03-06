import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
         System.out.println("Enter a string:");
         String str=scanner.nextLine().toLowerCase();
         System.out.println("Enter the character");
         char c=scanner.next().toLowerCase().charAt(0);

         int count=0;
         for (int i = 0; i < str.length(); i++)
          {
            if (str.charAt(i)==c)
             {
                count++;
            }
        }
        if (count>0) 
        {
            System.out.println("present times:" +count);
        }
        else
        {
            System.out.println("Not on the string!");
        }
        scanner.close();
    }
}
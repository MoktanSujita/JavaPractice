import java.util.Scanner;

public class l9 {
    public static void main (String[] args)
    {
        Scanner scanner=new Scanner (System.in);
        System.out.println("Enter your string:");
        String in=scanner.nextLine();
        scanner.close();
        in =in.toLowerCase();
        int count=0;
        for (int i = 0; i < in.length(); i++)
         {
            char ch=in.charAt(i);
            if (ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                count++;
            }
        }
        System.out.println("NO of vowels:" +count);   
    }
}

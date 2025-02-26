import java.util.Scanner;

public class l8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
            System.out.println("Enter your balance");
            int balance=scanner.nextInt();
            System.out.println("Enter the withdrawal amount:");
            int withdrawal=scanner.nextInt();
            if(withdrawal>balance)
            {
                throw new WithdrawalErrorException();
            }
            int rembalance=balance-withdrawal;
            System.out.println("Remaining balance:" +rembalance);

        }
         catch (WithdrawalErrorException e) {
            // TODO: handle exception
            System.err.println("Error:" +e.getMessage());

        }
        finally
        {
            System.out.println("Finally block executed");
            scanner.close();
        }
    }
    
}
class WithdrawalErrorException extends Exception
{
    public WithdrawalErrorException()
    {
        super("Withdrawal amount more than available balance! ");
    }
    public WithdrawalErrorException(String message)
    {
        super(message);
    }
}

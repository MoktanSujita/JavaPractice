public class App {

    public static void main(String[] args) {
        Customer c=new Customer();
        Thread t1=new Thread()
        {
           public void run()
           {
            c.withdrawn(40000);
           }
        };
        t1.start();
        Thread t2=new Thread()
        {
            public void run()
            {
                c.deposit(10000);
            }
        };
        t2.start();
    }
}
class Customer
{
    int amount=100000;
    synchronized void withdrawn(int amount)
    {
        if(this.amount<amount)
        {
            System.out.println("Amount not sufficient.....");
        }
        try {
            wait();
        } 
        catch (Exception e) {
            
        }
       amount-=this.amount;
       System.out.println("Amount withdrawn......");
    }
    synchronized void deposit(int amount)
    {
        System.out.println("Amount being deposited......");
        amount+=this.amount;
        System.out.println("Amout deposited......");
        notify();
    }

}
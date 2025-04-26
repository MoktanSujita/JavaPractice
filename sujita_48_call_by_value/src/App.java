public class App {
    public static void main(String[] args) throws Exception {
       Sum s=new Sum();
       s.sum(400);
    }
}
class Sum
{
    public void sum(int a)
    {
        System.out.println("Sum of" +a+ " and 100 is " +(a+100));
    }
}

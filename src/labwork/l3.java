 package labwork;
public class l3 {
    public static void main(String[] args) 
    {
        Calculate cal=new Calculate();  
    }
}
class Calculate
{
    public Calculate()
    {
      this(5);
       System.out.println("Veggies are good for health");
    }
    public Calculate(int x)
    {
        this(5,6);
        System.out.println("Number passed:" +x );
    }
    public Calculate(int x, int y)
    {
        System.out.println(" Sum of Numbers passed: " +(x+y));
    }
}

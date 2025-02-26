//java program for abstraction 
public class abstraction {
    public static void main(String[] args) {
        make s=new graph();
        s.shape();
        make s1=new pie();
        s1.shape();
    }
    
}
abstract class make//abstract class
{
    abstract void shape();//hiding the details and only method declaration
}
class graph extends make
{
   public void shape()
   {
    System.out.println("Drawing Graph");
   }
}
class pie extends make
{
    public void shape()//method overriding
    {
        System.out.println("Drawing Pie-chart");
    }
}

package labwork;

public class l4 {
    public static void main(String[] args) {
        make s=new graph();
        s.draw();
    }
    
}
abstract class make
{
   abstract void draw();
}
class graph extends make
{
    public void draw()
    {
        System.out.println("Drawing Graph");
    }
}
class pie extends make
{
    public void draw()
    {
        System.out.println("Drawing pie-chart");
    }
}

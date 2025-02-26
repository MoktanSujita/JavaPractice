package labwork;

public class l6 {
    public static void main(String[] args) {
        Childclass c=new Childclass();
        c.message();
        c.more();
    }
    
}
class Parentclass
{
    public void message()
    {
        System.out.println("Parent method message");
    }
}
class Childclass extends Parentclass
{
    public void message()
    {
        System.out.println("Child method message");
    }
    public void more()
    {
        System.out.println("A new method");
    }
}

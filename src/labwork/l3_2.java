package labwork;

public class l3_2 {
    public static void main(String[] args) {
        Child c=new Child();
        c.msg();
    }
    
}
class Parent
{
    public void msg()
    {
        System.out.println("Parent message");
    }
}
class Child extends Parent
{
    public void msg()
    {
    super.msg();
        System.out.println("Child message");
    }
}

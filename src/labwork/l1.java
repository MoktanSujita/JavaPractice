package labwork;

public class l1 {
    public static void main (String [] args) throws Exception {
        MyClass obj=new MyClass (8,5);
        obj.Add();
        obj.Sub();
        obj.Mul();
        obj.Div();
    }
}
class MyClass
{
    int a=0, b=0;
    public MyClass(int first,int second)
    {
        a=first;
        b=second;
    }
    public void Add ()
    {
       System.out.println("Sum:" +(a+b));
    }
    public void Sub ()
    {
        System.out.println("Difference:" +(a-b));
    }
    public void Mul ()
    {
        System.out.println("Multiplication:" +(a*b));
    }
    public void Div ()
    {

        System.out.println("Division:" +(a/b));
    }

    
}

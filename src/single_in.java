public class single_in {

    public static void main(String[] args) throws Exception
     {
        B obj=new B();
        int sum=obj.Add(5,5);
        int sub=obj.Sub(10,5);
        System.out.println("Sum:" +sum);
        System.out.println("Subtraction:" +sub);
    }
}
class A
{
    public int Add (int x,int y)
    {
        return x+y;
    }
}
class B extends A
{
    public int Sub (int x,int y)
    {
        return x-y;
    }
}
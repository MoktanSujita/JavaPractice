public class multi_lev {
    public static void main(String[] args) throws Exception
     {
        C obj=new C();
        int sum=obj.Add(5,5);
        int sub=obj.Sub(50,18);
        int div=obj.Div(100,5);
        System.out.println("Sum:" +sum);
        System.out.println("Subtraction:" +sub);
        System.out.println("Division:"+div);
    }
    
}
class A 
{
    public int Add(int x,int y)
    {
        return x+y;
    }
}
class B extends A 
{
    public int Sub(int x,int y)

    {
        return x-y;
    }
}
class C extends B
{
    public int Div(int x,int y)
    {
        return x/y;
    }
}

public class call_by_value {
    public static void main(String[] args) {
        Number num=new Number();
        num.value(500);
        System.out.println("Value before calling:" +num.a);
        num.value(100);
        System.out.println("Value after calling:" +num.a);
    }
    
}
class Number
{
    int a=500;
    public void value(int a)
    {
        a=a+100;
    }
}

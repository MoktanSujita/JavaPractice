package labwork;

public class l1_4 {
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        System.out.println(cal.mul(6,7));
        System.out.println(cal.mul(4,5,2));
    }
    
}
class Calculator
{
    public int mul(int a,int b)
    {
        return a*b;
    }
    public int mul(int a,int b,int c)
    {
        return a*b*c;
    }
}

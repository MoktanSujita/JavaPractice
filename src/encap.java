public class encap {
    public static void main(String[] args) {
        number num=new number(5, 5);
        num.mul();
    }
}
class number
{
    private int a;
    private int b;
    public number(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    public void mul()
    {
        System.out.println(a*b);
    }
}

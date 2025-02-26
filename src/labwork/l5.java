package labwork;

public class l5 {
    public static void main(String[] args) {
        operation op=new operation(5, 10);
        op.mul();
    }
    
}
class operation 
{
    private int a;
    private int b;
    public operation(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public void mul()
    {
        System.out.println(a*b);
    }
}


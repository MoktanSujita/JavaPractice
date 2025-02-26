public class call_by_ref {
    public static void main(String[] args) {
        Operation num=new Operation();
        num.ref(500);
        System.out.println("Value before calling:" +num.a);
        num.ref(600);
        System.out.println("Value after calling:" +num.a);
    }
}
class Operation
{
    int a=500;
    public void ref(int a)
    {
        this.a=a+100;
    }
}

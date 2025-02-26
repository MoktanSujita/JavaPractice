package labwork;

public class l2 {
    public static void main(String[] args) {
        C obj=new C();
        int peri=obj.methodP(10,6);
        int area=obj.methodA(10,6);
        System.out.println("Perimeter:"+peri);
        System.out.println("Area:"+area);
    }
    
}
interface A 
{
    public int methodA(int x,int y);
}
interface B 
{
    public int methodP(int x, int y);
}
class C implements A,B
{
    public int methodA(int x,int y)
    {
        return x*y;
    }
    public int methodP(int x,int y)
    {
        return 2*(x+y);
    }
}
    


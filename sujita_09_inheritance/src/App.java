public class App {

    public static void main(String[] args) throws Exception{
        Calculation ca=new Calculation(5, 9);
        System.out.println(ca.CArea());
        System.out.println(ca.CPerimeter());
    }
}
interface Area
{
    double CArea();
}
interface Perimeter
{
    double CPerimeter();
}
class Calculation implements Area,Perimeter
{
    private double len,bre;
    public Calculation(double l,double b)
    {
        this.len=l;
        this.bre=b;
    }
    public double CPerimeter()
    {
        return len*bre;
    }
    public double CArea()
    {
        return 2*(len+bre);
    }
}
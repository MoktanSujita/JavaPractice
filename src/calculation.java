public class App1 {
    public static void main(String[] args) {
        
    }
}
interface Area
{
    double calculateArea();
}
interface Perimeter
{
    double calculatePeri();
}
public class calculation implements Area,Perimeter
{
    private double length,breadth;
}
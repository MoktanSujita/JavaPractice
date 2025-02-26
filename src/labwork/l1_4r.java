package labwork;

public class l1_4r {
    public static void main(String[] args) {
        Dog an=new Dog();
        an.veggies();
    }
    
}
class Food
{
    public void veggies()
    {
        System.out.println("Eat Veggies");
    }
}
class Dog extends Food
{
    public void veggies()
    {
        super.veggies();
        System.out.println("Doggies can eat veggies");
    }
}

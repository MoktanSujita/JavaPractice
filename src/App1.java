public class App1 {

    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
        
    }
}
class Animal
{
    public void eat()
    {
        System.out.println("Animals eat");
    }
}
class Dog extends Animal
{
    public void eat() 
    {
    super.eat();
        System.out.println("have something");
}
}

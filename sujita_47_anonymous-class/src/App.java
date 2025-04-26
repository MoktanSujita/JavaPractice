public class App {
    public static void main(String[] args) {
        Message m=new Message() {
           public void display()
           {
            System.out.println("Anonymous inner class using abstraction");
           } 
        };
        m.display();
    }
}
abstract class Messages
{
   abstract void display();
}
abstract class Message extends Messages {
}
public class App {
    public static void main(String[] args) {
        Message m=new Message() {
           void display()
           {
            System.out.println("Anonymous inner class using abstraction");
           } 
        };
        m.display();
    }
}

abstract class Message {
    abstract void display();
}
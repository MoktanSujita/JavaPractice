public class App {
    public static void main(String[] args) {
        Messages msg=new Messages() {
            public void displays()
            {
                System.out.println("Good evening");
            }
        };
        msg.displays();
    }
    
    
}
interface Messages {

public void displays();
}

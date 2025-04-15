import java.util.Iterator;
import java.util.*;
public class App {
 public static void main(String[] args) {
     ArrayList<String> list=new ArrayList<String>();
     list.add("Apple");
     list.add("Mango");
     Iterator<String> itr=list.iterator();
     while(itr.hasNext())
     {
         System.out.println(itr.next());
        }
    }
}
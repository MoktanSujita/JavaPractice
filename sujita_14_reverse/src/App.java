public class App {
    public static void main(String[] args) throws Exception {
        String str="java";
        int i=str.length();
        while (i>0)
         {
            System.out.println(str.charAt(i-1));
            i--;          
        }
    }
}

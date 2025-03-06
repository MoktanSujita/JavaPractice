public class App {
    public static void main(String[] args) throws Exception {
        String str="common";
        String rstr="";
        int i=str.length();
        while (i>0) {
            rstr +=str.charAt(i-1);
            i--;
        }
        if(str.equals(rstr))
        {
            System.out.println("Palinfrome!");
        }
        else
        {
            System.out.println("Not palindrome!");
        }
    }
}

public class App
{
    public static void main(String[] args) {
        String str="sujita moktan tamang";
        String[] strArr=str.split(" ");
        String result="";
        for (String s : strArr) {
            String cap="";
            for (int i = 0; i < s.length(); i++) {
                char c=s.charAt(i);
                if (i==0) 
                {
                  cap+=String.valueOf(c).toUpperCase();
                }
                else
                {
                    cap+=String.valueOf(c);
                }
                
            }
            result+=cap+"";
        }
        System.out.println(result);
    }
}
import java.util.Scanner;

public class capitalize {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter If You Want To Capitalized : ");
        String w=s.nextLine();
        StringBuffer s1 = new StringBuffer(w);
        if (s1.charAt(0)>=97&&s1.charAt(0)<=122){
            int a=(int) s1.charAt(0)-32;
            s1.setCharAt(0,(char) a);
        }
        for (int i=1;i<s1.length();i++){
            if (s1.charAt(i)==32){
                i++;
                if (s1.charAt(i)>=97&&s1.charAt(i)<=122){
                    int b=(int) s1.charAt(i)-32;
                    s1.setCharAt(i,(char) b);
                }
            }
        }
        System.out.println("Capitalized : "+s1);
    }
}
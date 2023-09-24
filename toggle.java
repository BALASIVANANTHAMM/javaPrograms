import java.util.Scanner;

public class toggle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Before Toggle : ");
        String w = s.nextLine();
        StringBuffer s1 = new StringBuffer(w);
        for (int i=0;i<s1.length();i++){
            if (s1.charAt(i)>=97&&s1.charAt(i)<=122){
                int a=(int) s1.charAt(i)-32;
                s1.setCharAt(i,(char) a);
            }else if (s1.charAt(i)>=65&&s1.charAt(i)<=90){
                int b=(int) s1.charAt(i)+32;
                s1.setCharAt(i,(char) b);
            }
        }
        System.out.println("After Toggle : "+s1);
    }
}

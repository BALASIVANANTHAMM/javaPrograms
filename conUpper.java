import java.util.Scanner;

public class conUpper {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s1=s.nextLine();
        StringBuffer s2 = new StringBuffer(s1);
        for (int i=0;i<s2.length();i++){
            if (s2.charAt(i)>=97&&s2.charAt(i)<=122){
                int a = (int) s2.charAt(i)-32;
                s2.setCharAt(i,(char) a);
            }
        }
        System.out.println(s2);
    }
}

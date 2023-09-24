import java.util.Scanner;

public class countcase {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int u=0,l=0,sp=0,n=0,v=0,sy=0;
        System.out.println("Enter The String You Want To Check : ");
        String s1=s.nextLine();
        int b=s1.length();
        for (int i=0;i<s1.length();i++){
            if (s1.charAt(i)>=65 && s1.charAt(i)<=90){
                u++;
            }
            if (s1.charAt(i)>=97&&s1.charAt(i)<=122){
                l++;
            }
            if (s1.charAt(i)==32){
                sp++;
            }
            if (s1.charAt(i)>=48&&s1.charAt(i)<=57){
                n++;
            }
        }
        System.out.println("Upper : "+u);
        System.out.println("Lower : "+l);
        System.out.println("Space : "+sp);
        System.out.println("Number : "+n);
        System.out.println("Symbols : "+(b-(u+l+sp+n)));
    }
}

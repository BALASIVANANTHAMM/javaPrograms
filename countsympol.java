import java.util.Scanner;

public class countsympol {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The String Value : ");
        String s1 = s.nextLine();
        int a=0,b=0;
        for (int i = 0;i<s1.length();i++){
            if (s1.charAt(i)=='#'){
                a++;
            } else if (s1.charAt(i)=='*') {
                b++;
            }
        }
        System.out.println(a-b);
    }
}

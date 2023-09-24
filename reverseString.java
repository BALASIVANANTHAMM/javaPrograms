import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Some Words You Want to Reverse it : ");
        String s1 = s.nextLine();
        StringBuffer s2 = new StringBuffer(s1);
        StringBuffer s3 = new StringBuffer();
        System.out.println("Original String : "+s2);
        for (int i=s2.length()-1;i>=0;i--){
            s3.append(s2.charAt(i));
        }
        System.out.println("Reverse the String : "+s3);
    }
}

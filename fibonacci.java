import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=-1,b=1,c,i,lim;
        System.out.println("Enter the Limit : ");
        lim=sc.nextInt();
        for (i=1;i<=lim;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}

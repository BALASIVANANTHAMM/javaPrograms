import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,rem,result=0,val;
        System.out.println("Enter the Number You Want to Reverse it : ");
        num= sc.nextInt();
        val=num;
        while (num>0){
            rem=num%10;
            result=result*10+rem;
            num/=10;
        }
        System.out.println("The Reverse Number of "+val+ " is "+result);
    }
}

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,fact=1,num;
        System.out.println("Enter the Number : ");
        num=sc.nextInt();
        for (i=2;i<=num;i++){
            fact*=i;
        }
        System.out.println("Factorial of "+num+ " is "+fact);
    }
}

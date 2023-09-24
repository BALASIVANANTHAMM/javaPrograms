import java.util.Scanner;

public class primeornot {
    public static void main(String[] args) {
        int num,i,fact=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number You Want to Check : ");
        num = sc.nextInt();
        for (i=1;i<=num;i++){
            if (num%i==0){
                fact++;
            }
        }
        if (fact==2){
            System.out.println(num+" is a Prime Number");
        }else{
            System.out.println(num+" is Not a Prime Number");
        }
    }
}

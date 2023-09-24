import java.util.Scanner;

public class strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,rem,fact,temp,i,sum=0;
        System.out.println("Enter a Number if You Want To Check : ");
        num= sc.nextInt();
        temp=num;
        while (num>0){
            rem=num%10;
            fact=1;
            for (i=1;i<=rem;i++){
                fact*=i;
            }
            sum+=fact;
            num/=10;
        }
        if (sum==temp){
            System.out.println(temp+" is a Strong Number");
        }else {
            System.out.println(temp+" is Not a Strong Number");
        }
    }
}

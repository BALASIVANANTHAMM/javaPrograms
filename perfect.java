import java.util.Scanner;

public class perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,i,sum=0;
        System.out.println("Enter the Number if You Want to Check : ");
        num= sc.nextInt();
        for (i=1;i<num;i++){
            if (num%i==0){
                sum+=i;
            }
        }
        if (sum == num) {
            System.out.println(num+" is a Perfect Number");
        }else {
            System.out.println(num+" is Not a Perfect Number");
        }
    }
}

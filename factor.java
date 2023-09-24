import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num,i,fact=0;
        System.out.println("Enter the Number : ");
        num= sc.nextInt();
        for (i=1;i<=num;i++){
            if (num%i==0){
                System.out.println(i);
            }
        }
    }
}

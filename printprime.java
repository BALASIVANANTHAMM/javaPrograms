import java.util.Scanner;

public class printprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sL,eL,fact=0,i,j;
        System.out.println("Enter Start Value : ");
        sL=sc.nextInt();
        System.out.println("Enter End Value : ");
        eL=sc.nextInt();
        for (i=sL;i<=eL;i++){
            for (j=1;j<=i;j++){
                if (i%j==0){
                    fact++;
                }
            }
            if (fact==2){
                System.out.println(i+" is a Prime Number");
            }
            fact=0;
        }


    }
}

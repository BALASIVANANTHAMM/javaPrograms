import java.util.Scanner;

public class sumAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit,i,values,sum=0;
        float average;
        System.out.println("Enter the Limit : ");
        limit= sc.nextInt();
        System.out.println("Enter the Values : ");
        for (i=1;i<=limit;i++){
            values=sc.nextInt();
            sum+=values;
        }
        average=sum/limit;
        System.out.println("Sum of the Values is : "+sum);
        System.out.println("Average of the Values is : "+average);
    }
}

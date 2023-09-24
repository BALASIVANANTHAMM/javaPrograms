import java.util.Arrays;
import java.util.Scanner;

public class countevenandodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even=0,odd=0;
        System.out.println("Enter the Length Of Array : ");
        int limit=sc.nextInt();
        int[] a=new int[limit];
        for (int i=0;i<limit;i++){
            System.out.println("Enter the Value of Array "+i+" is : ");
            a[i] =sc.nextInt();
            if (a[i]%2==0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Number of Even No is : "+even);
        System.out.println("Number of Odd No is : "+odd);
    }
}

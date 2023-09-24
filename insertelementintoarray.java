import java.util.Arrays;
import java.util.Scanner;

public class insertelementintoarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index,value;
        int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println("Before Change : "+ Arrays.toString(a));
        System.out.println("Enter the Index to Change the Value : ");
        index= sc.nextInt();
        System.out.println("Enter the Value to Change that Index : ");
        value= sc.nextInt();
        for (int i=a.length-1;i>index;i--){
            a[i]=a[i-1];
        }
        a[index]=value;
        System.out.println("After Insert the Value : "+Arrays.toString(a));
    }
}

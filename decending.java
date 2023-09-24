import java.util.Arrays;
import java.util.Scanner;

public class decending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        int[] a ={8,2,4,9,1,23,3};
        System.out.println("Before Change : "+ Arrays.toString(a));
        for (int i=0;i<a.length;i++){
            for (int j=i;j<a.length;j++){
                if (a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("After Change Descending Order: "+ Arrays.toString(a));
    }
}

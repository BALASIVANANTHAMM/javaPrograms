import java.util.Arrays;
import java.util.Scanner;

public class accending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Count Of Array : ");
        int count= sc.nextInt();
        int temp;
        int[] a =new int[count];
//        System.out.println("Before Change : "+ Arrays.toString(a));
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Before Change : "+ Arrays.toString(a));
        for (int i=0;i<a.length;i++){
            for (int j=i;j<a.length;j++){
                if (a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("After Change Accending Order: "+ Arrays.toString(a));
    }
}

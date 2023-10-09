import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class putlastEmpty {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Count : ");
        int v=s.nextInt();
        System.out.println("Enter the Value of Arrays : ");
        int i,j,z;
        int[] arr = new int[v];
        for (i=0;i<v;i++){
            arr[i]=s.nextInt();
        }
        int c=0;
        for (i=0;i<v;i++){
            if (arr[i]!=0) {
                arr[c++] = arr[i];
            }
        }
        for (i=c;i<v;i++){
            arr[i]=0;
        }
        for (int a:arr){
            System.out.print(a+" ");
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Matches Of Team A : ");
        int m = sc.nextInt();
        int a[]=new int[m];
        for (int i = 0; i < m; i++){
            System.out.print(i+1 + ". ");
            a[i]=sc.nextInt();
        }
        System.out.print("Enter the Matches Of Team B : ");
        int n = sc.nextInt();
        int b[]=new int[n];
        for (int i = 0; i < n; i++){
            System.out.print(i+1 + ". ");
            b[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int count = 0;
        for (int i = 0; i < n; i++){
            count = 0;
            for (int j = 0; j < m; j++){
                if (a[j]<=b[i]){
                    count++;
                }else
                    break;
            }
            System.out.println();
            System.out.print(count+" ");
        }


    }
}

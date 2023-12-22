import java.util.Arrays;
import java.util.Scanner;

public class internalVarsity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows : ");
        int noR = sc.nextInt();
        System.out.print("Columns : ");
        int noC = sc.nextInt();
        for (int i = 0; i < noR; i++){
            if (i == 0 || i == noR-1){
                for (int j = 0; j < noC; j++){
                    System.out.print(3);
                }
            }else {
                for (int j = 0; j < noC; j++){
                    if (j == 0 || j == noC-1){
                        System.out.print(3);
                    }else {
                        System.out.print(i);
                    }
                }
            }
            System.out.println();
        }
    }
}

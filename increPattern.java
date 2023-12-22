import java.util.Scanner;

public class increPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows : ");
        int noR = sc.nextInt();
        System.out.print("Columns : ");
        int noC = sc.nextInt();
        for (int i = 1; i <= noR; i++){
            for (int j = 0; j <= noC; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

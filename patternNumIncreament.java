import java.util.Scanner;

public class patternNumIncreament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no_of_rows = sc.nextInt();
        int count = 0;
            for (int i = 0; i < no_of_rows; i++) {
                for (int j = 0; j < no_of_rows; j++) {
                    if (j==no_of_rows-1){
                        System.out.print(++count);
                    }else {
                        System.out.print(++count+"*");
                    }
                }
                System.out.println();
            }
    }
}

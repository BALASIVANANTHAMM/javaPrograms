import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Table you want? : ");
        int in = sc.nextInt();
        for (int i=1; i<=10;i++){
            System.out.println(in+" * "+i+" = "+in*i);
        }
    }
}

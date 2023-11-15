import java.util.Scanner;

public class findage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Present Year : ");
        int present = sc.nextInt();
        System.out.print("Enter Born Year : ");
        int born = sc.nextInt();
        int age = present-born;
        System.out.print("Your Age is : "+age);

    }
}

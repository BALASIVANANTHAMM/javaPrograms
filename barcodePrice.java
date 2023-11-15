import java.util.Scanner;

public class barcodePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Scan Your Code : ");
        int barCodeNum=sc.nextInt();
        int res=1;
        while (barCodeNum>0){
            res*=barCodeNum%10;
            barCodeNum=barCodeNum/10;
        }
        System.out.println("Your Price Is : "+res);
    }
}

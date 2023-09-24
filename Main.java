import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h=1;
        while (h>0){
            System.out.println("   1.Decimal to Binary");
            System.out.println("   2.Binary to Decimal");
            System.out.println("   3.Binary to Octal");
            System.out.println("   4.Octal to Binary");
            System.out.print("Enter Your Choice Here : ");
            int ch=s.nextInt();
            switch (ch){
                case 1:
                    System.out.print("Enter the Decimal Value to Binary : ");
                    int v1=s.nextInt();
                    deci2bin(v1);
                    h--;
                    break;
                case 2:
                    System.out.print("Enter the Binary Value to Decimal : ");
                    int v2=s.nextInt();
                    bin2deci(v2);
                    h--;
                    break;
                case 3:
                    System.out.print("Enter the Binary Value to Octal : ");
                    int v3=s.nextInt();
                    bin2oct(v3);
                    h--;
                    break;
                case 4:
                    System.out.print("Enter the Octal Value to Binary : ");
                    int v4=s.nextInt();
                    oct2bin(v4);
                    h--;
                    break;
                default:
                    System.out.println("!---------------------Invalid Input-------------------!");
                    break;
            }
        }

    }

    private static void oct2bin(int v4) {
        int dv=0,pw=0,rem;
        while (v4!=0){
            rem=v4%8;
            dv+=rem*Math.pow(8,pw);
            v4=v4/10;
            pw++;
        }
        int i=0;
        int [] a=new int[1000];
        while (dv>0){
            a[i]=dv%2;
            dv=dv/2;
            i++;
        }
        System.out.print("Binary Value : ");
        for (int j=i;j>=0;j--){
            System.out.print(a[j]);
        }
    }

    private static void bin2oct(int v3) {
        int dv=0,pw=0,rem;
        while (v3!=0){
            rem=v3%2;
            dv+=rem*Math.pow(2,pw);
            v3=v3/10;
            pw++;
        }
        int i=0;
        int [] a=new int[1000];
        while (dv>0){
            a[i]=dv%8;
            dv=dv/8;
            i++;
        }
        System.out.print("Octal Value : ");

        for (int j=i-1;j>=0;j--){
            System.out.print(a[j]);
        }
    }

    private static void bin2deci(int v2) {
        int dv=0,pw=0,rem;
        while (v2!=0){
            rem=v2%2;
            dv+=rem*Math.pow(2,pw);
            v2=v2/10;
            pw++;
        }
        System.out.print("Decimal Value is : "+dv);
    }

    public static void deci2bin(int v1){
        int i=0;
        int [] a=new int[1000];
        while (v1>0){
            a[i]=v1%2;
            v1=v1/2;
            i++;
        }
        System.out.print("Binary Value : ");

        for (int j=i-1;j>=0;j--){
            System.out.print(a[j]);
        }
    }
}
import java.util.Scanner;

public class AmanProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ASCII Value Numbers : ");
        String inp = sc.nextLine();
        String st = "";
        String re = "";
        char ar[] = inp.toCharArray();

        for (int i = ar.length-1; i >0 ; i-=2){
            st = "";
            st = ""+ar[i]+ar[i-1];
            int as = Integer.parseInt(st);

            if (as == 32){
                re+=" ";
            } else if ((as >= 65 && as <= 90) || (as >= 97 && as <= 99)) {
                re+=Character.toString(as);
            }else {
                if (i-2<0) break;
                st += ar[i-2];
                as = Integer.parseInt(st);
                re+=Character.toString(as);
                i--;
            }
        }
        System.out.println(re);
    }
}

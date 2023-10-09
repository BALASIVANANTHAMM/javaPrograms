import java.util.Scanner;

public class vehicalcom {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Vehicle Count : ");
        int v=s.nextInt();
        System.out.println();
        System.out.print("Enter the Wheels Count : ");
        int w= s.nextInt();
        System.out.println();
        float res= (float) ((4 * v) - w)/2 ;  // 8-6=2  2/2=1 tw=1  v-res = fw;
        if (w>=2&&w%2==0&&w>v){
            System.out.println("TW : "+(int)(res)+" FW : "+(int)(v-res));
        }else {
            System.out.println("INVALID INPUT");
        }
    }
}

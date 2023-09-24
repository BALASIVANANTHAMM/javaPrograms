import java.util.Arrays;

public class duplicatevalue {
    public static void main(String[] args) {
        int [] a = {1,2,6,2,7,8,9,6,5,5};
        System.out.println("Before Change : "+ Arrays.toString(a));
        for (int i = 0;i<a.length;i++){
            for (int j = i;j<a.length;j++){
                if (a[i]==a[j] && i!=j){
                    System.out.println("Duplicate values is : "+a[j]);
                }
            }
        }
    }
}
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num,temp,rem,digits=0,result = 0;
        System.out.println("Enter Three digit Number : ");
        num =sc.nextInt();
        temp=num;
        while(temp>0)
        {
        temp = temp/10;   
        digits++;
        }
        temp=num;
        while (temp>0){
            rem=temp%10;
            result+= (int) Math.pow(rem,digits);
            temp/=10;
        }
        if (result==num){
            System.out.println(num+" is an Armstrong Number");
        }else {
            System.out.println(num+" is Not an Armstrong Number");
        }
    }
}

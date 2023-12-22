import java.util.Scanner;

public class carrental {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baseHour = 2000;
        int amount = 0;
        System.out.print("Distance : ");
        int distance = sc.nextInt();
        System.out.print("Hour : ");
        int hour = sc.nextInt();

        if (distance == 0 || hour == 0){
            System.out.println("Invalid Input");
        }else {
            if (distance < 240 && hour < 6){
                amount+=baseHour;
                System.out.println("Amount : "+ amount);
            } else if (distance > 240 && hour < 6) {
                int balDist = distance-240;
                int amt = balDist*100+baseHour;
                System.out.println("Amount : "+amt);
            } else if (distance < 240 && hour > 6) {
                int balHour = hour-6;
                int val = baseHour+balHour*20;
                System.out.println("Amount : "+val);
            }else if (distance > 240 && hour > 6){
                int balDist = distance-240;
                int amt = balDist*100+baseHour;
                System.out.println("Amount : "+amt);
            }
        }

    }
}

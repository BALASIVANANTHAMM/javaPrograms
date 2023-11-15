import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class findbornyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Your Age : ");
//        int age = sc.nextInt();
//        int year =  -age;
//        System.out.print("Your Born Year is : "+year);
        System.out.print("Enter your DOB YYYY-MM-DD format : ");
        String inDate= sc.nextLine();
        sc.close();
        LocalDate dob = LocalDate.parse(inDate);
        LocalDate cur = LocalDate.now();
        Period period = Period.between(dob,cur);
        System.out.printf("Your age is %d years %d months and %d days.", period.getYears(), period.getMonths(), period.getDays());
    }
}

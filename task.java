import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int log = sc.nextInt();

        if (log != 0){
            System.out.println("Orders >>> ");
            System.out.println("1. Book");
            System.out.println("2. Speaker");
            System.out.println("3. Laptop");
            System.out.println("4. Bag");
            System.out.println("5. Exit");
            while (sc.hasNext()){
                int option = sc.nextInt();
                if (option == 1) {
                    System.out.print("Quantity : ");
                    int quantity = sc.nextInt();
                    System.out.println("Orders >>> ");
                    System.out.println("Book Ordered " + quantity);
                    System.out.println("2. Speaker");
                    System.out.println("3. Laptop");
                    System.out.println("4. Bag");
                    System.out.println("5. Exit");
                    option = sc.nextInt();
                    if (option == 2) {
                        System.out.print("Quantity : ");
                        quantity = sc.nextInt();
                        System.out.println("Orders >>> ");
                        System.out.println("Book Ordered " + quantity);
                        System.out.println("Speaker Ordered " + quantity);
                        System.out.println("3. Laptop");
                        System.out.println("4. Bag");
                        System.out.println("5. Exit");
                        option = sc.nextInt();
                        if (option == 3){
                            System.out.print("Quantity : ");
                            quantity = sc.nextInt();
                            System.out.println("Orders >>> ");
                            System.out.println("Book Ordered " + quantity);
                            System.out.println("Speaker Ordered " + quantity);
                            System.out.println("Laptop Ordered " + quantity);
                            System.out.println("4. Bag");
                            System.out.println("5. Exit");
                            option = sc.nextInt();
                            if (option == 4){
                                System.out.print("Quantity : ");
                                quantity = sc.nextInt();
                                System.out.println("Orders >>> ");
                                System.out.println("Book Ordered " + quantity);
                                System.out.println("Speaker Ordered " + quantity);
                                System.out.println("Laptop Ordered " + quantity);
                                System.out.println("Bag Ordered " + quantity);
                                System.out.println("5. Exit");
                                option = sc.nextInt();
                                if (option == 5){
                                    System.out.println("Finished Bye ... ");
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
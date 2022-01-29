import java.util.Scanner;
/**
 * This class provides code as the Main Class of our FastFoodKitchen
 *
 * ITSC 1213 Module 2 Lab
 *
 * @author Jacob Smith
 * @version Spring 22
 *
 */
public class Main {
    public static void main(String[] args) {
        /*
        // Part A
        BurgerOrder order1 = new BurgerOrder(3,5,4, 10, false, 1);
        BurgerOrder order2 = new BurgerOrder(0,0,3,3,true,2);
        BurgerOrder order3 = new BurgerOrder(1,1,0,2,false,3);

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);

        // Part A Test Code
        order1.setSodas(12);
        System.out.println(order1);

         */
        FastFoodKitchen2 kitchen = new FastFoodKitchen2();
        Scanner sc = new Scanner(System.in);

        while (kitchen.getNumOrdersPending() != 0) {
            // see what the user wants to do
            System.out.println("Please select from the following menu of options, by typing a number:");
            System.out.println("\t 1. Order food");
            System.out.println("\t 2. Cancel last order");
            System.out.println("\t 3. Show number of orders currently pending.");
            System.out.println("\t 4. Check if your order is completed or not.");
            System.out.println("\t 5. Cancel an order");
            System.out.println("\t 6. Exit");

            int num = sc.nextInt();
            switch (num) {

                case 1:
                    System.out.println("How many hamburgers do you want?");
                    int ham = sc.nextInt();
                    System.out.println("How many cheeseburgers do you want?");
                    int cheese = sc.nextInt();
                    System.out.println("How many veggieburgers do you want?");
                    int veggie = sc.nextInt();
                    System.out.println("How many sodas do you want?");
                    int sodas = sc.nextInt();
                    System.out.println("Is your order to go? (Y/N)");
                    char letter = sc.next().charAt(0);
                    boolean TOGO = false;
                    if (letter == 'Y' || letter == 'y') {
                        TOGO = true;
                    }
                    int orderNum = kitchen.addOrder(ham, cheese, veggie, sodas, TOGO);
                    System.out.println("Thank-you. Your order number is " + orderNum);
                    System.out.println();
                    break;
                case 2:
                    boolean ready = kitchen.cancelLastOrder();
                    if (ready) {
                        System.out.println("Thank you. The last order has been canceled");
                    } else {
                        System.out.println("Sorry. There are no orders to cancel.");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("There are " + kitchen.getNumOrdersPending() + " pending orders");
                    break;
                case 4:
                    System.out.println("Please enter the number of the order you would like to check: ");
                    int check = sc.nextInt();
                    if (kitchen.isOrderDone(check) == 1){
                        System.out.println("Your order has been completed.");
                    }
                    else if (kitchen.isOrderDone(check) == 0){
                        System.out.println("Your order is still in progress");
                    }
                    else if (kitchen.isOrderDone(check) == -99){
                        System.out.println("Sorry, we cannot find your order in our system.");
                    }
                    break;
                case 5:
                    System.out.println("Please enter the order number of the order to cancel: ");
                    int cancel = sc.nextInt();
                    if (!kitchen.cancelOrder(cancel)){
                        System.out.println("Your order has been successfully cancelled.");
                    }
                    else {
                        System.out.println("Sorry, we can't find your order number in the system.");
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Sorry, but you need to enter a 1, 2, 3 or a 4");

            }

        } // end while loop




    }
}

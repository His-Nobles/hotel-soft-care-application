import javax.swing.*;
import java.util.Random;
import java.util.Scanner;
import java.util.Calendar;

public class Main {
    public static void Services(){
        System.out.println("  1. Book a room");
        System.out.println("  2. Book a meeting table");
        System.out.println("  3. Book a date table");
        System.out.println("  4. Order food  ");
        System.out.println("  5. Order drink");
    }
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        WelcomePageQuest();
         Services();

        int input = 0;

        String input1 = scanner.nextLine();

        try {
            input = Integer.parseInt(input1);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Enter a number");
        }

        switch (input) {
            case 1:
                roomBooking(scanner, new Random());
                break;
            case 2:
                MeetingTables(scanner);
                break;
            case 3:
                DatePage(scanner);

                break;
            case 4:
                foodNow(scanner);
                break;

            case 5:
                drinkNow(scanner);
                break;
        }

    }

    private static void WelcomePageQuest() {
           Calendar calendar = Calendar.getInstance();

        System.out.println(
                "        ||=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+||  \n " +
                "       || "+"" +calendar.getTime() + "-->"+calendar.getMinimalDaysInFirstWeek()+" hello"+" ||  \n " +
                "       ||       WELCOME TO LEGACY HOTEL!         ||  \n " +
                "       ||        YOUR HOTEL OF CHOICE            ||  \n " +
                "       ||     SERVING YOU IS OUR PLEASURE        ||  \n " +
                "       ||+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=||  \n ");
        System.out.println(     "_____what service would you like today?_____     ");

    }


    public static void roomBooking(Scanner scanner, Random random) {
        while (true) {
            System.out.println("Would you like to:");
            System.out.println("1. Book a random room ");
            System.out.println("2. Book according to floor number");

            int userChoice = scanner.nextInt();
            scanner.nextLine();
            switch (userChoice) {
                case 1:
                    int room = random.nextInt(60) + 1;
                    int floor = random.nextInt(4) + 1;
                    System.out.println("you have been awarded room " + room + " on floor " + floor + " enjOy your stay!");
                    System.out.println("would you like to oder food or a drink?, reply with yes or no to exit");
                    String decision = scanner.nextLine();
                    if (decision.equals("yes")) {
                        System.out.println("Please reply with 1 or 2 for food or drink");
                        System.out.println("1. food ");
                        System.out.println("2. drink ");
                        int fody = scanner.nextInt();
                        switch (fody) {
                            case 1:
                                foodNow(scanner);
                                break;
                            case 2:
                                drinkNow(scanner);
                                break;
                        }
                    } else if (decision.equals("no")) {
                        System.out.println("We hope you enjoyed 0ur service! THANK YOU!!");
                        return;
                    } else {
                        System.out.println("Enter either yes or no!");
                    }


                case 2:
                    System.out.println("Enter the floor you would like to stay");
                    int flor = scanner.nextInt();
                    scanner.nextLine();
                    if (flor > 4) {
                        System.out.println("floor range fom 1-4, try again");
                        continue;
                    }
                    int radroom = random.nextInt(20) + 1;
                    System.out.println("You chose floor " + flor + " you will take room number " + radroom + ", Enjoy yourself");
                    System.out.println("Would you like to order food or drink, reply with yes or no to quit");

                    String decition = scanner.nextLine();
                    if (decition.equals("yes")) {
                        System.out.println("Please reply with 1 or 2 for food or drink");
                        System.out.println("1. food ");
                        System.out.println("2. drink ");
                        int fody = scanner.nextInt();
                        switch (fody) {
                            case 1:
                                foodNow(scanner);
                                break;
                            case 2:
                                drinkNow(scanner);
                                break;
                        }
                    } else if (decition.equals("no")) {
                        return;
                    } else {
                        System.out.println("Enter either yes or no!");
                    }


            }
            return;
        }

    }
private static boolean shouldCallSecondMethod = false;
    public static void foodNow(Scanner scanner) {
        System.out.println("Select from your favourite dish below:");
        System.out.println("1. Filet Mignon");
        System.out.println("2. Lobster Thermidor");
        System.out.println("3. truffle Risotto");
        System.out.println("4. Seared Foie Gras");
        System.out.println("5. Suchi and Sachini Platter");
        System.out.println("6. Duck a I'Orange");
        System.out.println("7. Caviar and Blini");
        System.out.println("8. Creme Brulee");
        System.out.println("9. Peking Duck");
        System.out.println("9. ChateauBrand Steak");
        shouldCallSecondMethod = true;

        while(true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("You odered Filet Mignon, Filet will be served to you a long with soft pineapple");
                    System.out.println("Thank you for choosing us!!!");
                    break;
                case 2:
                    System.out.println("You ordered Lobster Thermidor, Lobster will be served along with soft pineapple");
                    System.out.println("Thank you for choosing us!!!");
                    break;
                case 3:
                    System.out.println("You ordered Truffle Risotto, Truffle will be served along with soft pineapple");
                    System.out.println("Thank you for choosing us!!!");
                    break;
                case 4:
                    System.out.println("You ordered  Seared foie Gras, Seared will be served along with soft pineapple");
                    System.out.println("Thank you for choosing us!!!");
                    break;
                case 5:
                    System.out.println("You ordered  Suchi and sachini platter, Suchi will be served along with soft pineapple");
                    System.out.println("Thank you for choosing us!!!");
                    break;
                case 6:
                    System.out.println("You ordered  Duck a I'Orange, Duck will be served along with soft pineapple");
                    System.out.println("Thank you for choosing us!!!");
                    break;
                case 7:
                    System.out.println("You ordered  Calviar and blini, calvier will be served along with soft pineapple");
                    System.out.println("Thank you for choosing us!!!");
                    break;
                case 8:
                    System.out.println("You ordered  Creme brulee, creme will be served along with soft pineapple");
                    System.out.println("Thank you for choosing us!!!");
                    break;
                case 9:
                    System.out.println("You ordered  peking duck, peking will be served along with soft pineapple");
                    System.out.println("Thank you for choosing us!!!");
                    break;
                case 10:
                    System.out.println("You ordered  ChateauBrand steak, steak will be served along with soft pineapple");
                    System.out.println("Thank you for choosing us!!!");
                    break;

            }
            return;
        }

    }

    public static void drinkNow(Scanner scanner) {
        System.out.println("Choose from your favorite drinks below");
        System.out.println("1. CocTails ");
        System.out.println("2. Wines");
        System.out.println("3. Beers");
        while (true){
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("choose a cocktail");
                    System.out.println("1. Martini");
                    System.out.println("2. Mojito");
                    System.out.println("3. Margarita");
                    while(true) {
                        int drink = scanner.nextInt();
                        switch (drink) {
                            case 1:
                                System.out.println("you will be served with Martini soon");
                                break;
                            case 2:
                                System.out.println("mojito is a great choice, you will be served soon");
                                break;
                            case 3:
                                System.out.println("Margarita is about to be served, Thank you!!!");
                                break;
                        }
                        return;
                    }
                case 2:
                    System.out.println("choose from your favourite wine here");
                    System.out.println("1. Cabernet Sauvignon");
                    System.out.println("2. Chardony ");
                    System.out.println("3. pinot Noir");
                    while(true){
                        int choic = scanner.nextInt();
                        switch (choic){
                            case 1:
                                System.out.println("Cabernet sauvignon is a great choice, thank you");
                                break;
                            case 2:
                                System.out.println("Chardony is coming to you soon. Thank you!!");
                                break;
                            case 3:
                                System.out.println("pinot Noir is an american drink. Appreciate you choice!");
                                break;
                        }
                        return;
                    }
                case 3:
                    System.out.println("Choose a bear below");
                    System.out.println("1. Lager");
                    System.out.println("2. Pale ale");
                    System.out.println("3. Wheat Beer");
                    while (true){
                        int choic = scanner.nextInt();
                        switch (choic){
                            case 1:
                                System.out.println("Lager is a great beer, Congratulations for choosing lager");
                                break;
                            case 2:
                                System.out.println("Thank you for choosing pale ale, will e served to you soom");
                                break;
                            case 3:
                                System.out.println("Wheat beer is a rare Beer, you are a legendary nigga");
                                break;
                        }
                        return;
                    }

            }
        }
    }

    public static void MeetingTables(Scanner scanner) {
        System.out.println("Which type of meeting");
        System.out.println("1. Business class('5-20 members in a closed private room')");
        System.out.println("2. Economy class('8-40 members in an open field') ");
        System.out.println("3. Community ceremony('A tent(s) and chairs in an open field')");
        while (true) {
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Congratulation for booking a private room for (5-20) members, it will cost you Ksh.3,000 for every hour \n" +
                            "spent,          your service is our pleassure | what would you like us to serve you on the table?");
                    System.out.println("1. Food ");
                    System.out.println("2. Drinks ");
                    System.out.println("3. Food and Drinks");
                    System.out.println("4. Nothing we are fine");
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            foodNow(scanner);
                            break;
                        case 2:
                            drinkNow(scanner);
                            break;
                        case 3:
                            foodNow(scanner);
                            if (shouldCallSecondMethod) {
                                drinkNow(scanner);
                            }
                            break;
                        case 4:
                            return;

                    }
                case 2:
                    System.out.println("You booked an economy table");
                    System.out.println("    Costs 100 per hour");
                    System.out.println(" THANKING FOR CHOSING US");
                    break;
                case 3:
                    System.out.println("CEREMONY TENT BOOKED! THANK YOU");
                    break;
            }
       return;
        }
    }
    public static void DatePage(Scanner scanner){
        System.out.println("Would you like your table for two:");
        System.out.println("1. A clean table  ");
        System.out.println("2. Decorated with roses and drinks");
        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("BOOKED SUCCESSFULLY! CONGRATULATION FOR YOUR DATE");
                    System.out.println("This will cost Ksh.1000 per hour spent");

                    return;

                case 2:
                    System.out.println("BOOKED SUCCESSFUL! YOUR TABLE WILL BE DECORATED WITH ROSES ");
                    System.out.println("would you like to choose a drink or get a random drink? reply with 1 for order yoursel or 2 for random");
                    while (true) {
                        int intake = scanner.nextInt();
                        switch (intake) {
                            case 1:
                                drinkNow(scanner);
                                break;
                            case 2:
                                System.out.println("Your table will be decorated with Martini, Martini is a super sweet american cocktails drink usually served for couples");
                                System.out.println("Thank you for choosing us, Goodbye! see you on your date");
                                return;
                        }
                        return;
                    }
            }
       }
    }
}
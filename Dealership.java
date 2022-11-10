import java.util.Scanner;

public class Dealership {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Java dealership!");
        System.out.println(" - Select option 'a' to buy a car");
        System.out.println(" - Select option 'b' to sell a car");
        String option = scan.nextLine();

        switch (option) {
            case "a":

                System.out.println("What is your budget?");
                int budget = scan.nextInt();
                if (budget >= 10000) {
                    System.out.println("Greaat! A Nissan Altima is available");

                    System.out.println("\nDo you have an insurance? Write 'yes' or 'no'");
                    scan.nextLine();
                    String insurance = scan.nextLine();
                    System.out.println("\nDo you have DL? 'yes' or 'no'");
                    String driverLisence = scan.nextLine();
                    System.out.println("\n What is your credit score?");
                    int creditScore = scan.nextInt();

                    if (insurance.equals("yes") && driverLisence.equals("yes") && creditScore >= 500){
                        System.out.println("Come to pick up your car!");
                        } else {
                                System.out.println("Sorry, you need a high credit score, insurance and DL to buy a car");
                            }

                } else {
                    System.out.println("Sorry, we don't sell carrs cheaper than $10,000");
                }
                break;

            case "b":
                System.out.println("What is the value of your car?");
                int value = scan.nextInt();
                System.out.println("What is your selling price?");
                int price = scan.nextInt();
                if (value > price && price < 30000){
                    System.out.println("We will buy your car!");
                } else {
                    System.out.println("Sorry, we're not interested");
                }
                break;
            default: System.out.println("Invalid");
        }
        scan.close();
    }
}



//import java.util.Scanner;
//
//public class Dealership {
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Welcome to the Java dealership!");
//        System.out.println(" - Select option 'a' to buy a car");
//        System.out.println(" - Select option 'b' to sell a car");
//        String option = scan.nextLine();
//
//        switch (option) {
//            case "a":
//
//                System.out.println("What is your budget?");
//                int budget = scan.nextInt();
//                if (budget >= 10000) {
//                    System.out.println("Greaat! A Nissan Altima is available");
//
//                    System.out.println("\nDo you have an insurance? Write 'yes' or 'no'");
//                    scan.nextLine();
//                    String insurance = scan.nextLine();
//                    if (insurance.equals("yes")){
//                        System.out.println("\nDo you have DL? 'yes' or 'no'");
//                        String driverLisence = scan.nextLine();
//                        if (driverLisence.equals("yes")){
//                            System.out.println("\n What is your credit score?");
//                            int creditScore = scan.nextInt();
//                            if (creditScore >= 500) {
//                                System.out.println("Come to pick up your car!");
//                            } else {
//                                System.out.println("Sorry, you need a higher credit score");
//                            }
//
//                    } else {
//                            System.out.println("Sorry, you need DL");
//                        }
//                    } else {
//                        System.out.println("Sorry, you need an insurance");
//                    }
//
//
//                } else {
//                    System.out.println("Sorry, we don't sell carrs cheaper than $10,000");
//                }
//            break;
//
//            case "b": System.out.println("You chose option " + option); break;
//            default: System.out.println("Invalid");
//        }
//        scan.close();
//    }
//}

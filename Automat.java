import java.lang.reflect.Array;
import java.rmi.server.ExportException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Automat {

    public static void main(String[] args) throws InterruptedException {


        try {

        int num_of_tickets;
        num_of_tickets = 0;
        Payedmoney = 0;

        

        while (true) {

            // scanner
            Scanner input = new Scanner(System.in);
            String choosen_ticket;
            String traincard;
            Integer age;
            Double inserted_coins;
            Double Payedmoney;
            Double result;
            List < String > avalible_buying_options = new ArrayList < String > ();
            avalible_buying_options.add("a");
            avalible_buying_options.add("b");
            avalible_buying_options.add("b");


            List < Double > possible_coins = new ArrayList <Double> ();
            possible_coins.add(0.01);
            possible_coins.add(0.02);
            possible_coins.add(0.05);
            possible_coins.add(0.10);
            possible_coins.add(0.20);
            possible_coins.add(0.50);
            possible_coins.add(1.0);
            possible_coins.add(2.0);


            // tickets
            System.out.println("welcome to the ticket machine");
            System.out.println("we have 3 different options");
            System.out.println("Zone A: 2,50 €");
            System.out.println("Zone B: 3,70 €");
            System.out.println("Zone C: 5,20 €");
            System.out.println("which ticket would you like to buy? a | b | c");
            choosen_ticket = input.nextLine();

            if (avalible_buying_options.contains(choosen_ticket)) {

                // number of tickets
                System.out.println("how many tickets would you like to buy");
                num_of_tickets += input.nextInt();

                if (num_of_tickets <= 0) {
                    System.out.println("you have to buy at least 1 ticket");
                }

                System.out.println("do you have a train card y/n");
                traincard = input.next();

                System.out.println("how old are you: ");
                age = input.nextInt();

                switch (choosen_ticket) {

                    case "a":

                        if (traincard.equals("y")) {
                            result = (2.50 * (num_of_tickets - (0.2 * num_of_tickets)));

                            if (age < 18) {
                                System.out.println("you have to pay " + (result * 0.5) + "€");
                            }

                            else {
                                System.out.println("you have to pay " + result + "€");
                            }
                        }
                        else {
                            result = (2.50 * num_of_tickets);

                            if (age < 18) {
                                System.out.println("you have to pay " + (result * 0.5) + "€");
                            }

                            else {
                                System.out.println("you have to pay " + result + "€");
                            }
                        }
                        break;

                    case "b":
                        if (traincard.equals("y")) {
                            result = (3.70 * (num_of_tickets - (0.2 * num_of_tickets)));

                            if (age < 18) {
                                System.out.println("you have to pay " + (result * 0.5) + "€");
                            }

                            else {
                                System.out.println("you have to pay " + result + "€");
                            }
                        }
                        else {
                            result = (3.70 * num_of_tickets);

                            if (age < 18) {
                                System.out.println("you have to pay " + (result * 0.5) + "€");
                            }

                            else {
                                System.out.println("you have to pay " + result + "€");
                            }
                        }
                        break;

                    case "c":
                        if (traincard.equals("y")) {
                            result = (5.20 * (num_of_tickets - (0.2 * num_of_tickets)));

                            if (age < 18) {
                                System.out.println("you have to pay " + (result * 0.5) + "€");
                            }

                            else {
                                System.out.println("you have to pay " + result + "€");
                            }
                        }
                        else {
                            result = (5.20 * num_of_tickets);

                            if (age < 18) {
                                System.out.println("you have to pay " + (result * 0.5) + "€");
                            }

                            else {
                                System.out.println("you have to pay " + result + "€");
                            }
                        }

                        break;

                        
                    }

                }

            while (payedmoney < result) {

            System.out.print("please insert coins (0.01, 0.02, 0.05, 0.10, 0.20, 0.50, 1, 2): ");
            inserted_coins = input.nextDouble();

                if (possible_coins.contains(inserted_coins)) {
                    
                }

            }
                System.out.println("Good Bye");
            



            num_of_tickets = 0;
            Thread.sleep(4000);
        }

        } catch (Exception e) {
            System.out.println("something went wrong... \n please retry again");
        }
    }
}
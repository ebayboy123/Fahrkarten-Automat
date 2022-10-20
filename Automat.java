import java.util.Scanner;

public class Automat {

    public static void main(String[] args) throws InterruptedException {

        int num_of_tickets;
        num_of_tickets = 0;

        while (true) {

            // scanner
            Scanner input = new Scanner(System.in);
            String choosen_ticket;
            String traincard;
            Integer age;
            Double result;

            // tickets
            System.out.println("welcome to the ticket machine");
            System.out.println("we have 3 different options");
            System.out.println("Zone A: 2,50 €");
            System.out.println("Zone B: 3,70 €");
            System.out.println("Zone C: 5,20 €");
            System.out.println("which ticket would you like to buy? a | b | c");
            choosen_ticket = input.nextLine();

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
            System.out.println("Good Bye");
            num_of_tickets = 0;
            Thread.sleep(4000);
        }
    }
}
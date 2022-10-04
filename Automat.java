import java.util.Scanner;

public class Automat {

    public static void main(String[] args) {

        // scanner
        Scanner input = new Scanner(System.in);
        String choosen_ticket;
        String more_tickets;
        int ticket_loop;
        int num_of_tickets;

        ticket_loop = 0;

        // tickets
        options: System.out.println("welcome to the ticket machine");
        System.out.println("we have 3 different options");
        System.out.println("Zone A: 2,50 €");
        System.out.println("Zone B: 3,70 €");
        System.out.println("Zone C: 5,20 €");
        System.out.println("which ticket would you like to buy? a | b | c");
        choosen_ticket = input.nextLine();

        // number of tickets
        System.out.println("how many tickets would you like to buy");
        num_of_tickets = input.nextInt();

        if (num_of_tickets <= 0) {
            System.out.println("you have to buy at least 1 ticket");
        }

        System.out.println("do you want to buy more tickets y/n");
        more_tickets = input.next();

        if (more_tickets.equals("n")) {

            if (choosen_ticket.equals("a")) {
                System.out.println(
                        "You have " + num_of_tickets + " tickets. this will cost you " + (2.50 * num_of_tickets) + "€");
            }
        }
    }

}

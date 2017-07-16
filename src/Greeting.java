/**
 * Created by steeve on 7/15/17.
 */

import java.util.Scanner;

public class Greeting {

    private Event ev;
    Scanner in = new Scanner(System.in);
    private int choix;
    private int nouveauChoix;

    private String name;
    private String dateString;
    private int guestCount;


    Greeting(){

        System.out.println("\n\n\nHello! Welcome to our Catering Service");
        System.out.println("Please select an option:");
        System.out.println("1. Create an event with just an event name");
        System.out.println("2. Create an event with an event name and date");
        System.out.println("3. Create an event with an event name, date, and number of guests.");
        System.out.println("4. Quit :(");

        choix = in.nextInt();

        if (choix == 1) {

            justEventName();
        }

        if (choix == 2) {
            eventNameAndDate();
        }

        if (choix == 3) {
            nameDateAndNumGuests();
        }

        else if (choix == 4){
            System.out.println("Goodbyue! Hope to see you soon!");
            System.exit(0);
        }

        else {

            System.out.println("Sorry, invalid choice #" + choix);
            new Greeting();
        }
    }

    private void justEventName() {
        System.out.println("Please enter the name of the event:");
        name = in.next();

        ev = new Event(name);
        System.out.println(ev.toString(name));
        System.out.println();


        System.out.println("Would you like to enter another event?");
        System.out.println("(Enter 1 for \"yes\" or 0 for \"no\")");

        if(in.nextInt() == 1)
            new Greeting();
        else
            System.exit(0);
    }

    private void eventNameAndDate() {
        System.out.println("Please enter the name of the event:");
        name = in.next();

        System.out.println("Please enter the event's date in the format: MM/DD/YY");
        dateString = in.next();

        ev = new Event(name, dateString);
        System.out.println(ev.toString(name, dateString));
        System.out.println();


        System.out.println("Would you like to enter another event?");
        System.out.println("(Enter 1 for \"yes\" or 0 for \"no\")");

        if(in.nextInt() == 1)
            new Greeting();
        else
            System.exit(0);

    }
    private void nameDateAndNumGuests() {
        System.out.println("Please enter the name of the event:");
        name = in.next();

        System.out.println("Please enter the event's date in the format: MM/DD/YY");
        dateString = in.next();

        System.out.println("How many people will be there?");
        guestCount =  in.nextInt();

        ev = new Event(name, dateString, guestCount);

        ev.setTotalPrice(guestCount);
        System.out.println(ev.toString(name, dateString, guestCount));
        System.out.println();


        System.out.println("Would you like to enter another event?");
        System.out.println("(Enter 1 for \"yes\" or 0 for \"no\")");

        if(in.nextInt() == 1)
            new Greeting();
        else
            System.exit(0);


    }

}

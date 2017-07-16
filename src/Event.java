/**
 * Created by steeve on 7/15/17.
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Event {

    String eventName;

    String eventDateStr = "10/10/1010";
    Date eventDate = null;

    SimpleDateFormat shortDate = new SimpleDateFormat("MM/dd/yy");


    int numGuests = 0;
    static final double costPerPerson = 40.0;
    Character eventLetter;
    public static int eventNumber = 1;
    private double totalPrice = 0;


    Event(String eventName) {

        char indic = eventName.charAt(0);
        this.setEventName(eventName);
        this.setEventLetter(indic);
        eventNumber++;

    }

    Event(String eventName, String eventDateStr) {
        char indic = eventName.charAt(0);
        this.setEventName(eventName);
        this.setEventLetter(indic);

        this.eventDateStr = eventDateStr;
        try {
            this.eventDate = shortDate.parse(eventDateStr);
        } catch (Exception e) {
            System.out.println("Sorry bad date");

        }
        eventNumber++;
    }

    Event(String eventName, String eventDateStr, int numGuests) {
        char indic = eventName.charAt(0);
        this.setEventName(eventName);
        this.setEventLetter(indic);

        this.eventDateStr = eventDateStr;
        try {
            this.eventDate = shortDate.parse(eventDateStr);
        } catch (Exception e) {
            System.out.println("Sorry bad date");

        }
        eventNumber++;
        this.setNumGuests(numGuests);
    }

    public String toString(String eventName) {
        String res = "";

        res = "Event created!" +
                "\nEvent: " + this.eventName +
                "\nDate: TBA" +
                "\nEvent Number: " + eventLetter + String.format("%04d", eventNumber) +
                "\nNumber of guests: TBA" +
                "\nTotal cost: TBA";
        return res;
    }

    public String toString(String eventName, String eventDateStr) {
        String res = "";

        res = "Event created!" +
                "\nEvent: " + this.eventName +
                "\nDate: " + this.eventDate +
                "\nEvent Number: " + eventLetter + String.format("%04d", eventNumber) +
                "\nNumber of guests: TBA" +
                "\nTotal cost: TBA";
        return res;
    }

    public String toString(String eventName, String eventDateStr, int numGuests) {
        String res = "";
        res = "Event created!" +
                "\nEvent: " + this.eventName +
                "\nDate: " + this.eventDate +
                "\nEvent Number: " + eventLetter + String.format("%04d", eventNumber) +
                "\nNumber of guests: " + numGuests +
                "\nTotal cost: $" + this.getTotalPrice();
        return res;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }


    public int getNumGuests() {
        return numGuests;
    }

    public void setNumGuests(int numGuests) {
        this.numGuests = numGuests;
    }

    public Character getEventLetter() {
        return eventLetter;
    }

    public void setEventLetter(Character eventLetter) {
        this.eventLetter = eventLetter;
    }

    public static int getEventNumber() {
        return eventNumber;
    }

    public static void setEventNumber(int eventNumber) {
        Event.eventNumber = eventNumber;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int numGuests) {
        this.totalPrice = costPerPerson * numGuests;
    }


}

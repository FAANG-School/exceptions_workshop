package task_4;

import task_4.exceptions.SecurityBreachException;
import task_4.exceptions.UnauthorizedAccessAttemptException;

public class Main {
    public static void main(String[] args) {
        AvengersBase avengersBase = new AvengersBase();

        Hero loki = new Hero("Loki");
        Hero tony = new Hero("Tony");

        try {
            avengersBase.enterBase(tony);
            avengersBase.enterBase(loki);
        } catch (SecurityBreachException e) {
            System.out.println("Error 1: " + e.getMessage());
        }

        try {
            avengersBase.getSecretDocuments(tony, "Iron Man Suit");
            avengersBase.getSecretDocuments(loki, "Iron Man Suit");
        } catch (UnauthorizedAccessAttemptException e) {
            System.out.println("Error 2: " + e.getMessage());
        }
    }
}

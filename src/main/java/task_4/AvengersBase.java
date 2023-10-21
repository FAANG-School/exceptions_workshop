package task_4;

import task_4.exceptions.SecurityBreachException;
import task_4.exceptions.UnauthorizedAccessAttemptException;

public class AvengersBase {
    public void enterBase(Hero hero) {
        if(hero.getName().equals("Loki")) {
            throw new SecurityBreachException();
        } else {
            System.out.printf("Welcome, %s!\n", hero.getName());
        }
    }

    public String getSecretDocuments(Hero hero, String documentName) throws SecurityBreachException {
        if (hero.getName().equals("Loki")) {
            throw new UnauthorizedAccessAttemptException();
        } else {
            return documentName;
        }
    }
}

package task_4.solution;

import task_4.exception.SecurityBreachException;
import task_4.exception.UnauthorizedAccessAttemptException;

public class AvengersBase {
    // Герой пытается вотий в базу
    public void enterBase(Hero hero) throws SecurityBreachException {
        if (hero.equals("Loki")) {
            throw new SecurityBreachException("Локи пытается проникнуть на базу Мстителей!");
        }
        System.out.println(hero.getName() + "успешно проник на базу Мстителей");
    }

    // Герой пытается получить доступ к документу
    public String getSecretDocuments(Hero hero, String documentName) throws UnauthorizedAccessAttemptException {
        if (hero.getName().equals("Loki")) {
            throw new UnauthorizedAccessAttemptException("Локи пытается заполучить доступ к секретным документам!");
        }
        return ("Доступ к " + documentName + " предоставлен " + hero.getName());
    }
}

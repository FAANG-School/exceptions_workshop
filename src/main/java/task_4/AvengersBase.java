package task_4;

import javax.naming.AuthenticationException;

public class AvengersBase {
    private String secretDocument = "Secret";

    public static void main(String[] args) {
        AvengersBase avengersBase = new AvengersBase();
        Hero Loki = new Hero("Loki");
        try {
            avengersBase.enterBase(Loki);
        } catch (SecurityBreachException e) {
            e.printStackTrace();
        }
        try {
            avengersBase.getSecretDocuments(Loki, "Secret");
        } catch (UnauthorizedAccessAttemptException e) {
            e.printStackTrace();
        }
    }

    // Герой пытается вотий в базу
    public void enterBase(Hero hero) {
        if (hero.getName().equals("Loki")) {
            throw new SecurityBreachException("Loki is attacking");
        }
    }

    // Герой пытается получить доступ к документу
    public String getSecretDocuments(Hero hero, String documentName) {
        if (documentName.equals(secretDocument)) {
            throw new UnauthorizedAccessAttemptException(hero.getName() + " try to get secret document " + documentName);
        }
        return documentName;
    }
}
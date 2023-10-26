package task_4;

import lombok.extern.slf4j.Slf4j;
import task_4.exceptions.SecurityBreachException;
import task_4.exceptions.UnauthorizedAccessAttemptException;

@Slf4j
public class AvengersBase {

	public void enterBase(Hero hero) {

		if (hero == null) {
			throw new IllegalArgumentException("Null args");
		}

		log.info("Start to check hero's credentials");
		if (hero.getName().equals("Loki")) {
			log.warn("Loki here!");
			throw new SecurityBreachException("Loki try to enter!");
		}

		log.info("{} entered successful", hero.getName());

	}

	public String getSecretDocuments(Hero hero, String documentName) {

		if (hero == null || documentName == null || documentName.isBlank()) {
			throw new IllegalArgumentException("Null or blank args");
		}

		log.info("Start to check access to the document");

		if (hero.getName().equals("Loki")) {
			log.warn("Loki's access attempt to {}", documentName);
			throw new UnauthorizedAccessAttemptException("Loki try to enter!");
		}

		log.info("{} got access to {}", hero.getName(), documentName);

		return documentName;
	}
}

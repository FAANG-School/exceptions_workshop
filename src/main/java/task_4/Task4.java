package task_4;

import lombok.extern.slf4j.Slf4j;
import task_4.exceptions.SecurityBreachException;
import task_4.exceptions.UnauthorizedAccessAttemptException;

@Slf4j
public class Task4 {
	
	public static void main(String[] args) {
		
		Hero hero1 = new Hero("Loki");
		Hero hero2 = new Hero("Grut");
		Hero heroNull = null;
		
		String doc = "Secret document";
		String nullDoc = null;
		String blankDoc = " ";
		
		AvengersBase avengersBase = new AvengersBase();
		
		try {
			avengersBase.enterBase(heroNull);
		} catch (IllegalArgumentException e) {
			log.error(e.getMessage() + " during invoke enterBase()");
		}
		
		try {
			avengersBase.enterBase(hero1);
		} catch (SecurityBreachException e) {
			log.error(e.getMessage() + " during invoke enterBase()");
		}
		
		avengersBase.enterBase(hero2);
		
		
		try {
			avengersBase.getSecretDocuments(heroNull, doc);
		} catch (IllegalArgumentException e) {
			log.error(e.getMessage() + " during invoke getSecretDocuments()");
		}
		
		try {
			avengersBase.getSecretDocuments(hero1, nullDoc);
		} catch (IllegalArgumentException e) {
			log.error(e.getMessage() + " during invoke getSecretDocuments()");
		}
		
		try {
			avengersBase.getSecretDocuments(hero1, blankDoc);
		} catch (IllegalArgumentException e) {
			log.error(e.getMessage() + " during invoke getSecretDocuments()");
		}
		
		try {
			avengersBase.getSecretDocuments(hero1, doc);
		} catch (UnauthorizedAccessAttemptException e) {
			log.error(e.getMessage() + " during invoke getSecretDocuments()");
		}
		
		avengersBase.getSecretDocuments(hero2, doc);
		
	}

}

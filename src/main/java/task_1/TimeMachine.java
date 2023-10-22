package task_1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TimeMachine {

	private int currentYear;
	private boolean isWorking;

	public TimeMachine(int currentYear, boolean isWorking) {
		this.currentYear = currentYear;
		this.isWorking = isWorking;
	}

	public void traveInTime(TimeTraveler timeTraveler, int travelYear) throws TimeTravelException {

		if (!isWorking) {
			throw new TimeTravelException("Time machine is off");
		}

		if (travelYear < timeTraveler.getBirthYear()) {
			throw new TimeTravelException("Too young");
		}

		if (travelYear > timeTraveler.getDeathYear()) {
			throw new TimeTravelException("No live after death");
		}
	}

	public int getCurrentYear() {
		return currentYear;
	}

	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}

	public boolean isWorking() {
		return isWorking;
	}

	public void setWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}

	public static void main(String[] args) {

		TimeMachine timeMachine = new TimeMachine(2023, false);

		TimeTraveler traveler1 = new TimeTraveler("FirstMan", 1900, 1985);
		TimeTraveler traveler2 = new TimeTraveler("SecondMan", 1800, 1843);
		TimeTraveler traveler3 = new TimeTraveler("ThirdMan", 1941, 1997);
		TimeTraveler traveler4 = new TimeTraveler("ForthMan", 1934, 2005);
		int year1 = 1901;
		int year2 = 1935;

		try {
			log.info("Try to launch {} in year {}", traveler1, year1);
			timeMachine.traveInTime(traveler1, year1);
			log.info("Success, {} now in year {}", traveler1, year1);
		} catch (TimeTravelException e) {
			log.error("Exception during invoking traveInTime(): {}", e.getMessage());
		}
		
		timeMachine.setWorking(true);
		
		try {
			log.info("Try to launch {} in year {}", traveler2, year1);
			timeMachine.traveInTime(traveler2, year1);
			log.info("Success, {} now in year {}", traveler2, year1);
		} catch (TimeTravelException e) {
			log.error("Exception during invoking traveInTime(): {}", e.getMessage());
		}
		
		try {
			log.info("Try to launch {} in year {}", traveler3, year1);
			timeMachine.traveInTime(traveler3, year1);
			log.info("Success, {} now in year {}", traveler3, year1);
		} catch (TimeTravelException e) {
			log.error("Exception during invoking traveInTime(): {}", e.getMessage());
		}
		
		try {
			log.info("Try to launch {} in year {}", traveler4, year2);
			timeMachine.traveInTime(traveler4, year2);
			log.info("Success, {} now in year {}", traveler4, year2);
		} catch (TimeTravelException e) {
			log.error("Exception during invoking traveInTime(): {}", e.getMessage());
		}
		
	}

}

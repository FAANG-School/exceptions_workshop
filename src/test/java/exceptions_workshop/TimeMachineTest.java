package exceptions_workshop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import task_1.TimeMachine;
import task_1.TimeTravelException;
import task_1.TimeTraveler;

public class TimeMachineTest {

	private final TimeMachine timeMachine = new TimeMachine(2023, false);
	private final TimeTraveler traveler1 = new TimeTraveler("FirstMan", 1900, 1985);

	@Test
	void traveInTime() {
		Exception ex = Assertions.assertThrows(TimeTravelException.class,
				() -> timeMachine.traveInTime(traveler1, 1903));

		assertEquals("Time machine is off", ex.getMessage());

		timeMachine.setWorking(true);

		Exception ex2 = Assertions.assertThrows(TimeTravelException.class,
				() -> timeMachine.traveInTime(traveler1, 1803));

		assertEquals("Too young", ex2.getMessage());

		Exception ex3 = Assertions.assertThrows(TimeTravelException.class,
				() -> timeMachine.traveInTime(traveler1, 1999));

		assertEquals("No live after death", ex3.getMessage());
	}

}

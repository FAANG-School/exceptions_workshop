package exceptions_workshop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import task_1.TimeTraveler;

public class TimeTravelerTest {
	
	@Test
	void creation() {
		Exception ex = Assertions.assertThrows(IllegalArgumentException.class,
				() -> new TimeTraveler(null, 1900, 1945));

		Exception ex2 = Assertions.assertThrows(IllegalArgumentException.class,
				() -> new TimeTraveler(" ", 1900, 1945));

		Exception ex3 = Assertions.assertThrows(IllegalArgumentException.class,
				() -> new TimeTraveler("Test traveler", 0, 1945));
		
		Exception ex4 = Assertions.assertThrows(IllegalArgumentException.class,
				() -> new TimeTraveler("Test traveler", 1900, -1945));
		
		Exception ex5 = Assertions.assertThrows(IllegalArgumentException.class,
				() -> new TimeTraveler("Test traveler", 1900, 1845));

		assertEquals("Name can't be null or blank", ex.getMessage());
		assertEquals("Name can't be null or blank", ex2.getMessage());
		assertEquals("Dates must be positive", ex3.getMessage());
		assertEquals("Dates must be positive", ex4.getMessage());
		assertEquals("Traveler can't be dead before birthday", ex5.getMessage());

	}

}

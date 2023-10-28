package task_5;

import java.util.Random;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BattleSimulator {

	public void simulateBattle(Hero hero, int numTurns) throws InterruptedException {

		if (hero == null) {
			throw new IllegalArgumentException("Null hero was sent");
		}

		if (numTurns < 1) {
			throw new IllegalArgumentException("Allowed 1 turn atleast");
		}

		log.info("Beginning a battle simulation with {}, number of turns: {}", hero.getHeroName(), numTurns );
		Random random = new Random();

		MagicItem[] inventory = hero.getInventory().toArray(new MagicItem[hero.getInventory().size()]);

		for (int i = 0; i < numTurns; i++) {

			log.info("Turn {} start", i + 1);
			
			int nextInt = random.nextInt(inventory.length);

			try {
				hero.useItem(inventory[nextInt]);
			} catch (RuntimeException e) {
				log.error("Exception in useItem(): {}", e.getMessage());
			}

			Thread.sleep(2000);
		}
	}

}

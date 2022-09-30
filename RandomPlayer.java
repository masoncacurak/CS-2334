import java.util.Random;

public class RandomPlayer extends Player {

	private Random generator;

	public RandomPlayer(String name) {
		super(name);

	}

	public int[] getMove(int[] pileSizes) {
		Random random = new Random();
		int index = random.nextInt(pileSizes.length);

		while (pileSizes[index] == 0) {
			index = random.nextInt(pileSizes.length);
		}
		int randomObject = random.nextInt(pileSizes[index]) + 1;
		int[] array = { index, randomObject };
		return array;
	}
}

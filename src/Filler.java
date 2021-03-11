import java.util.Random;

public class Filler {

    public static final int MAX_VALUE = 100;

    public static void filler(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(MAX_VALUE);
        }
    }
}

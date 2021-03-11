public class Calculate {
    public static int[] changeNumOfArray(int[] array) {
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }
        return array;
    }
}

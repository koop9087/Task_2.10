import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int size = CustomScanner.scanInt();
        System.out.println(size);
        int[] array = new int[size];
        Filler.filler(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(Calculate.changeNumOfArray(array)));

    }
}

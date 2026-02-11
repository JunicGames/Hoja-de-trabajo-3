package App;

import java.util.Random;
import java.util.Arrays;

public class NumberGenerator {

    public static int[] generateRandom(int size) {
        Random rand = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(10000);
        }

        return array;
    }

    public static int[] generateSorted(int size) {
        int[] array = generateRandom(size);
        Arrays.sort(array);
        return array;
    }
}
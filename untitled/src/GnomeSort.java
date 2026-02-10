public class GnomeSort {

    public static <T extends Comparable<T>> void sort(T[] arr) {
        int i = 0;

        while (i < arr.length) {
            if (i == 0 || arr[i].compareTo(arr[i - 1]) >= 0) {
                i++;
            } else {
                T temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
                i--;
            }
        }
    }
}

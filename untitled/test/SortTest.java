import Sort.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class SortTest {

    private final int[] unsorted = {5, 3, 8, 1, 2};
    private final int[] expected = {1, 2, 3, 5, 8};

    @Test
    public void testGnomeSort() {
        Sort sort = new SortGnome();
        int[] data = unsorted.clone();
        sort.sort(data);
        assertArrayEquals(expected, data);
    }

    @Test
    public void testMergeSort() {
        Sort sort = new SortMerge();
        int[] data = unsorted.clone();
        sort.sort(data);
        assertArrayEquals(expected, data);
    }

    @Test
    public void testQuickSort() {
        Sort sort = new SortQuick();
        int[] data = unsorted.clone();
        sort.sort(data);
        assertArrayEquals(expected, data);
    }

    @Test
    public void testRadixSort() {
        Sort sort = new SortRadix();
        int[] data = unsorted.clone();
        sort.sort(data);
        assertArrayEquals(expected, data);
    }

    @Test
    public void testHeapSort() {
        Sort sort = new SortHeap();
        int[] data = unsorted.clone();
        sort.sort(data);
        assertArrayEquals(expected, data);
    }
}
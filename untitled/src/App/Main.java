package App;

import Sort.*;

public class Main {

    public static void main(String[] args) {

        try {

            FileManager fileManager = new FileManagerImpl();

            Sort sortGnome = new SortGnome();
            Sort sortMerge = new SortMerge();
            Sort sortQuick = new SortQuick();
            Sort sortRadix = new SortRadix();
            Sort sortHeap = new SortHeap();

            System.out.println("Tamaño: " + 10);

            testAlgorithm("GnomeSort", sortGnome, 10);
            testAlgorithm("MergeSort", sortMerge, 10);
            testAlgorithm("QuickSort", sortQuick, 10);
            testAlgorithm("RadixSort", sortRadix, 10);
            testAlgorithm("HeapSort", sortHeap, 10);

            System.out.println("Tamaño: " + 100);

            testAlgorithm("GnomeSort", sortGnome, 100);
            testAlgorithm("MergeSort", sortMerge, 100);
            testAlgorithm("QuickSort", sortQuick, 100);
            testAlgorithm("RadixSort", sortRadix, 100);
            testAlgorithm("HeapSort", sortHeap, 100);

            System.out.println("Tamaño: " + 500);

            testAlgorithm("GnomeSort", sortGnome, 500);
            testAlgorithm("MergeSort", sortMerge, 500);
            testAlgorithm("QuickSort", sortQuick, 500);
            testAlgorithm("RadixSort", sortRadix, 500);
            testAlgorithm("HeapSort", sortHeap, 500);

            System.out.println("Tamaño: " + 1000);

            testAlgorithm("GnomeSort", sortGnome, 1000);
            testAlgorithm("MergeSort", sortMerge, 1000);
            testAlgorithm("QuickSort", sortQuick, 1000);
            testAlgorithm("RadixSort", sortRadix, 1000);
            testAlgorithm("HeapSort", sortHeap, 1000);

            System.out.println("Tamaño: " + 2000);

            testAlgorithm("GnomeSort", sortGnome, 2000);
            testAlgorithm("MergeSort", sortMerge, 2000);
            testAlgorithm("QuickSort", sortQuick, 2000);
            testAlgorithm("RadixSort", sortRadix, 2000);
            testAlgorithm("HeapSort", sortHeap, 2000);

            System.out.println("Tamaño: " + 3000);

            testAlgorithm("GnomeSort", sortGnome, 3000);
            testAlgorithm("MergeSort", sortMerge, 3000);
            testAlgorithm("QuickSort", sortQuick, 3000);
            testAlgorithm("RadixSort", sortRadix, 3000);
            testAlgorithm("HeapSort", sortHeap, 3000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void testAlgorithm(String name, Sort algorithm, int size) {

        // Promedio (desordenado)
        int[] randomData = NumberGenerator.generateRandom(size);

        long start = System.nanoTime();
        algorithm.sort(randomData);
        long end = System.nanoTime();

        System.out.println(name + " (desordenado): " + (end - start) + " ns");

        // Mejor caso (ordenado)
        int[] sortedData = NumberGenerator.generateSorted(size);

        start = System.nanoTime();
        algorithm.sort(sortedData);
        end = System.nanoTime();

        System.out.println(name + " (ordenado): " + (end - start) + " ns");
    }
}
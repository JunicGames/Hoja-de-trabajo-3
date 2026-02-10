public class Main {

    public static void main(String[] args) throws Exception {

        NumberGenerator.generate("numbers.txt", 3000);
        Integer[] data = FileManager.readNumbers("numbers.txt");

        long start = System.nanoTime();
        MergeSort.sort(data);
        long end = System.nanoTime();

        System.out.println("Tiempo: " + (end - start) + " ns");
    }
}

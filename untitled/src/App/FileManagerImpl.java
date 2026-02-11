package App;

import java.io.*;
import java.util.*;

public class FileManagerImpl implements FileManager {

    @Override
    public void createFile(String path) throws IOException {

    }

    @Override
    public void writeData(String path, Integer[] data) throws IOException {

        try (PrintWriter writer = new PrintWriter(new File(path))) {
            for (Integer num : data) {
                writer.print(num + " ");
            }
        }
    }

    @Override
    public Integer[] readData(String path) throws IOException {

        List<Integer> numbers = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
        }

        return numbers.toArray(new Integer[0]);
    }

    @Override
    public void writeData(String path, int[] data) throws IOException {

    }
}


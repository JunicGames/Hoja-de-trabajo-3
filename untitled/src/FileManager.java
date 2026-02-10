import java.io.*;
import java.util.ArrayList;

public class FileManager {

    public static Integer[] readNumbers(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        ArrayList<Integer> list = new ArrayList<>();
        String line;

        while ((line = br.readLine()) != null) {
            list.add(Integer.parseInt(line));
        }
        br.close();

        return list.toArray(new Integer[0]);
    }
}

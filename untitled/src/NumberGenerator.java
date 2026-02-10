import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class NumberGenerator {

    public static void generate(String filename, int amount) throws IOException {
        Random rand = new Random();
        FileWriter writer = new FileWriter(filename);

        for (int i = 0; i < amount; i++) {
            writer.write(rand.nextInt(100000) + "\n");
        }
        writer.close();
    }
}

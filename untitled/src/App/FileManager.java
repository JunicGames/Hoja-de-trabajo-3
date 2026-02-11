package App;

import java.io.*;

public interface FileManager {
    void createFile(String path) throws IOException;

    void writeData(String path, Integer[] data) throws IOException;

    Integer[] readData(String path) throws IOException;
    void writeData(String path, int[] data) throws IOException;
}

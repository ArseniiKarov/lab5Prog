package manager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import data.Worker;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.TreeMap;

/**
 * Класс записывающий коллекцию в файл.
 */
public class JsonWriter {
    public static void write(String path) throws IOException {
        TreeMap<String, Worker> treeMap = CollectionManager.getMap();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (PrintWriter writer = new PrintWriter(new FileWriter(path))) {
            gson.toJson(treeMap, writer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Path tempFile = Files.createTempFile("collection", ".json");
        try (Writer writer = Files.newBufferedWriter(tempFile)) {
            gson.toJson(treeMap, writer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Path targetFile = Paths.get("collection.json");
        Files.move(tempFile, targetFile, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
    }
}

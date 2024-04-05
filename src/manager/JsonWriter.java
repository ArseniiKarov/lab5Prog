package manager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import data.Worker;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.TreeMap;

/**
 * Класс записывающий коллекцию в файл.
 */
public class JsonWriter {
    private static String path;

    public JsonWriter(String path) {
        JsonWriter.path = path;
    }

    public static void write() throws IOException {
        TreeMap<String, Worker> treeMap = CollectionManager.getMap();

        try (PrintWriter writer = new PrintWriter(new FileWriter(JsonWriter.path))) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(treeMap, writer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

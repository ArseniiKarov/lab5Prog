package manager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import data.Worker;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.TreeMap;

/**
 * Класс-парсер файла.
 */
public class JsonReader {
    Map<String, Worker> map = new TreeMap<>();

    public static String readJson(String[] arg) throws IOException {
        StringBuilder str = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(arg[0]))) {
            String line;
            while ((line = reader.readLine()) != null) {
                str.append(line);
            }
        }
        return str.toString();
    }

    public void jsonReader(String str) {
        Type type = new TypeToken<TreeMap<String, Worker>>() {}.getType();
        try {
            map = new Gson().fromJson(str, type);
            CollectionManager collectionManager = new CollectionManager(map);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

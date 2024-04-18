//package manager;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import data.LocalDateTimeTypeAdapter;
//import data.Worker;
//
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.time.LocalDateTime;
//import java.util.TreeMap;
//
///**
// * Класс записывающий коллекцию в файл.
// */
//public class JsonWriter {
//    /**
//     * Метод для записи в файл
//     * @throws IOException ошибка системы
//     */
//    public static void write() throws IOException {
//        TreeMap<String, Worker> treeMap = CollectionManager.getMap();
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.registerTypeAdapter(LocalDateTime.class, new LocalDateTimeTypeAdapter());
//        Gson gson = gsonBuilder.create();
//        try (PrintWriter writer = new PrintWriter(new FileWriter())) {
//            gson.toJson(treeMap, writer);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
////        Path tempFile = Files.createTempFile("collection", ".json");
////        try (Writer writer = Files.newBufferedWriter(tempFile)) {
////            gson.toJson(treeMap, writer);
////        } catch (Exception e) {
////            System.out.println(e.getMessage());
////        }
////        Path targetFile = Paths.get("collection.json");
////        Files.move(tempFile, targetFile, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
//    }
//}

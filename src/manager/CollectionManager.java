package manager;

import data.Worker;
import errors.UnknownElementException;

import java.util.*;

public class CollectionManager {
    private static TreeMap<String, Worker> map = new TreeMap<>();
    private static final Date creationDate = getDate();

    public CollectionManager(TreeMap<String, Worker> map) {
        this.map = map;
    }

    /**
     * Метод для получения даты создания коллекции
     *
     * @return дата создания
     */
    public static Date getDate() {
        return creationDate;
    }

    /**
     * Метод для удаления элемента по ключу
     *
     * @param key ключ
     * @throws UnknownElementException ошибка неизвестной команды
     */

    public static void remove(String key) throws UnknownElementException {
        if (map.containsKey(key)) {
            map.remove(key);
        } else {
            throw new UnknownElementException();
        }
    }

    /**
     * Метод для добавления элемента в коллекцию
     *
     * @param key    ключ
     * @param worker работник
     */
    public static void add(String key, Worker worker) {
        if (map == null) {
            map = new TreeMap<>();
        }
        map.put(key, worker);
    }

    private TreeMap<String, Worker> treeMap;

    public CollectionManager() {
        this.treeMap = new TreeMap<>();
    }

    /**
     * Метод для получения коллекции
     *
     * @return коллекция
     */

    public static TreeMap<String, Worker> getMap() {
        return map;
    }

    /**
     * Метод для установки коллекции
     *
     * @param map коллекции
     */

    public static void setMap(TreeMap<String, Worker> map) {
        CollectionManager.map = Objects.requireNonNullElseGet(map, TreeMap::new);
    }
}


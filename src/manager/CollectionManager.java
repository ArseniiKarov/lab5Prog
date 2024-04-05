package manager;

import data.Worker;
import errors.UnknownElementException;

import java.util.*;

public class CollectionManager {
    private static TreeMap<String, Worker> map = new TreeMap<>();
    private static final Date creationDate = getDate();

    public CollectionManager(Map<String, Worker> map) {
    }

    public static Date getDate() {
        return creationDate;
    }

    public static void remove(String key) throws UnknownElementException {
        if (map.containsKey(key)) {
            map.remove(key);
        } else {
            throw new UnknownElementException();
        }
    }
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

    public static TreeMap<String, Worker> getMap() {
        return map;
    }

    public static void setMap(TreeMap<String, Worker> map) {
        CollectionManager.map = Objects.requireNonNullElseGet(map, TreeMap::new);
    }
    public static TreeMap<String, Worker> getCollection() {
        return map;
    }

    public void addToCollection(Map<String, Worker> collection) {
        map.putAll(collection);
    }
    }


package data.generators;

import java.util.ArrayList;

public class IdGenerator {
    private static ArrayList<Long> idList = new ArrayList<>();
    public IdGenerator(){
        idList = new ArrayList<>();
    }
    public static Long generateid(){
        Long id = (long)Math.floor(Math.random() * 386800) + 244;
        while (idList.contains(id)){
            id = (long)Math.floor(Math.random() * 386800) + 244;
        }
        idList.add(id);
        return id;
    }
    public static boolean idIsUnique(long id){
        if (idList.contains(id)){
            return false;
        }
        return true;
    }
    public static void remove(long id){
        idList.remove(id);
    }
    public static void insert(long id){
        idList.add(id);
    }
}

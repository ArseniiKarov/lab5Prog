package manager;

import errors.NoElementException;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Console {
    private static String filename;
    private CollectionManager collectionManager;

    public void setFilename(String filename){
        this.filename = filename;
    }
    public void start(InputStream input, String[] args) throws NoElementException, IOException {
        Scanner scanner = new Scanner(input);
        CommandManager commandManager = new CommandManager();
        this.collectionManager = new CollectionManager();
        JsonReader jsonReader = new JsonReader();
        while (scanner.hasNextLine()){
            String command = scanner.nextLine().trim();
            if (!command.isEmpty()){
                try {
                    CommandManager.startExecuting(command);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

}

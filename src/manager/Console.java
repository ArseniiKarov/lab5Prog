package manager;

import errors.NoElementException;

import java.io.InputStream;
import java.util.Scanner;

public class Console {
    public String data_path;
    private CollectionManager collectionManager;

    public void start(InputStream input, String[] args) throws NoElementException {
        Scanner scanner = new Scanner(input);
        CommandManager commandManager = new CommandManager();
        this.collectionManager = new CollectionManager();

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

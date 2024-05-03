package manager;

import manager.commands.ExecuteScript;
import errors.NoElementException;

import java.io.InputStream;
import java.util.Scanner;

public class Console {
    private static String filename;
    private CollectionManager collectionManager;

    /**
     * Метод для уствновки названия файла
     * @param filename название файла
     */
    public void setFilename(String filename){
        Console.filename = filename;
    }

    /**
     * Метод для запуска
     * @param input ввод
     * @param args аргументы
     * @throws NoElementException ошибка отсутствия элемента
     */
    public void start(InputStream input, String[] args, CollectionManager collectionManager) throws NoElementException {
        Scanner scanner = new Scanner(input);
        CommandManager commandManager = new CommandManager();
        this.collectionManager = collectionManager;
        while (scanner.hasNextLine()){
            String command = scanner.nextLine().trim();
            if (!command.isEmpty()){
                try {
                    CommandManager.startExecuting(command, ExecuteScript.scripts);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

}

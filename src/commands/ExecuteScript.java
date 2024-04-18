package commands;

import errors.NoElementException;
import manager.CommandManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class ExecuteScript implements Command {

    public static Set<String> scripts = new HashSet<>();
    /**
     * Метод для выполнения команда
     * @param args аргументы
     * @throws NoElementException ошибка отсутствия элемента
     * @throws Exception ошибка
     */
    @Override
    public void execute(String[] args) throws Exception, NoElementException {
        String file_path = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(file_path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                CommandManager.startExecuting(line, scripts);
            }
            System.out.println("команда выполнена :)");
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Метод для получения имени команды
     * @return именя команды
     */
    @Override
    public String getName() {
        return "execute_script file_name";
    }

    /**
     * Метод для описания команды
     * @return описание
     */
    @Override
    public String getDescription() {
        return "считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.";
    }
}

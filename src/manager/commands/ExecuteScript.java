package manager.commands;

import errors.IncorrectInputException;
import errors.NoElementException;
import errors.UnknownCommandException;
import errors.UnknownElementException;
import manager.CollectionManager;
import manager.CommandManager;

import java.io.BufferedReader;
import java.io.FileReader;
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
                if (line.split(" ")[0].equals("insert")) {
                    CollectionManager.insertInScript(line.split(" "));
                } else {
                    CommandManager.startExecuting(line, scripts);
                }
            }
        System.out.println("команда выполнена :)");
    } catch (UnknownElementException e) {
        System.err.println("неизвестный элемент");
    } catch (UnknownCommandException | IncorrectInputException e) {
        System.err.println(e.getMessage());
    } catch (Exception e) {
        System.err.println("неизвестная ошибка");
    }
        scripts.clear();
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

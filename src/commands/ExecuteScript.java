package commands;

import errors.NoElementException;
import manager.CommandManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExecuteScript implements Command {
    @Override
    public void execute(String[] args) throws Exception, NoElementException {
        String file_path = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(file_path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                CommandManager.startExecuting(line);
            }
            System.out.println("команда выполнена :)");
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String getName() {
        return "execute_script file_name";
    }

    @Override
    public String getDescription() {
        return "считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.";
    }
}

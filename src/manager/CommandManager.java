package manager;

import commands.*;
import errors.NoElementException;
import errors.UnknownCommandException;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CommandManager {
    private static Map<String, Command> commandList;

    public CommandManager() {
        commandList = new HashMap<>();
        commandList.put("help", new Help());
        commandList.put("info", new Info());
        commandList.put("show", new Show());
        commandList.put("insert", new Insert());
        commandList.put("update_id", new UpdateId());
        commandList.put("remove_key", new RemoveKey());
        commandList.put("clear", new Clear());
        commandList.put("save", new Save());
        commandList.put("execute_script", new ExecuteScript());
        commandList.put("exit", new Exit());
        commandList.put("replace_if_greater", new RemoveLower());
        commandList.put("remove_greater_key", new RemoveGreater());
        commandList.put("remove_lower_key", new RemoveLowerKey());
        commandList.put("remove_any_by_mood", new RemoveAnyBySalary());
        commandList.put("max_by_id", new FilterContainsName());
        commandList.put("count_less_than_weapon_type", new PrintAscending());
    }

    /**
     * Метод для запуска команд
     * @param line строка
     * @param scripts скрипты
     * @throws Exception ошибки
     * @throws NoElementException ошибка отсутствия элемента
     */
    public static void startExecuting(String line, Set<String> scripts) throws Exception, NoElementException {
        String[] lines = line.split(" ");
        String commandName = lines[0];
        if (!commandList.containsKey(commandName)) {
            throw new UnknownCommandException(commandName);
        }
        Command command = commandList.get(commandName);
        if(commandName.equals("execute_script")){
            String scriptName = lines[1];
            if (scripts.contains(scriptName)){
                System.err.println("произошла рекурсия");
                scripts.clear();
                return;
            }else{
                scripts.add(scriptName);
            }
        }

        command.execute(lines);
        if (!commandName.equals("execute_script")){
            System.out.println("команда выполнена :)");
        }

    }

    /**
     * Метод для получения списка команд
     * @return список команд
     */
    public Map<String, Command> getCommandList() {
        return commandList;
    }
}

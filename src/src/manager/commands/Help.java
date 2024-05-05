package manager.commands;

import manager.CommandManager;

import java.util.Map;

public class Help implements Command {
    /**
     * Метод для выполнения команда
     * @param args аргументы
     */
    @Override
    public void execute(String[] args)  {
        CommandManager commandManager = new CommandManager();
        Map<String, Command> commandList = commandManager.getCommandList();
        for (String name: commandList.keySet()){
            Command command = commandList.get(name);
            System.out.println(command.getName() + " - " + command.getDescription());
        }
    }

    /**
     * Метод для получения имени команды
     * @return именя команды
     */
    @Override
    public String getName() {
        return "help";
    }

    /**
     * Метод для описания команды
     * @return описание
     */
    @Override
    public String getDescription() {
        return "вывести справку по доступным командам";
    }
}

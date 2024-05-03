package manager.commands;

public class Exit implements Command{
    /**
     * Метод для выполнения команда
     * @param arg аргументы
     */
    @Override
    public void execute(String[] arg) {
        System.exit(1);
    }

    /**
     * Метод для получения имени команды
     * @return именя команды
     */
    @Override
    public String getName() {
        return "exit";
    }

    /**
     * Метод для описания команды
     * @return описание
     */
    @Override
    public String getDescription() {
        return "завершить программу (без сохранения в файл)";
    }
}

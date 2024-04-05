
import errors.NoElementException;
import manager.Console;

public class Main {
    public static void main(String[] args) throws NoElementException {
        Console console = new Console();

        System.out.println("Введите команду 'help', чтобы увидеть все доступные команды");
        console.start(System.in, args);
    }
}
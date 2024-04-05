package commands;

import errors.NoElementException;

public interface Command {
    public void execute(String[] args) throws NoElementException, Exception;
    public String getName();
    public String getDescription();
}
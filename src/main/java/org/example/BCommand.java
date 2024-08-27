package org.example;

public class BCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Executou o comando B");
    }
}

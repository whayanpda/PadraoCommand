package org.example;


public class ACommand implements Command {
    @Override
    public void execute() {
        System.out.println("Executou o comando A");
    }
}

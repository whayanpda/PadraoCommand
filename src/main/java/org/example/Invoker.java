package org.example;

import java.util.HashMap;
import java.util.Map;

public class Invoker {
    private static Map<String, Command> comandos = new HashMap<>();

    static {
        comandos.put("A", new ACommand());
        comandos.put("B", new BCommand());
    }

    public static void invoke(String command) {
        Command cmd = comandos.get(command);
        if (cmd != null) {
            cmd.execute();
        } else {
            System.out.println("Comando não encontrado: " + command);
        }
    }
}

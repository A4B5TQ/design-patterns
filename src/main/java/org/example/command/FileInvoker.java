package org.example.command;

public final class FileInvoker {

    public static void execute(Command command) {
        command.execute();
    }
}

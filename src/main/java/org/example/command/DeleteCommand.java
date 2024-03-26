package org.example.command;

public class DeleteCommand implements Command {

    private FileSystemReceiver fileSystemReceiver;

    public DeleteCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.deleteFile();
    }
}

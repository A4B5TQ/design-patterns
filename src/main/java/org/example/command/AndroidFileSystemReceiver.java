package org.example.command;

public class AndroidFileSystemReceiver implements FileSystemReceiver {
    @Override
    public void openFile() {
        System.out.println("Opening file in Android OS");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in Android OS");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in Android OS");
    }

    @Override
    public void deleteFile() {
        System.out.println("Deleting file in Android OS");
    }
}

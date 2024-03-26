package org.example;

import org.example.command.*;
import org.example.template.AbstractClass;
import org.example.template.ChildOne;
import org.example.template.ChildSecond;

public class Main {
    public static void main(String[] args) {

        // Singleton
//        DBConnection connection = DBConnection.getInstance();
//        DBConnection connection1 = DBConnection.getInstance();
//        DBConnection connection2 = DBConnection.getInstance();
//        connection1.create("test");
//        connection2.delete("test");
//        connection.read();
        System.out.println();
        // Builder

//        Computer computer = new Computer.ComputerBuilder("500 GB", "64 GB")
//                .setGraphicsCardEnabled(true)
//                .build();
//        Computer second = new Computer.ComputerBuilder("1 TB", "32GB")
//                .setBluetoothEnabled(true)
//                .setGraphicsCardEnabled(true)
//                .build();


//        System.out.println();


        // Facade

//        String tableName = "payments";
//
//        // without facade
//        Connection connection = MySQLHelper.getSQLConnection();
//        MySQLHelper mySQLHelper = new MySQLHelper();
//        mySQLHelper.generateMySQLPDFReport(tableName,connection);
//
//        Connection connection1 = OracleHelper.getSQLConnection();
//        OracleHelper oracleHelper = new OracleHelper();
//        oracleHelper.generateOraclePDFReport(tableName,connection1);
//
//        // with facade
//        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.PDF,tableName);
//        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF,tableName);

        // Composite

//        Shape rectangle = new Rectangle();
//        Shape linOne = new Line();
//        Shape lineTwo = new Line();
//
//        Drawing drawing = new Drawing();
//        drawing.add(rectangle);
//        drawing.add(lineTwo);
//        drawing.add(linOne);
//
//        drawing.draw("Red");
//
//        drawing.clear();
//
//        drawing.add(rectangle);
//        drawing.add(linOne);
//        drawing.draw("Green");

        System.out.println();

        // command
//        FileSystemReceiver fs = getFileSystemReceiver();
//
//        OpenFileCommand openFileCommand = new OpenFileCommand(fs);
//
//        FileInvoker.execute(openFileCommand);
//        FileInvoker.execute(new WriteFileCommand(fs));
//        FileInvoker.execute(new CloseFileCommand(fs));
//        FileInvoker.execute(new DeleteCommand(fs));

        // template method

        AbstractClass a = new ChildOne();
        a.templateMethod();

        AbstractClass b = new ChildSecond();
        b.templateMethod();

        System.out.println();
    }

    public static FileSystemReceiver getFileSystemReceiver() {
//        String osName = System.getProperty("os.name");
        String osName = "android";
        System.out.println("OS: " + osName);

        if (osName.toLowerCase().contains("windows")) {
            return new WindowsFileSystemReceiver();
        } else if (osName.toLowerCase().contains("unix")){
            return new UnixFileSystemReceiver();
        } else {
            return new AndroidFileSystemReceiver();
        }
    }
}
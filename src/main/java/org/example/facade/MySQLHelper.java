package org.example.facade;

import java.sql.Connection;

public class MySQLHelper {

    public static Connection getSQLConnection() {
        return null;
    }

    public void generateMySQLPDFReport(String tableName, Connection connection) {
        // get data from table and generate report
    }

    public void generateMySQLHTMLReport(String tableName, Connection connection) {
        // get data from table and generate report
    }
}

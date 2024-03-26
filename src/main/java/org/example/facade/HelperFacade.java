package org.example.facade;

import java.sql.Connection;

public class HelperFacade {

    public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName) {
        Connection connection = null;

        switch (dbType) {
            case MYSQL -> {
                connection = MySQLHelper.getSQLConnection();
                MySQLHelper mySQLHelper = new MySQLHelper();
                switch (reportType) {
                    case HTML -> mySQLHelper.generateMySQLHTMLReport(tableName, connection);
                    case PDF -> mySQLHelper.generateMySQLPDFReport(tableName, connection);
                }
            }
            case ORACLE -> {
                connection = OracleHelper.getSQLConnection();
                OracleHelper oracleHelper = new OracleHelper();
                switch (reportType) {
                    case HTML -> oracleHelper.generateOracleHTMLReport(tableName, connection);
                    case PDF -> oracleHelper.generateOraclePDFReport(tableName, connection);
                }
            }
        }
    }

    public static enum DBTypes {
        MYSQL, ORACLE
    }

    public static enum ReportTypes {
        HTML, PDF
    }
}

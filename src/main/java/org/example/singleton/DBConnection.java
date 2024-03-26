package org.example.singleton;

public class DBConnection {

    private static volatile DBConnection INSTANCE;

    private DBConnection() {
    }

    public static DBConnection getInstance() {
        if (INSTANCE == null) {
            synchronized (DBConnection.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DBConnection();
                }
            }
        }
        return INSTANCE;
    }

    // CRUD
    public void create(String data) {
        System.out.println("Created: " + data);
    }

    public void update(String data) {
        System.out.println("Updated: " + data);
    }

    public void delete(String data) {
        System.out.println("Deleted: " + data);
    }

    public void read() {
        System.out.println("Data");
    }
}

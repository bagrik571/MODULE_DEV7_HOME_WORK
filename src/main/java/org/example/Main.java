package org.example;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Database database = Database.getInstance();
        database.execute("src/sql/init_db.sql");
        DatabasePopulateService.insertWorkers();
        DatabasePopulateService.insertClients();
        DatabasePopulateService.insertProjects();
        DatabasePopulateService.insertProjectWorkers();
    }
}
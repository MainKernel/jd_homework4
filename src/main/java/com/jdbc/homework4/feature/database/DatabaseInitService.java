package com.jdbc.homework4.feature.database;

import static com.jdbc.homework4.feature.prefs.Prefs.INIT_DB_SQL;

public class DatabaseInitService {
    public void initDB() {
        Database.getInstance().updateService(INIT_DB_SQL);
    }

    public static void main(String[] args) {
        new DatabaseInitService().initDB();
    }
}

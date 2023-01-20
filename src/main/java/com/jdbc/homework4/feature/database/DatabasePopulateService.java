package com.jdbc.homework4.feature.database;

import static com.jdbc.homework4.feature.prefs.Prefs.POPULATE_DB_SQL;

public class DatabasePopulateService {

    public void populate() {
        Database.getInstance().updateService(POPULATE_DB_SQL);
    }

    public static void main(String[] args) {
        new DatabasePopulateService().populate();
    }
}

package com.jdbc.homework4.feature.prefs;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Prefs {
    private static final String DEFAULT_PREFS_FILENAME = "prefs.json";
    public static final String INIT_DB_SQL = "initDB";
    public static final String POPULATE_DB_SQL = "populateDB";
    public static final String LONGEST_PROJECT_DB_SQL = "longestProject";
    public static final String WORKER_MAX_SALARY_DB_SQL = "maxWorkerSalary";
    public static final String MAX_PROJECT_CLIENT_DB_SQL = "maxClientProjects";
    public static final String YOUNGEST_AND_ELDEST_WORKER_DB_SQL = "youngestAndEldest";
    public static final String PROJECT_PRICES_DB_SQL = "projectPrices";

    private Map<String, Object> prefs = new HashMap<>();


    public Prefs() {
        this(DEFAULT_PREFS_FILENAME);
    }

    public Prefs(String filename) {
        try {
            String join = String.join("\n", Files.readAllLines(Path.of(filename)));
            prefs = new Gson().fromJson(join,
                    TypeToken.getParameterized(Map.class, String.class, Object.class).getType());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getString(String key) {
        return getPref(key).toString();
    }

    public Object getPref(String key) {
        return prefs.get(key);
    }
}

package com.jdbc.homework4.feature.database;

import com.jdbc.homework4.feature.deserialization.*;

import java.sql.SQLException;
import java.util.List;

import static com.jdbc.homework4.feature.prefs.Prefs.LONGEST_PROJECT_DB_SQL;

public class DatabaseQueryService {
    QueryUtils qu = new QueryUtils();

    public List<LongestProject> findLongestProject() {
        try {
            return qu.longestProject();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<MaxSalary> findMaxSalary() {
        try {
            return qu.maxSalary();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<MaxProjectClient> findMaxProjectsClient() {
        try {
            return qu.maxProjectClients();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Worker> findYoungestAndEldestWorker() {
        try {
            return qu.worker();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<ProjectPrice> findProjectPrices() {
        try {
            return qu.projectPrice();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

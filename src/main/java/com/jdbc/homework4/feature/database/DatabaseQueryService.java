package com.jdbc.homework4.feature.database;

import com.jdbc.homework4.feature.deserialization.*;

import java.sql.SQLException;
import java.util.List;

import static com.jdbc.homework4.feature.prefs.Prefs.*;

public class DatabaseQueryService {
    QueryUtils qu = new QueryUtils();

    public List<LongestProject> findLongestProject() {
        try {
            return qu.longestProject(Database.getInstance().queryService(LONGEST_PROJECT_DB_SQL));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<MaxSalary> findMaxSalary() {
        try {
            return qu.maxSalary(Database.getInstance().queryService(WORKER_MAX_SALARY_DB_SQL));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<MaxProjectClient> findMaxProjectsClient() {
        try {
            return qu.maxProjectClients(Database.getInstance().queryService(MAX_PROJECT_CLIENT_DB_SQL));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Worker> findYoungestAndEldestWorker() {
        try {
            return qu.worker(Database.getInstance().queryService(YOUNGEST_AND_ELDEST_WORKER_DB_SQL));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<ProjectPrice> findProjectPrices() {
        try {
            return qu.projectPrice(Database.getInstance().queryService(PROJECT_PRICES_DB_SQL));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

package com.jdbc.homework4.feature.database;

import com.jdbc.homework4.feature.deserialization.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.jdbc.homework4.feature.prefs.Prefs.*;

public class QueryUtils {

    public List<LongestProject> longestProject() throws SQLException {
        List<LongestProject> project = new ArrayList<>();
        ResultSet set = Database.getInstance().queryService(LONGEST_PROJECT_DB_SQL);
        while (set.next()) {
            project.add(new LongestProject(set.getString("name"),
                    set.getString("month_count")));
        }
        return project;
    }

    public List<MaxProjectClient> maxProjectClients() throws SQLException {
        List<MaxProjectClient> project = new ArrayList<>();
        ResultSet set = Database.getInstance().queryService(MAX_PROJECT_CLIENT_DB_SQL);
        while (set.next()) {
            project.add(new MaxProjectClient(set.getString("name"),
                    set.getLong("project_count")));
        }
        return project;
    }

    public List<MaxSalary> maxSalary() throws SQLException {
        List<MaxSalary> project = new ArrayList<>();
        ResultSet set = Database.getInstance().queryService(WORKER_MAX_SALARY_DB_SQL);
        while (set.next()) {
            project.add(new MaxSalary(set.getString("name"),
                    set.getInt("salary")));
        }
        return project;
    }

    public List<ProjectPrice> projectPrice() throws SQLException {
        List<ProjectPrice> project = new ArrayList<>();
        ResultSet set = Database.getInstance().queryService(PROJECT_PRICES_DB_SQL);
        while (set.next()) {
            project.add(new ProjectPrice(set.getString("name"),
                    set.getLong("price")));
        }
        return project;
    }

    public List<Worker> worker() throws SQLException {
        List<Worker> project = new ArrayList<>();
        ResultSet set = Database.getInstance().queryService(YOUNGEST_AND_ELDEST_WORKER_DB_SQL);
        while (set.next()) {
            project.add(new Worker(set.getString("type"),
                    set.getString("name"), LocalDate.parse(set.getString("birthday"))));
        }
        return project;
    }
}

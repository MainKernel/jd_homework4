package com.jdbc.homework4.feature.database;

import com.jdbc.homework4.feature.deserialization.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class QueryUtils {

    public List<LongestProject> longestProject(ResultSet set) throws SQLException {
        List<LongestProject> project = new ArrayList<>();
        while (set.next()) {
            project.add(new LongestProject(set.getString("name"),
                    set.getString("month_count")));
        }
        set.close();
        return project;
    }

    public List<MaxProjectClient> maxProjectClients(ResultSet set) throws SQLException {
        List<MaxProjectClient> project = new ArrayList<>();
        while (set.next()) {
            project.add(new MaxProjectClient(set.getString("name"),
                    set.getLong("project_count")));
        }
        set.close();
        return project;
    }

    public List<MaxSalary> maxSalary(ResultSet set) throws SQLException {
        List<MaxSalary> project = new ArrayList<>();
        while (set.next()) {
            project.add(new MaxSalary(set.getString("name"),
                    set.getInt("salary")));
        }
        set.close();
        return project;
    }

    public List<ProjectPrice> projectPrice(ResultSet set) throws SQLException {
        List<ProjectPrice> project = new ArrayList<>();
                while (set.next()) {
            project.add(new ProjectPrice(set.getString("name"),
                    set.getLong("price")));
        }
                set.close();
        return project;
    }

    public List<Worker> worker(ResultSet set) throws SQLException {
        List<Worker> project = new ArrayList<>();
        while (set.next()) {
            project.add(new Worker(set.getString("type"),
                    set.getString("name"), LocalDate.parse(set.getString("birthday"))));
        }
        set.close();
        return project;
    }
}

package com.jdbc.homework4.feature.deserialization;

public class LongestProject {
    private String name;
    private String monthCount;

    public LongestProject(String name, String monthCount) {
        this.name = name;
        this.monthCount = monthCount;
    }

    public String getName() {
        return name;
    }

    public String getMonthCount() {
        return monthCount;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", monthCount='" + monthCount + '\'' +
                '}';
    }
}

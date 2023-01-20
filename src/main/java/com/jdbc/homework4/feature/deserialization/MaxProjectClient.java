package com.jdbc.homework4.feature.deserialization;

public class MaxProjectClient {
    private String name;
    private long count;

    public MaxProjectClient(String name, long count){
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public long getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}

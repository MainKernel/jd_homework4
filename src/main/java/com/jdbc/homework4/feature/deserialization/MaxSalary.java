package com.jdbc.homework4.feature.deserialization;

public class MaxSalary {
    private String name;
    private int salary;

    public MaxSalary(String name, int salary){
        this.name = name;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

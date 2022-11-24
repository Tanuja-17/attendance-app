package com.example.attendance;

public class StudentItem {
    private String roll;
    private String name;
    private String time;
    private String status;

    public StudentItem(String roll, String name, String time) {
        this.roll = roll;
        this.name = name;
        this.time = time;
        status="";
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

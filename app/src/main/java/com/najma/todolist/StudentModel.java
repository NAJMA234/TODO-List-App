package com.najma.todolist;

public class StudentModel {
    String id="";
    String name="";
    String email="";
    String task="";
    String dob="";
    String created_at="";

    public StudentModel(String id, String name, String email, String task, String dob, String created_at) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.task = task;
        this.dob = dob;
        this.created_at = created_at;
    }

    public StudentModel(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}

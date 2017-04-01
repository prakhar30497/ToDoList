package com.example.prakhar.todolist2;

public class TaskRecord {
    private String task;

    public TaskRecord(String task){
        this.task = task;
    }

    public String getTask(){
        return task;
    }

    public void setTask(String task){
        this.task = task;
    }
}

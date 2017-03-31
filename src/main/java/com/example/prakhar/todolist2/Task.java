package com.example.prakhar.todolist2;

public class Task {
    int _id;
    String Task;

    public Task(){}

    public Task(int _id, String task, String note){
        this._id = _id;
        this.Task = task;
    }
    public Task(String Task){
        this._id = 1;
        this.Task = Task;
    }
    public int get_ID() {
        return this._id;
    }
    public String get_Task(){
        return this.Task;
    }

    public void setID(int id){
        this._id = id;
    }
    public void setTask(String task){
        this.Task = task;
    }
}

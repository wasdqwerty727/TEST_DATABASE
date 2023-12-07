package org.example;

import java.util.Date;

public class Task {
    private int taskId;
    private String taskName;
    private String description;
    private Date deadline;
    private Priority priority;
    public Task(){

    }
    public Task(int taskId){
        this.taskId = taskId;
    }
    public Task(String taskName){
        this.taskName = taskName;
    }
    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
    @Override
    public String toString(){
        return "Task{" +
                "taskID=" + taskId +
                ", taskName='" + taskName + '\'' +
                ", taskDescription='" + description + '\'' +
                ", priority=" + priority +
                ", deadline=" + deadline +
                '}';
    }
}

package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {


    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean isTaskExecuted = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("Painting task is executing ...");
        isTaskExecuted=true;
        System.out.println("The painting task has just been completed");

    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isTaskExecuted;
    }
}

package stream.portfolio;

import java.util.LinkedList;
import java.util.List;

public class TaskList {

    private final List<Task> tasks = new LinkedList<>();
    private final String name;

    public TaskList(String name) {
        this.name = name;
    }

    public void addTask(Task task){
        tasks.add(task);
    }

    public boolean removeTask (Task task){
        return tasks.remove(task);
    }

    public List<Task> getTasks(){
        return tasks;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskList taskList = (TaskList) o;

        if (tasks != null ? !tasks.equals(taskList.tasks) : taskList.tasks != null) return false;
        return name != null ? name.equals(taskList.name) : taskList.name == null;
    }


}

package br.com.tasks.model.DAO;

import br.com.tasks.model.POJO.Task;
import org.slf4j.Logger;

import javax.ws.rs.PathParam;
import java.util.List;

public class TaskDAO {

    public List<Task> list(){
        Task task = new Task();
        List<Task> taskList = task.listAll();

        return taskList;
    }

    public Task create(Task task) {
        Task newTask = new Task();
        newTask.setTitle(task.getTitle());
        newTask.setDescription(task.getDescription());
        newTask.setStartDate(task.getStartDate());
        newTask.setDueDay(task.getDueDay());
        newTask.setStatus(task.getStatus());

        newTask.persist();
        return newTask;
    }

    public Task update(Long id, Task task) {
        Task taskDatabase = Task.findById(id);
        taskDatabase.setTitle(task.getTitle());
        taskDatabase.setDescription(task.getDescription());
        taskDatabase.setStartDate(task.getStartDate());
        taskDatabase.setDueDay(task.getDueDay());
        taskDatabase.setStatus(task.getStatus());
        taskDatabase.persist();
        return taskDatabase;
    }

    public void delete(Long id){

        Task.deleteById(id);
    }
}

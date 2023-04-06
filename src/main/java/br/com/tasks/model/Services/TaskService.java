package br.com.tasks.model.Services;

import br.com.tasks.model.DAO.TaskDAO;
import br.com.tasks.model.POJO.Task;

import java.util.List;

public class TaskService {

    public List<Task> list(){
        TaskDAO taskDAO = new TaskDAO();
        return taskDAO.list();
    }

    public Task create(Task task){
        TaskDAO taskDAO = new TaskDAO();
        return taskDAO.create(task);
    }

    public Task update(Long id, Task task) {
        TaskDAO taskDAO = new TaskDAO();
        return taskDAO.update(id,task);
    }

    public void delete(Long id){
        TaskDAO taskDAO = new TaskDAO();
        taskDAO.delete(id);
    }

}

package br.com.tasks.controller;

import br.com.tasks.model.POJO.Task;
import br.com.tasks.model.Services.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/task")
public class TaskController {
    Logger logger = LoggerFactory.getLogger(TaskController.class);
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Task> list(){
        logger.info("Controller Listall");
        TaskService taskService = new TaskService();
        return taskService.list();
    }
    @POST
    @Transactional
    public Task create(Task task){
        logger.info("Controller create.");
        TaskService taskService = new TaskService();
        return taskService.create(task);
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Task update(@PathParam("id") Long id, Task task){
        logger.info("Controller update.");
        TaskService taskService = new TaskService();
        return taskService.update(id, task);
    }
    @DELETE
    @Path("/{id}")
    @Transactional
    public void delete(@PathParam("id") Long id){
        logger.info("Controller delete.");
        TaskService taskService = new TaskService();
        taskService.delete(id);
    }
}

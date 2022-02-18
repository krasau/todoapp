package com.application.ToDoApp.Controller;

import com.application.ToDoApp.Model.ToDoItem;
import com.application.ToDoApp.Repository.ToDoRepo;
import com.sun.istack.NotNull;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class ToDoController {

    @Autowired
    private ToDoRepo toDoRepo;

    @GetMapping(value="/all")
    public List<ToDoItem> findAll(){
        return toDoRepo.findAll();
    }

    @PostMapping(value="/new")
    public ToDoItem save(@NotNull @RequestBody ToDoItem toDoItem){
        return toDoRepo.save(toDoItem);
    }

    @PutMapping(value="/update")
    public ToDoItem update(@NotNull @RequestBody ToDoItem toDoItem){
        return toDoRepo.save(toDoItem);
    }

    @DeleteMapping(value="/delete/{id}")
    public void delete(@PathVariable long id){
        toDoRepo.deleteById(id);
    }
}

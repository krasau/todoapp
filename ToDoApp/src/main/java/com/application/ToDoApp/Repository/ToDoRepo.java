package com.application.ToDoApp.Repository;

import com.application.ToDoApp.Model.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepo extends JpaRepository<ToDoItem, Long> {
}

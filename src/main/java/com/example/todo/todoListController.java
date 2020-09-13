package com.example.todo;

import org.springframework.web.bind.annotation.*;

@RestController

public class todoListController {

    @PostMapping ("/todo-list")
        public String createTodoList() {
        return "Successfully created a new todo list  ";
    }

    @GetMapping ("/todo-list")
        public String viewTodoList() {
            return "Successfully viewed all todo list ";
    }

    @DeleteMapping ("/todo-list/{todo-list-Id}")
    public String deleteTodoList( @PathVariable ("todo-list-Id") String todoListId) {
        return "Successfully deleted todo list with Id " + todoListId;
    }

    @PutMapping ("/todo-list/{todo-list-Id}")
    public String modifiedTodoList( @PathVariable ("todo-list-Id") String todoListId) {
        return "Successfully modified todo list with Id " + todoListId;
    }

}

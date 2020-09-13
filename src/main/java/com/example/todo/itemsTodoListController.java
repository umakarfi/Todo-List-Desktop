package com.example.todo;

import org.springframework.web.bind.annotation.*;

@RestController

public class itemsTodoListController {

    @PostMapping ("/todo-list/{todo-list-Id}/item")
    public String createTodoListItem () {
        return "Successfully created a todo list item" ;
    }

    @GetMapping("/todo-list/{todo-list-Id}/item")
    public String createTodoListItem ( @PathVariable("todo-list-Id") String todoListId) {
        return "Successfully viewed all a todo list item under Id " + todoListId ;
    }

    @DeleteMapping ("/todo-list/{todo-list-Id}/item/{item-id}")
    public String deleteTodoListItem ( @PathVariable("item-id") String itemId) {
        return "Successfully deleted a todo list item with Id " + itemId ;
    }

    @PutMapping ("/todo-list/{todo-list-Id}/item/{item-id}")
    public String modifyTodoListItem ( @PathVariable("item-id") String itemId) {
        return "Successfully modified a todo list item with Id " + itemId ;
    }

}

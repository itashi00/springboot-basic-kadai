package com.example.springtutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.springtutorial.service.ToDoService;

@Controller
public class ToDoController {

    private final ToDoService service;

    public ToDoController(ToDoService service) {
        this.service = service;
    }

    @GetMapping("/todo")
    public String showToDoList(Model model) {
        model.addAttribute("todoList", service.findAll());
        return "todoView";
    }
}


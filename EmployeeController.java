package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private Map<Integer, String> employees = new HashMap<>();

    @GetMapping
    public Map<Integer, String> getAllEmployees() {
        return employees;
    }

    @PostMapping("/{id}")
    public String addEmployee(@PathVariable int id, @RequestBody String name) {
        employees.put(id, name);
        return "Employee added: " + name;
    }

    @PutMapping("/{id}")
    public String updateEmployee(@PathVariable int id, @RequestBody String name) {
        employees.put(id, name);
        return "Employee updated: " + name;
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id) {
        employees.remove(id);
        return "Employee removed with ID: " + id;
    }
}

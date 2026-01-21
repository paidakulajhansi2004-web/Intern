package com.example.intern.controller;

import com.example.intern.entity.Intern;
import com.example.intern.service.InternService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/interns")
public class InternController {

    private final InternService internService;

    public InternController(InternService internService) {
        this.internService = internService;
    }

    // POST
    @PostMapping
    public Intern createIntern(@RequestBody Intern intern) {
        return internService.saveIntern(intern);
    }

    // GET ALL
    @GetMapping
    public List<Intern> getAllInterns() {
        return internService.getAllInterns();
    }

    // GET BY ID
    @GetMapping("/{id}")
    public Intern getInternById(@PathVariable Long id) {
        return internService.getInternById(id);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteIntern(@PathVariable Long id) {
        internService.deleteIntern(id);
        return "Intern deleted successfully";
    }
}
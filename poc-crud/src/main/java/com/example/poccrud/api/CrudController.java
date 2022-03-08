package com.example.poccrud.api;

import com.example.poccrud.common.Intern;
import com.example.poccrud.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/crud/")
@RestController
public class CrudController {

    @Autowired
    private CrudService crudService;

    @GetMapping("interns")
    public List<Intern> getAllInterns() {
        return this.crudService.getAllInterns();
    }

    @GetMapping("intern/{firstName}")
    public Intern getAnInternByFirstName(@PathVariable String firstName){
        return this.crudService.getAnInternByFirstName(firstName);
    }

    @GetMapping("intern")
    public Intern getAnInternByFirstNameUsingRequestParam(@RequestParam String firstName){
        return this.crudService.getAnInternByFirstName(firstName);
    }

    @PostMapping("intern")
    public void addAnIntern(@RequestBody Intern intern) {
        this.crudService.addAnIntern(intern);
    }

    @DeleteMapping("intern/{idIntern}")
    public void deleteAnIntern(@PathVariable Long idIntern) {
        this.crudService.deleteAnIntern(idIntern);
    }

    @PutMapping("intern")
    public void updateAnIntern(@RequestBody Intern intern){
        this.crudService.updateAnIntern(intern);
    }
}

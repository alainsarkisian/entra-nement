package com.example.poccrud.service;

import com.example.poccrud.common.Intern;
import com.example.poccrud.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrudService {

    @Autowired
    private CrudRepository crudRepository;

    public List<Intern> getAllInterns() {
        return this.crudRepository.findAll();
    }

    public Intern getAnInternByFirstName(String firstName){
        return this.crudRepository.findByFirstName(firstName);
    }

    public void addAnIntern(Intern intern) {
        this.crudRepository.save(intern);
    }

    public void deleteAnIntern(Long idIntern) {
        this.crudRepository.deleteById(idIntern);
    }

    public void updateAnIntern(Intern intern) {
        this.crudRepository.saveAndFlush(intern);
    }
}

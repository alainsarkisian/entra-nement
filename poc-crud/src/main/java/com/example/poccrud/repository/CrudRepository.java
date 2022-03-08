package com.example.poccrud.repository;

import com.example.poccrud.common.Intern;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CrudRepository extends JpaRepository<Intern,Long> {

    @Query("SELECT intern FROM Intern intern WHERE intern.firstName = :firstName")
    Intern findByFirstName(@Param("firstName") String firstName);

}

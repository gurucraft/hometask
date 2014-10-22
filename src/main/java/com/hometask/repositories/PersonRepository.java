package com.hometask.repositories;

import com.hometask.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by guru on 21.10.14.
 * (@)Svitla Hata
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
    /*@Query("select p from Person p where p.firstName = :name")
    Person findByName(@Param("name") String name);*/
}

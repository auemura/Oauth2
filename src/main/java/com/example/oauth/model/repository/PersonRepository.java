package com.example.oauth.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.oauth.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}

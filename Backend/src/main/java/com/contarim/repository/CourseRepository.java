package com.contarim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.contarim.model.Course;

@Repository //indica que a interface é um repositório do Spring Data JPA, ou seja, ela irá conter os métodos para acessar o banco de dados e realizar as operações de CRUD na tabela de cursos

public interface CourseRepository extends JpaRepository<Course, Long> {

    
}

package com.imjustdoom.myboot.repository;

import com.imjustdoom.myboot.model.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleRepository extends JpaRepository<Example, Long> {
}

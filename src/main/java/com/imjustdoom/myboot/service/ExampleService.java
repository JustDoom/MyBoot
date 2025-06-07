package com.imjustdoom.myboot.service;

import com.imjustdoom.myboot.model.Example;
import com.imjustdoom.myboot.repository.ExampleRepository;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.Optional;

@Validated
@Service
public class ExampleService {
    private final ExampleRepository exampleRepository;

    public ExampleService(ExampleRepository exampleRepository) {
        this.exampleRepository = exampleRepository;
    }

    public Optional<Example> getExample(Long id) {
        return this.exampleRepository.findById(id);
    }

    public Example saveExample(Example example) {
        return this.exampleRepository.save(example);
    }
}

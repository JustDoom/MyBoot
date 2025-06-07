package com.imjustdoom.myboot.controller;

import com.imjustdoom.myboot.dto.out.SimpleExampleResponse;
import com.imjustdoom.myboot.model.Example;
import com.imjustdoom.myboot.service.ExampleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ExampleController {
    private final ExampleService exampleService;

    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @GetMapping("/add")
    public ResponseEntity<?> search(@RequestParam("value") String value) {
        this.exampleService.saveExample(new Example(value));
        return ResponseEntity.ok(SimpleExampleResponse.create(value));
    }
}

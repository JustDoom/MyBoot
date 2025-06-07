package com.imjustdoom.myboot.model;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import javax.validation.constraints.Size;

@Entity
public class Example {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Size(max = 255, message = "Value must not be over 255")
    @ColumnDefault("Hello There")
    private String value;

    protected Example() {}

    public Example(String value) {
        this.value = value;
    }

    public Long getId() {
        return this.id;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

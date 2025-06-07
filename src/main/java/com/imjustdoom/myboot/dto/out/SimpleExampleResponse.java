package com.imjustdoom.myboot.dto.out;

public record SimpleExampleResponse(String value) {
    public static SimpleExampleResponse create(String value) {
        return new SimpleExampleResponse(value);
    }
}

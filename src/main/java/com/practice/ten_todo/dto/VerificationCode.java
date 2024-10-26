package com.practice.ten_todo.dto;

public class VerificationCode {
    private final String code;

    public VerificationCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }
}

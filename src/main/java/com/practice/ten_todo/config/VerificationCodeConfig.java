package com.practice.ten_todo.config;

import com.practice.ten_todo.dto.VerificationCode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VerificationCodeConfig {

    @Bean
    public VerificationCode generateVerificationCode() {
        int verificationCode = (int)(Math.random() * 900000 + 100000);
        return new VerificationCode(String.valueOf(verificationCode));
    }
}

package com.practice.ten_todo.service.email;

import com.practice.ten_todo.dto.VerificationCode;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class WelcomeEmailSender {
    private final JavaMailSender javaMailSender;
    private final VerificationCode verificationCode;

    public WelcomeEmailSender(JavaMailSender javaMailSender, VerificationCode verificationCode) {
        this.javaMailSender = javaMailSender;
        this.verificationCode = verificationCode;
    }

    public void sendWelcomeEmail(String email, String username) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email);
        message.setSubject("Bienvenido a nuestra aplicación.");
        message.setText("Hola " + username + ", gracias por registrarte en nuestra aplicación." + "\n\nTu código de verificación es: " + verificationCode.getCode());
        javaMailSender.send(message);
        System.out.println("Correo de bienvenida enviado a: " + email);
    }
}

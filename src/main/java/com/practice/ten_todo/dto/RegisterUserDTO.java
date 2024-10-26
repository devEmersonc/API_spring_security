package com.practice.ten_todo.dto;

import com.practice.ten_todo.model.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

public class RegisterUserDTO {
    @NotBlank(message = "El nombre de usuario es obligatorio.")
    private String username;
    @NotBlank(message = "La contraseña es obligatoria.")
    private String password;
    @Email(message = "Ingresa un email válido.")
    @NotBlank(message = "El email es obligatorio.")
    private String email;
    private List<Role> roles;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}

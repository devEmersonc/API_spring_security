package com.practice.ten_todo.service;

import com.practice.ten_todo.dto.RegisterUserDTO;
import com.practice.ten_todo.dto.UserDTO;
import com.practice.ten_todo.model.User;

import java.util.List;

public interface UserService {
    List<UserDTO> getUsers();
    UserDTO getUser(Long id);
    void saveUser(RegisterUserDTO registerUserDTO);
    void updateUser(Long id, RegisterUserDTO registerUserDTO);
    void deleteUser(Long id);
    UserDTO convertEntityToDto(User user);
}

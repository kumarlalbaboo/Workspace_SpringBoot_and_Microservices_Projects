package com.llb.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.llb.dto.UserDTO;
import com.llb.entites.User;
import com.llb.repos.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(UserDTO dto) {
    	User user;

        if (dto.getId() != null) {
            user = userRepository.findById(dto.getId()).orElse(new User());
        } else {
            user = new User();
        }

        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setPhno(dto.getPhno());

        userRepository.save(user);
    }

    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public UserDTO getUserById(Long id) {
        return userRepository.findById(id).map(this::convertToDTO).orElse(null);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    private UserDTO convertToDTO(User user) {
        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());
        dto.setPhno(user.getPhno());
        return dto;
    }
}

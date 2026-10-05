package org.iths.repzillabe.user.service;

import lombok.RequiredArgsConstructor;
import org.iths.repzillabe.user.dto.UserRequestDTO;
import org.iths.repzillabe.user.dto.UserResponseDTO;
import org.iths.repzillabe.user.exceptions.UserNotFoundException;
import org.iths.repzillabe.user.mapper.UserMapper;
import org.iths.repzillabe.user.model.User;
import org.iths.repzillabe.user.repo.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    // Get User
    public UserResponseDTO findUser(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));
        return userMapper.toDTO(user);
    }

    // Create User
    public UserResponseDTO createUser(UserRequestDTO userRequestDTO) {
        User user = userMapper.toEntity(userRequestDTO);
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

        User savedUser = userRepository.save(user);
        return userMapper.toDTO(savedUser);
    }
}

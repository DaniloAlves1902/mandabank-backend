package br.com.connmandakaru.mandabank.service;

import br.com.connmandakaru.mandabank.dto.user.UserRequestDTO;
import br.com.connmandakaru.mandabank.dto.user.UserResponseDTO;
import br.com.connmandakaru.mandabank.entity.User;
import br.com.connmandakaru.mandabank.mapper.UserMapper; // Não esqueça desse import!
import br.com.connmandakaru.mandabank.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public List<UserResponseDTO> getAllUsers() {
        return userRepository.findAll().stream()
                .map(userMapper::toResponse)
                .toList();
    }

    public UserResponseDTO createUser(UserRequestDTO data) {
        User user = userMapper.toEntity(data);

        // FIXME: Implement BCrypt password encoding for security
        user.setPassword(data.password());

        User savedUser = userRepository.save(user);

        return userMapper.toResponse(savedUser);
    }
}
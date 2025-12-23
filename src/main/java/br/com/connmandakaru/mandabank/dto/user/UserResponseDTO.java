package br.com.connmandakaru.mandabank.dto.user;


import br.com.connmandakaru.mandabank.entity.User;

import java.util.UUID;

public record UserResponseDTO(
        UUID id,
        String firstName,
        String lastName,
        String email
) {

    public UserResponseDTO(User user) {
        this(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail());
    }

}

package br.com.connmandakaru.mandabank.dto.user;


import br.com.connmandakaru.mandabank.entity.User;
import br.com.connmandakaru.mandabank.entity.enums.user.UserRole;

import java.math.BigDecimal;

public record UserResponseDTO(
        String id,
        String firstName,
        String lastName,
        String email,
        UserRole role,
        BigDecimal balance
) {

    public UserResponseDTO(User user) {
        this(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getRole(), user.getBalance());
    }

}

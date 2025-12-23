package br.com.connmandakaru.mandabank.dto.auth;

public record AuthenticationDTO(
        String login,
        String password
) {
}
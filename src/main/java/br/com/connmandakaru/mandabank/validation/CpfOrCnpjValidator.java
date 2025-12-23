package br.com.connmandakaru.mandabank.validation;

import br.com.connmandakaru.mandabank.dto.user.UserRequestDTO;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CpfOrCnpjValidator implements ConstraintValidator<CpfOrCnpjRequired, UserRequestDTO> {

    @Override
    public boolean isValid(UserRequestDTO dto, ConstraintValidatorContext constraintValidatorContext) {
        if (dto == null) return false;

        boolean haveCpf = dto.cpf() != null && !dto.cpf().isBlank();
        boolean haveCnpj = dto.cnpj() != null && !dto.cnpj().isBlank();

        return haveCpf || haveCnpj;
    }
}

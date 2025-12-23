package br.com.connmandakaru.mandabank.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CpfOrCnpjValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface CpfOrCnpjRequired {
    String message() default "It is mandatory to provide your CPF (Brazilian individual taxpayer registration number) or" +
            " CNPJ (Brazilian company taxpayer registration number).";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

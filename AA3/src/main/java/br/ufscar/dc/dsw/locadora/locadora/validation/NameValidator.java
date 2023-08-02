package br.ufscar.dc.dsw.locadora.locadora.validation;

import org.springframework.stereotype.Component;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

@Component
public class NameValidator implements ConstraintValidator<Name, String> {

  @Override
  public boolean isValid(String name, ConstraintValidatorContext context) {
    System.out.println("Validating username: " + name);
    /*
     * ^ - start of string
     * [a-zA-Z]{4,} - 4 or more ASCII letters
     * (?: [a-zA-Z]+){0,2} - 0 to 2 occurrences of a space followed with one or more ASCII letters
     * $ - end of string.
     */
    return name.matches("^[a-zA-Zà-úÀ-Ú]{3,}(?: [a-zA-Zà-úÀ-Ú]+){1,}$");
  }
}
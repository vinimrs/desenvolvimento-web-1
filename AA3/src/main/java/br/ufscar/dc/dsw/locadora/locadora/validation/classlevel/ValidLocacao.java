package br.ufscar.dc.dsw.locadora.locadora.validation.classlevel;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = UniqueDataHourClientValidator.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidLocacao {
  String message() default "There is already a bike registered for that client on that date and time";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}

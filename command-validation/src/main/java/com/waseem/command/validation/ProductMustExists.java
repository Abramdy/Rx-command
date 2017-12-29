package com.waseem.command.validation;

import com.waseem.command.validation.validator.ProductMustExistsValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by khan on 12/29/17.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Constraint(validatedBy = {ProductMustExistsValidator.class})
@Documented
public @interface ProductMustExists {
  String message() default "ProductMustExists";

  Class<?>[] group() default {};

  Class<? extends Payload>[] payload() default {};

  String[] path() default {};
}

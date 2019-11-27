package com.customs;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
@Constraint(validatedBy = {IsNotNullValid.class})
public @interface IsNotNull {
    String message() default "this values id not null!!!";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}

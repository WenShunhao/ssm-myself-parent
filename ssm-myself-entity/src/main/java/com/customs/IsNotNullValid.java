package com.customs;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class IsNotNullValid implements ConstraintValidator<IsNotNull,String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        System.out.println("IsNotNullValid");
        if (value == null || value.equals("")){
            return false;
        }else {
            return  true;
        }
    }
}




package com.example.demo.validation.implementations;

import com.example.demo.domain.model.UserServiceModel;
import com.example.demo.validation.UserValidationService;
import org.springframework.stereotype.Component;

@Component
public class UserValidationServiceImpl implements UserValidationService {
    @Override
    public boolean isValid(UserServiceModel user) {
        return user != null;
    }
}

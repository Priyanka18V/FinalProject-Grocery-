package com.example.demo.validation;

import com.example.demo.domain.model.UserServiceModel;

public interface UserValidationService {
    boolean isValid(UserServiceModel user);
}

package com.example.demo.validation;

import com.example.demo.domain.Product;
import com.example.demo.domain.model.ProductServiceModel;

public interface ProductValidationService {
    boolean isValid(Product product);

    boolean isValid(ProductServiceModel product);
}

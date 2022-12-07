package com.example.demo.validation;

import com.example.demo.domain.Receipt;
import com.example.demo.domain.model.ReceiptServiceModel;

public interface ReceiptValidationService {
    boolean isValid(Receipt receipt);

    boolean isValid(ReceiptServiceModel receiptServiceModel);
}

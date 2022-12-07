package com.example.demo.validation.implementations;

import org.springframework.stereotype.Component;

import com.example.demo.domain.Receipt;
import com.example.demo.domain.model.ReceiptServiceModel;
import com.example.demo.validation.ReceiptValidationService;

@Component
public class ReceiptValidationServiceImpl implements ReceiptValidationService {
    @Override
    public boolean isValid(Receipt receipt) {
        return receipt != null;
    }

    @Override
    public boolean isValid(ReceiptServiceModel receiptServiceModel) {
        return receiptServiceModel != null;
    }
}

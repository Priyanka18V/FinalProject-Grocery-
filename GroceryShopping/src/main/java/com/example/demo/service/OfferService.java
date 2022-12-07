package com.example.demo.service;

import com.example.demo.domain.model.OfferServiceModel;

import java.util.List;

public interface OfferService {

    List<OfferServiceModel> findAllOffers();
}

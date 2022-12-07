package com.example.demo.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.demo.domain.model.ProductServiceModel;

public interface ProductService {

    ProductServiceModel createProduct(ProductServiceModel productServiceModel,
                                      MultipartFile image) throws IOException;

    List<ProductServiceModel> findAllProducts();

    ProductServiceModel findProductById(String id);

    List<ProductServiceModel> findProductsByPartOfName(String name);

    ProductServiceModel editProduct(String id, ProductServiceModel productServiceModel,
                                    boolean isNewImageUploaded, MultipartFile image) throws IOException;

    void deleteProduct(String id);

    List<ProductServiceModel> findAllByCategory(String category);

    List<ProductServiceModel> findAllFilteredProducts();

    List<ProductServiceModel> findAllByCategoryFilteredProducts(String category);
}

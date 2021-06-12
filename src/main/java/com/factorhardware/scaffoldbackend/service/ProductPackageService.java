package com.factorhardware.scaffoldbackend.service;

import com.factorhardware.scaffoldbackend.model.ProductPackage;
import com.factorhardware.scaffoldbackend.repository.ProductPackageRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductPackageService {

    @Autowired
    private ProductPackageRepository productPackageRepository;

    public Iterable<ProductPackage> getAllProductPackages() {
        return productPackageRepository.findAll();
    }

    //Gets all packages by userEmail and creates a json of the package names
    public String getUserPackages(String userEmail){
        ArrayList<ProductPackage> userProducts =(ArrayList<ProductPackage>) productPackageRepository.findByUserEmail(userEmail);
        ArrayList<String> productNames = new ArrayList<>();
        for (ProductPackage product: userProducts) {
            productNames.add(product.getPackageName());
        }
        return new Gson().toJson(productNames);
    }
    //Saves a product package to database
    public void save(ProductPackage product){
        productPackageRepository.save(product);
    }
    //Takes in product package json, maps it to the Product Package entity and saves to database
    public void save(String productJson) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        ProductPackage product = objectMapper.readValue(productJson, ProductPackage.class);
        productPackageRepository.save(product);
    }
    //Returns a json of package details.
    public String getPackageDetails(String packageName) {
       ProductPackage product = productPackageRepository.findByPackageName(packageName);
       return  new Gson().toJson(product.toString());
    }
}

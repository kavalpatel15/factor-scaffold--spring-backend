package com.factorhardware.scaffoldbackend.controller;


import com.factorhardware.scaffoldbackend.service.ProductPackageService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    ProductPackageService productService;

    //Get endpoint which requires an email an will return a list of all package names listed under that email address
    @ResponseBody
    @RequestMapping(value = "/getUserPackages", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getUserPackages(@RequestParam(value = "userEmail", required = true) String userEmail){
        return productService.getUserPackages(userEmail);
    }

    // GET endpoint that will retrieve all the details for a given package name
    @ResponseBody
    @RequestMapping(value = "/getPackageDetails", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getPackageDetails(@RequestParam(value = "packageName", required = true) String packageName){
        return productService.getPackageDetails(packageName);
    }

    //POST request that will add a new package to the database, requires a JSON string in the Request body.
    @PostMapping(value = "/addNewPackage")
    @ResponseStatus(HttpStatus.OK)
    public void postNewPackage(@RequestBody String packageDetailJson) throws JsonProcessingException {
        productService.save(packageDetailJson);
    }

}

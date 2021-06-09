package com.factorhardware.scaffoldbackend.controller;


import com.factorhardware.scaffoldbackend.model.Users;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    Users pojo;

    @ResponseBody
    @RequestMapping(value = "/getUserPackages", method = RequestMethod.GET, produces = "application/json")
    public String getUserPackages(@RequestParam(value = "userName", required = true) String userName){

        return "";
    }


}

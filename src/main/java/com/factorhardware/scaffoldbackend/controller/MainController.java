package com.factorhardware.scaffoldbackend.controller;


import com.factorhardware.scaffoldbackend.POJOs.UserPojo;
import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;

@RestController
public class MainController {

    UserPojo pojo;

    @ResponseBody
    @RequestMapping(value = "/getDetails", method = RequestMethod.GET, produces = "application/json")
    public UserPojo getDetails(@RequestParam(value = "userId", required = true) String userId){
        pojo = new UserPojo();

        return pojo;
    }


}

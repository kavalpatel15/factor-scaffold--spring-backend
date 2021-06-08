package com.factorhardware.scaffoldbackend.controller;


import com.factorhardware.scaffoldbackend.POJOs.TestPOJO;
import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;

@RestController
public class MainController {

    TestPOJO pojo;

    @ResponseBody
    @RequestMapping(value = "/getDetails", method = RequestMethod.GET, produces = "application/json")
    public TestPOJO getDetails(@RequestParam(value = "loanNumber", required = true) String loanNumber){
        System.out.println(loanNumber);
        pojo = new TestPOJO();
        pojo.setLoanNumber(Integer.parseInt(loanNumber));
        pojo.setDollarAmount(BigDecimal.valueOf(123.123));
        return pojo;
    }
}

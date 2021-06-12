package com.factorhardware.scaffoldbackend.controller;

import com.factorhardware.scaffoldbackend.model.ProductPackage;
import com.factorhardware.scaffoldbackend.service.ProductPackageService;
import com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class MainControllerTests {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    ProductPackageService productService;

    @Test
    public void addPackageTest() throws Exception {
        String samplePackageJSON =
                "'userEmail' : 'emilyDiaz1@gmail.com', " +
                "'packageName' :  'Test Package8', " +
                "'fileNames' :  'hello.txt', " +
                "'requestedQuantity' :  '10,20,30', " +
                "'dueDate' :  06/12/2021, " +
                "'description' :  'This is a test package'";
        this.mockMvc.perform(MockMvcRequestBuilders.post("/addNewPackage").content(samplePackageJSON))
                .andDo(print())
                .andExpect(status().isOk());
    }


}

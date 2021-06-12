package com.factorhardware.scaffoldbackend;

import com.factorhardware.scaffoldbackend.model.ProductPackage;
import com.factorhardware.scaffoldbackend.model.User;
import com.factorhardware.scaffoldbackend.repository.UserRepository;
import com.factorhardware.scaffoldbackend.service.ProductPackageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@SpringBootApplication
public class ScaffoldBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScaffoldBackendApplication.class, args);
    }

    @Bean
    public String setup(UserRepository userRepository, ProductPackageService productService) throws Exception{
        // Adding users to the H2 data base.
        userRepository.save(new User("Alex","Smith", "asmith@gmail.com"));
        userRepository.save(new User("Josh","Smith", "jsmith@gmail.com"));
        userRepository.save(new User("John","Doe", "jDoe@gmail.com"));
        userRepository.save(new User("Emily ", "Diaz", "emilyDiaz1@gmail.com"));
        userRepository.save(new User("Jane", "Doe", "jDoe2@gmail.com"));
        userRepository.save(new User("Maria", "Perry", "MariaPerry@gmail.com"));
        userRepository.save(new User("Jane", "Perry", "jPerry@gmail.com"));

        System.out.println("=================================");
        System.out.println("User Information");
        System.out.println("=================================");
        for(User user: userRepository.findAll()){
            System.out.println(user.toString());
        }

        //Adding some test packages
        productService.save(new ProductPackage("asmith@gmail.com","Test Package","hello.txt",
                "10,20,30","06/12/2021" , "This is a test package"));
        productService.save(new ProductPackage("jDoe2@gmail.com","Test Package2","hello.txt",
                "10,20,30","06/12/2021" , "This is a test package"));
        productService.save(new ProductPackage("jsmith@gmail.com","Test Package3","hello.txt",
                "10,20,30","06/12/2021" , "This is a test package"));
        productService.save(new ProductPackage("MariaPerry@gmail.com","Test Package4","hello.txt",
                "10,20,30","06/12/2021" , "This is a test package"));
        productService.save(new ProductPackage("asmith@gmail.com","Test Package5","hello.txt",
                "10,20,30","06/12/2021" , "This is a test package"));

        System.out.println("=================================");
        System.out.println("Product Package Information");
        System.out.println("=================================");

        for (ProductPackage p: productService.getAllProductPackages()) {
            System.out.println(p.toString());
        }
        return "Data setup done";
    }
}

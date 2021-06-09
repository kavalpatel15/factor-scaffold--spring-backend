package com.factorhardware.scaffoldbackend;

import com.factorhardware.scaffoldbackend.model.Users;
import com.factorhardware.scaffoldbackend.repository.UsersRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ScaffoldBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScaffoldBackendApplication.class, args);
    }

    @Bean
    public String demo(UsersRepository repository){
        repository.save(new Users("Alex","Poly", "alexploy@gmail.com"));
        repository.save(new Users("Josh","Guru", "guru007@gmail.com"));
        repository.save(new Users("Kareem","Jeebs", "jeebs@gmail.com"));
        repository.save(new Users("Yash", "Trvd", "trvd@gmail.com"));

        System.out.println("Users Saved");
        System.out.println("-------------------------------------");
        for(Users user: repository.findAll()){
            System.out.println(user.toString());
        }
        return  "";
    }
}

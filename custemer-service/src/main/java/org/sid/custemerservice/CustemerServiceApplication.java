package org.sid.custemerservice;

import org.sid.custemerservice.entites.Customer;
import org.sid.custemerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CustemerServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustemerServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner start (CustomerRepository customerRepository , RepositoryRestConfiguration restConfiguration){
        restConfiguration.exposeIdsFor(Customer.class);
        return args -> {
            customerRepository.save(new Customer(null , "achraf","achrafhamid@gmail.com"));
            customerRepository.save(new Customer(null , "omar","omard@gmail.com"));
            customerRepository.save(new Customer(null , "zohair","zohair@gmail.com"));
            customerRepository.findAll().forEach(c->{
                System.out.println(c.toString());
            });

        };

    }
}



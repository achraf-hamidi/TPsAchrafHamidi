package org.sid.inventoryservice;

import org.sid.inventoryservice.Entites.Product;
import org.sid.inventoryservice.repositories.ProductsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(ProductsRepository productsRepository, RepositoryRestConfiguration restConfiguration){
		restConfiguration.exposeIdsFor(Product.class);
		return args -> {
			productsRepository.save(new Product(null,"Smart Tv ",10000.0,500));
			productsRepository.save(new Product(null,"Hp laptop ",50000.0,10));
			productsRepository.save(new Product(null,"Iphone",10000.0,1000));
			productsRepository.findAll().forEach(p -> {
				System.out.println(p.getName());
			});

		};
	}

}


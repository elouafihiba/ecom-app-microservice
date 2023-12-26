package org.iir.customerservice;
import org.iir.customerservice.entities.Customer;
import org.iir.customerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CustomerRepository customerRepository){
		return args -> {
		customerRepository.saveAll(List.of(
				Customer.builder().name("Hiba").email("hiba@gmail.com").build(),
				Customer.builder().name("Samah").email("samah@gmail.com").build(),
				Customer.builder().name("Yassmine").email("yassmine@gmail.com").build()

		));
		customerRepository.findAll().forEach(System.out::println);
		};
	}

}

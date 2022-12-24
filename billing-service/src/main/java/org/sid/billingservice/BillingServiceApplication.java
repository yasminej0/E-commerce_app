package org.sid.billingservice;

import org.sid.billingservice.entities.Bill;
import org.sid.billingservice.entities.ProductItem;
import org.sid.billingservice.enums.BillStatus;
import org.sid.billingservice.feign.CustomerRestClient;
import org.sid.billingservice.feign.ProductItemRestClient;
import org.sid.billingservice.model.Customer;
import org.sid.billingservice.model.Product;
import org.sid.billingservice.repository.BillRepository;
import org.sid.billingservice.repository.ProductItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.hateoas.PagedModel;
import lombok.Builder;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Random;

@EnableFeignClients
@SpringBootApplication
public class BillingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillingServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(
			BillRepository orderRepository,
			ProductItemRepository productItemRepository,
			CustomerRestClient customerRestClientService,
			ProductItemRestClient inventoryRestClientService){
		return args -> {
			Customer customer = customerRestClientService.customerById(1L);
			Bill bill = orderRepository.save(new Bill(null,new Date(),null,null,customer.getId(),null));
			PagedModel<Product> products = inventoryRestClientService.pageProducts(0,3);
			products.forEach(
					product -> {
						ProductItem productItem = new ProductItem();
						productItem.setPrice(product.getPrice());
						productItem.setQuantity(new Random().nextInt(100)); // nbr aléatoire entre 1 et 101
						productItem.setBill(bill);
						productItem.setProductID(product.getId());
						productItemRepository.save(productItem);

					}
			);
			System.out.println("------------------------");
			System.out.println(customer.getId());
			System.out.println(customer.getEmail());
			System.out.println(customer.getName());


		};
	}

}

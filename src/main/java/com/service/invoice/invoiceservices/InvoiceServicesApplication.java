package com.service.invoice.invoiceservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.service")
@SpringBootApplication
public class InvoiceServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvoiceServicesApplication.class, args);
	}
}

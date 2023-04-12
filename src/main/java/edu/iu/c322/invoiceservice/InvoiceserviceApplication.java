package edu.iu.c322.invoiceservice;

import edu.iu.c322.invoiceservice.model.Invoice;
import edu.iu.c322.invoiceservice.model.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
public class InvoiceserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InvoiceserviceApplication.class, args);
    }



}


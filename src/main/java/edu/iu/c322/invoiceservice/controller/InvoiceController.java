package edu.iu.c322.invoiceservice.controller;


import edu.iu.c322.invoiceservice.model.Invoice;


import edu.iu.c322.invoiceservice.repository.InvoiceRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {


    private final InvoiceRepository invoiceRepository;

    public InvoiceController(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }



    @GetMapping("/{orderId}")
    public Invoice findByOrderId(@PathVariable int orderId){

        Optional<Invoice> invoice = invoiceRepository.findById(orderId);
        Invoice foundInvoice = invoice.get();
        // add the rest of the data items
        return foundInvoice;
    }

}

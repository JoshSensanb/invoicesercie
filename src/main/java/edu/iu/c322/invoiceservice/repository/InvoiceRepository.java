package edu.iu.c322.invoiceservice.repository;

import edu.iu.c322.invoiceservice.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice,Integer> {


}

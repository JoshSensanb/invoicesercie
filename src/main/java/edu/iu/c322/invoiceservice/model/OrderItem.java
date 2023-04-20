package edu.iu.c322.invoiceservice.model;

public record OrderItem(int id,
                        String name,
                        int quantity,
                        float price) {
}

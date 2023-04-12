package edu.iu.c322.invoiceservice.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class InvoiceItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String status;
    @OneToMany
    private List<Items> invoiceItem;
    private String on;




    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    public String getOn() {
        return on;
    }

    public void setOn(String on) {
        this.on = on;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Items> getInvoiceItem() {
        return invoiceItem;
    }

    public void setInvoiceItem(List<Items> invoiceItem) {
        this.invoiceItem = invoiceItem;
    }


}

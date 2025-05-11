package org.ibm.payment.processor.childsupport.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//@Entity
//public class Payment {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private Double amount;
//    private String method;
//    private String status;
//
//    public Payment() {}
//
//    public Payment(Double amount, String method, String status) {
//        this.amount = amount;
//        this.method = method;
//        this.status = status;
//    }
//
//    // Getters & Setters
//    public Long getId() { return id; }
//    public void setId(Long id) { this.id = id; }
//
//    public Double getAmount() { return amount; }
//    public void setAmount(Double amount) { this.amount = amount; }
//
//    public String getMethod() { return method; }
//    public void setMethod(String method) { this.method = method; }
//
//    public String getStatus() { return status; }
//    public void setStatus(String status) { this.status = status; }
//}
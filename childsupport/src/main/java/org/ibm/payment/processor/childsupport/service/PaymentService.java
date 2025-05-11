package org.ibm.payment.processor.childsupport.service;

//import org.ibm.payment.processor.childsupport.domain.Payment;
//import org.ibm.payment.processor.childsupport.repository.PaymentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
//public class PaymentService {
//
//    private final PaymentRepository paymentRepository;
//
//    public PaymentService(PaymentRepository paymentRepository) {
//        this.paymentRepository = paymentRepository;
//    }
//
//    public List<Payment> getAllPayments() {
//        return paymentRepository.findAll();
//    }
//
//    public Payment processPayment(Double amount, String method) {
//        Payment payment = new Payment(amount, method, "Completed");
//        return paymentRepository.save(payment);
//    }
//
//
//    public List<Payment> getPaymentsAboveAmount(Double amount) {
//            return paymentRepository.findPaymentsAboveAmount(amount);
//
//    }
//}

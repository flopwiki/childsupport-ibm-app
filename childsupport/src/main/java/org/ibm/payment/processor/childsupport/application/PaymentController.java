package org.ibm.payment.processor.childsupport.application;

import org.ibm.payment.processor.childsupport.domain.Payment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/process")
    public String createPayment(@RequestBody Payment payment) {
        paymentService.processPayment(payment);
        return "Payment process successfully";
    }

    @GetMapping("/{id}")
    public Payment getPayment(@PathVariable Long id) {
        return paymentService.getPaymentById(id);
    }

}
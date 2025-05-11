package org.ibm.payment.processor.childsupport.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;


@Controller
public class PaymentsController {
    @GetMapping("/payments")
    public String showPaymentsPage() {
        return "payments"; // Maps to payments.html inside templates/
    }
}


//@RestController
//@RequestMapping("/api/payments")
//public class PaymentsController {
//
//    private final PaymentService paymentService;
//
//    public PaymentsController(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }
//
//    @GetMapping
//    public List<Payment> getAllPayments() {
//        return paymentService.getAllPayments();
//    }
//
//    @PostMapping
//    public Payment makePayment(@RequestParam Double amount, @RequestParam String method) {
//        return paymentService.processPayment(amount, method);
//    }
//}

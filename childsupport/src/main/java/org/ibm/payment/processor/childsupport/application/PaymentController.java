//package org.ibm.payment.processor.childsupport.application;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//@RequestMapping("/payments")
//public class PaymentController {
//    private final PaymentService paymentService;
//
//    @Autowired
//    public PaymentController(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }
//
//    @GetMapping("/make")
//    @PreAuthorize("hasRole('PAYER')")
//    public String showPaymentForm(Model model) {
//        model.addAttribute("payment", new PaymentDTO());
//        return "payments/make-payment";
//    }
//
//    @PostMapping("/process")
//    @PreAuthorize("hasRole('PAYER')")
//    public String processPayment(@ModelAttribute PaymentDTO paymentDTO) {
//        paymentService.makePayment(paymentDTO);
//        return "redirect:/payments/history";
//    }
//
//    @GetMapping("/history")
//    public String paymentHistory(Model model, Authentication authentication) {
//        User user = ((UserDetailsImpl) authentication.getPrincipal()).getUser();
//        List<Payment> payments;
//
//        if (user.getRole() == User.UserRole.PAYER) {
//            payments = paymentService.getPaymentsByPayer(user.getId());
//        } else if (user.getRole() == User.UserRole.PAYEE) {
//            payments = paymentService.getPaymentsByPayee(user.getId());
//        } else {
//            // Admin can see all payments
//            payments = paymentService.getAllPayments();
//        }
//
//        model.addAttribute("payments", payments);
//        return "payments/payment-history";
//    }
//}

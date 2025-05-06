//package org.ibm.payment.processor.childsupport.application;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class PaymentService {
//    private final PaymentRepository paymentRepository;
//    private final CaseService caseService;
//
//    @Autowired
//    public PaymentService(PaymentRepository paymentRepository, CaseService caseService) {
//        this.paymentRepository = paymentRepository;
//        this.caseService = caseService;
//    }
//
//    public Payment makePayment(PaymentDTO paymentDTO) {
//        // Implement payment processing logic
//        Payment payment = new Payment();
//        payment.setChildSupportCase(caseService.getCaseById(paymentDTO.getCaseId()));
//        payment.setAmount(paymentDTO.getAmount());
//        payment.setPaymentDate(LocalDateTime.now());
//        payment.setPaymentMethod(paymentDTO.getPaymentMethod());
//        payment.setStatus(Payment.PaymentStatus.COMPLETED);
//        payment.setTransactionId(generateTransactionId());
//        payment.setCreatedAt(LocalDateTime.now());
//        payment.setUpdatedAt(LocalDateTime.now());
//
//        return paymentRepository.save(payment);
//    }
//
//    public List<Payment> getPaymentsByCase(Long caseId) {
//        return paymentRepository.findByChildSupportCase_Id(caseId);
//    }
//
//    public List<Payment> getPaymentsByPayer(Long payerId) {
//        return paymentRepository.findByChildSupportCase_PayerId(payerId);
//    }
//
//    public List<Payment> getPaymentsByPayee(Long payeeId) {
//        return paymentRepository.findByChildSupportCase_PayeeId(payeeId);
//    }
//
//    public List<Payment> getOverduePayments() {
//        return paymentRepository.findByDueDateBeforeAndStatus(
//                LocalDate.now(), Payment.PaymentStatus.PENDING);
//    }
//
//    private String generateTransactionId() {
//        // Implement transaction ID generation logic
//        return "TXN" + System.currentTimeMillis();
//    }
//}
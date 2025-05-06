//package org.ibm.payment.processor.childsupport.repository;
//
//import org.ibm.payment.processor.childsupport.domain.Payment;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//import java.time.LocalDate;
//import java.util.List;
//
//@Repository
//public interface PaymentRepository extends JpaRepository<Payment, Long> {
//    List<Payment> findByChildSupportCase_Id(Long caseId);
//    List<Payment> findByChildSupportCase_PayerId(Long payerId);
//    List<Payment> findByChildSupportCase_PayeeId(Long payeeId);
//    List<Payment> findByDueDateBeforeAndStatus(LocalDate date, Payment.PaymentStatus status);
//}
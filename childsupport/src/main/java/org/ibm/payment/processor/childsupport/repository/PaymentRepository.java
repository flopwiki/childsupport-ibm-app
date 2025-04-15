package org.ibm.payment.processor.childsupport.repository;

import org.ibm.payment.processor.childsupport.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository {

    void save(Payment payment);


}
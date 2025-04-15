package org.ibm.payment.processor.childsupport.repository;

import org.ibm.payment.processor.childsupport.domain.Payment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;


@Repository
public interface PaymentRepository {

    void save(Payment payment);

}
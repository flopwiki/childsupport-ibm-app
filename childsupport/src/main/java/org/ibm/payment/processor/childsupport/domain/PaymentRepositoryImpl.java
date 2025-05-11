package org.ibm.payment.processor.childsupport.domain;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
//public class PaymentRepositoryImpl implements PaymentRepositoryCustom {
//
//    private final EntityManager entityManager;
//
//    public PaymentRepositoryImpl(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }
//
//    @Override
//    public List<Payment> findPaymentsAboveAmount(Double amount) {
//        String query = "SELECT p FROM Payment p WHERE p.amount > :amount";
//        TypedQuery<Payment> typedQuery = entityManager.createQuery(query, Payment.class);
//        typedQuery.setParameter("amount", amount);
//        return typedQuery.getResultList();
//    }
//}


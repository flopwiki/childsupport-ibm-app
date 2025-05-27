package org.ibm.payment.processor.childsupport.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.Instant;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @CreatedDate
    @Column(name = "created_at", updatable = false)
    private Instant createdAt;

    public enum Role {
        ADMIN, CASE_WORKER, PAYER, RECIPIENT
    }
}

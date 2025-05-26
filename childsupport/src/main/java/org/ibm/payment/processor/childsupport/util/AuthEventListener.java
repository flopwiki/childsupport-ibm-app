package org.ibm.payment.processor.childsupport.util;

import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.*;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Component
public class AuthEventListener {

    @EventListener
    public void onSuccess(AuthenticationSuccessEvent event) {
        String username = event.getAuthentication().getName();
        log.info(" Login SUCCESS for user: {}", username);
    }

    @EventListener
    public void onFailure(AbstractAuthenticationFailureEvent event) {
        String username = (String) event.getAuthentication().getPrincipal();
        String reason = event.getException().getMessage();
        log.warn(" Login FAILURE for user: {} - Reason: {}", username, reason);
    }

    @EventListener
    public void onLogout(LogoutSuccessEvent event) {
        String username = event.getAuthentication().getName();
        log.info(" Logout SUCCESS for user: {}", username);
    }
}

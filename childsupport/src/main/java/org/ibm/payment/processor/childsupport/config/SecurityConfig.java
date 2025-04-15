package org.ibm.payment.processor.childsupport.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/").permitAll()  // Public access
                        .anyRequest().authenticated()      // All others need auth
                )
                .formLogin(form -> form
                        .defaultSuccessUrl("/home")
                );
        return http.build();
    }
}
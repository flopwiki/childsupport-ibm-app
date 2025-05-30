package org.ibm.payment.processor.childsupport.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests(authorize -> authorize
//                        .requestMatchers("/", "/payments", "/help", "/login", "/error", "/css/**", "/js/**").permitAll()
//                        .requestMatchers("/admin/**").hasRole("ADMIN")
//                        .anyRequest().authenticated()
//                )
//             .formLogin(withDefaults()
////                .formLogin(form -> form
////                        .loginPage("/login.html")
////                        .defaultSuccessUrl("/")
////                        .failureUrl("/login?error=true")
////                        .permitAll()
//                )
//                .logout(withDefaults());
////                .logout(logout -> logout
////                        .logoutSuccessUrl("/login.html?logout=true")
////                        .permitAll()
////                );
//
//        return http.build();
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
}
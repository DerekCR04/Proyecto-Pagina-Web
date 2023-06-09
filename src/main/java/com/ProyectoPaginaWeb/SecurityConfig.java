//
//package com.ProyectoPaginaWeb;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig{
//
//    @Bean
//    public UserDetailsService userDetailsService() {
//        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//        manager.createUser(User.withUsername("admin")
//                .password("{noop}123")
//                .roles("ADMIN")
//                .build());
//        return manager;
//    }
//    
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http)
//            throws Exception {
//        http
//                .authorizeHttpRequests((requests) -> requests
//                .requestMatchers(
//                        "/",
//                        "/index",
//                        "/webjars/**").permitAll()
//                .requestMatchers(
//                        "/agenda/nuevo",
//                        "/agenda/guardar",
//                        "/historial/**",
//                        "/videos/nuevo/**",
//                        "/galeria/fotos")
//                .hasRole("ADMIN")
//                )
//                .formLogin((form) -> form
//                .loginPage("/login")
//                .permitAll())
//                .exceptionHandling()
//                .accessDeniedPage("/errores/403");
//        return http.build();
//    }
//}
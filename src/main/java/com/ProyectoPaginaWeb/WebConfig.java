/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoPaginaWeb;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author User
 */
@Configuration
public class WebConfig implements WebMvcConfigurer{
    
//    @Override
//    public void addInterceptors(InterceptorRegistry registro) {
//        registro.addInterceptor(localeChangeInterceptor());
//    }
    
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/")
                .setViewName("index");
        registry.addViewController("/index")
                .setViewName("index");
        registry.addViewController("/login")
                .setViewName("login");

    }
}

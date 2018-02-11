package com.sda.juniorjavajobfinder.groupproject.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/register").setViewName("register");
        registry.addViewController("/announcement").setViewName("announcement");
        registry.addViewController("/company").setViewName("company");
        registry.addViewController("/addingannouncement").setViewName("addannouncement");
        registry.addRedirectViewController("/home", "/");
    }
}
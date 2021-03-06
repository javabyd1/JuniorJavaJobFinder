package com.sda.juniorjavajobfinder.groupproject.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.InMemoryUserDetailsManagerConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        InMemoryUserDetailsManagerConfigurer<AuthenticationManagerBuilder>
                userManager = auth.inMemoryAuthentication();

        // Natalia Lewandowska
        userManager
                .withUser("Natalia")
                .password("nl")
                .roles("USER", "ADMIN");

        // Dariusz Rozanski
        userManager
                .withUser("Dariusz")
                .password("dr")
                .roles("USER", "ADMIN");

        // Pawel Orlowski
        userManager
                .withUser("Pawel")
                .password("po")
                .roles("USER", "ADMIN");

        // Marcin Kroszel
        userManager
                .withUser("Marcin")
                .password("mk")
                .roles("USER", "ADMIN");

        // Bartosz Janczak
        userManager
                .withUser("Bartosz")
                .password("bj")
                .roles("USER", "ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
             .authorizeRequests()
                .antMatchers("/login","/register").permitAll()
                .anyRequest().authenticated()
                .and()
             .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("http://localhost:8888/")
                .failureUrl("/login.html?error=true")
                .and()
             .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login");

        http.csrf().disable();
        http.headers().frameOptions().disable();
    }
}
package com.cts.microcredential.ApiGateway.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.UserDetailsManagerConfigurer.UserDetailsBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class ApiGatewaySecurity extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
                .withUser("user").password("{noop}newuser").roles("USER")
                .and()
                .withUser("admin").password("{noop}newadmin").roles("USER", "ADMIN");
        
//        UserDetailsBuilder builder = auth.inMemoryAuthentication().

    }

    // Secure the endpoins with HTTP Basic authentication
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                //HTTP Basic authentication
                .httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/service/perimumservice/**").hasRole("USER")
                .antMatchers(HttpMethod.POST, "/service/perimumservice/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/service/fileaclaim/**").hasRole("USER")
                .antMatchers(HttpMethod.POST, "/service/fileaclaim/**").hasRole("ADMIN")
                .and()
                .csrf().disable()
                .formLogin().disable();
    }

}

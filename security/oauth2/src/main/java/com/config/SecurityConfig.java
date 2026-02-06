package com.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import  org.springframework.security.authentication.*;
// @Configuration
// @Order(1)
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Value("${security.username}")
	 private String username;
	 
	 @Value("${security.pwd}")
	 private String pwd;
	 
	 @Value("${security.role}")
	 private String role;
	 
	 
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	http.csrf().disable()
    	.authorizeRequests()
    	.antMatchers("/login","/oauth/authorize").authenticated()
    	.anyRequest().permitAll().and().formLogin().permitAll();
    }
 
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    	
    	auth.inMemoryAuthentication().passwordEncoder(passwordEncoder()).withUser(username)
    	.password(passwordEncoder().encode(pwd)).roles(role);
        
    }
    
    @Override
    @Bean
    public org.springframework.security.authentication.AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

     
    @Bean
    public BCryptPasswordEncoder passwordEncoder(){ 
        return new BCryptPasswordEncoder(); 
    }
}

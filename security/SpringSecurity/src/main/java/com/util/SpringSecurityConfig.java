package com.util;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
@SuppressWarnings("deprecation")
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
    
	@Autowired
    private DataSource datasource;
    
   @Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
    	
    	auth.jdbcAuthentication().dataSource(datasource).passwordEncoder(NoOpPasswordEncoder.getInstance()).usersByUsernameQuery("SELECT uname, pwd, enabled FROM login WHERE uname=?")
    	.authoritiesByUsernameQuery("SELECT uname, pwd, role FROM login WHERE uname=?");
    	
    }
 
    @Override
    protected void configure(HttpSecurity http) throws Exception   	{
    	
    	http
    	.authorizeHttpRequests()
    	.anyRequest().authenticated()
    	.and()
    	.formLogin()
    	.permitAll()
    	.and()
    	.logout()
    	.permitAll();
    	
    	http.csrf().disable(); 

    }
}


package com.devone.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	@Override
 	protected void configure(HttpSecurity http) throws Exception {
 		http.authorizeRequests().antMatchers("/svc/v1/private/**").hasRole("USER").and()
 				// Possibly more configuration ...
 				.formLogin() // enable form based log in
 				// set permitAll for all URLs associated with Form Login
 				.permitAll();
 	}
	
	@Autowired
	public void	configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("leo").password("admin").roles("USER")
		.and()
		.withUser("otro").password("admin").roles("USER", "ADMIN");
	}
}

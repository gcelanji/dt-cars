package com.gcelanji.dtcars.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	
	@Autowired
	private DataSource securityDataSource;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// use JDBC authentication
		auth.jdbcAuthentication().dataSource(securityDataSource);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
		.antMatchers(HttpMethod.GET, "/api/dt_cars").hasRole("USER")
		.antMatchers(HttpMethod.GET, "/api/dt_cars/**").hasRole("USER")
		.antMatchers(HttpMethod.POST, "/api/dt_cars").hasRole("ADMIN")
		.antMatchers(HttpMethod.POST, "/api/dt_cars/**").hasRole("ADMIN")
		.antMatchers(HttpMethod.PUT, "/api/dt_cars").hasRole("ADMIN")
		.antMatchers(HttpMethod.PUT, "/api/dt_cars/**").hasRole("ADMIN")
		.antMatchers(HttpMethod.DELETE, "/api/dt_cars/**").hasRole("ADMIN")
		.and()
		.httpBasic()
		.and()
		.csrf().disable()
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		
	}
	
	
}

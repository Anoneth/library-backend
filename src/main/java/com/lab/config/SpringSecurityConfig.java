package com.lab.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter implements WebMvcConfigurer {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
                .withUser("user").password("{noop}password").roles("USER")
                .and()
                .withUser("admin").password("{noop}password").roles("USER", "ADMIN");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

		http
			.cors().and()
			.httpBasic().and().authorizeRequests()
			.antMatchers(HttpMethod.GET, "/user**").hasRole("USER")
			.antMatchers(HttpMethod.GET, "/authors**").hasRole("USER")
			.antMatchers(HttpMethod.POST, "/authors.get**").hasRole("USER")
			.antMatchers(HttpMethod.POST, "/authors.add**").hasRole("USER")
			.antMatchers(HttpMethod.POST, "/authors.edit**").hasRole("USER")
			.antMatchers(HttpMethod.POST, "/authors.remove**").hasRole("USER")
			.and().csrf().disable()
			.formLogin().disable();
    }
    
    @Override
    public void addCorsMappings(CorsRegistry registry) {
    	registry.addMapping("/**").allowedOrigins("http://localhost:4200").allowedMethods("*");
    }
}
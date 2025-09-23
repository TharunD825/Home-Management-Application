package com.uniq.HotelManagement.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	
	public SecurityConfig() {
		
	}
	
	
	@Bean
	public PasswordEncoder passwordencode() {
		
		return new BCryptPasswordEncoder();
		
	}
	
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	    http.csrf(csrf -> csrf.disable())
	        .authorizeHttpRequests(auth -> auth
	            .requestMatchers(HttpMethod.POST, "/user/register", "/booking/register", "/room/add").permitAll()
	            .requestMatchers(HttpMethod.GET, "/room/getall").permitAll()
	            .requestMatchers(HttpMethod.PUT, "/bookedroom/checkin", "/bookedroom/checkout").hasRole("ADMIN")
	            .anyRequest().authenticated()
	        )
	        .httpBasic(Customizer.withDefaults())
	        .formLogin(form -> form.disable());

	    return http.build();
	}

}

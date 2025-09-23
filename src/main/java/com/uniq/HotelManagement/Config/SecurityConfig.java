package com.uniq.HotelManagement.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	
	@Autowired
	private UserDetailsServiceImpl userDetailsServiceImpl;
	
	@Bean
	public PasswordEncoder passwordencode() {
		
		return new BCryptPasswordEncoder();
		
	}
	
	/*	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/register","/login").permitAll()               
                .requestMatchers("/product","product/update/{id}","/product/delete/{id}").hasRole("Admin")         
                .requestMatchers("/addcart","/getcartitem","/buy/{userId}").hasRole("Customer")   
                .anyRequest().authenticated()
                
            )
            .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS) )
            .httpBasic(); 

        return http.build();
    } */ 
	
	@Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
      http
          .csrf().disable()
          .authorizeHttpRequests()
          .anyRequest().permitAll(); // Allow all endpoints
      return http.build();
  } 
	
	
	/*@Bean
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
	}*/
	
	@Bean
	AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
		return config.getAuthenticationManager();
	}
	
	AuthenticationProvider authenticationProvider() {
		
		DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsServiceImpl);
		provider.setPasswordEncoder(passwordencode());
		return provider;

}
}
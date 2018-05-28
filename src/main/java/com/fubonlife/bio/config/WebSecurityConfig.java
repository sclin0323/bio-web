package com.fubonlife.bio.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;


//@Configuration
//@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

//	@Autowired
//	private UserDetailsServiceImpl userDetailsService;
//	
//	public WebSecurityConfig() {
//		System.out.println("WebSecurityConfig");
//	}
//	
//	@SuppressWarnings("deprecation")
//	@Bean
//	public static NoOpPasswordEncoder passwordEncoder() {
//	  return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
//	}
//	
////	@Bean
////	public PasswordEncoder passwordEncoder() {
////	  return PasswordEncoderFactories.createDelegatingPasswordEncoder();
////	}
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//		.authorizeRequests()
//			.antMatchers("/web/test/**").permitAll()		
//			.antMatchers("/web/testadmin/**").hasRole("ADMIN")			
//			.and().httpBasic();
//	}
//
//	@Override
//	public void configure(AuthenticationManagerBuilder auth) throws Exception {
//		
//		//UserBuilder users = User.withDefaultPasswordEncoder();
//		
//		auth.inMemoryAuthentication().withUser("admin4").password("Password5").roles("ADMIN");
//		//auth.passwordEncoder(passwordEncoder());
//		//auth.inMemoryAuthentication().withUser("user1").password("user1Pass").roles("USER");
//		//auth.userDetailsService(userDetailsService);
//	}

	
}

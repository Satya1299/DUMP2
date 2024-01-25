package com.satya.springpro.configuration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

@Configuration
	public class AppConfiguration {
//		@Value("${user.name}")
//		private String username;
//
//		@Value("${user.email}")
//		private String email;
	
	@Autowired
	private Environment environment;
	
		

		
		@Profile("dev")
		@Bean
		public void loadDevProfile() {
			System.out.println("Username-dev : " + environment.getProperty("user.name") + "useremail-dev : " + environment.getProperty("user.email"));
		}

		
		@Profile("int")
		@Bean
		public void loadIntProfile() {
			System.out.println("Username-int : " + environment.getProperty("user.name") + "useremail-int : " + environment.getProperty("user.email"));
		}
	}


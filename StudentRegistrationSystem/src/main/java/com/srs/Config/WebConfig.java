package com.srs.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.srs")
public class WebConfig {

	
	@Bean
	public InternalResourceViewResolver  getInternalResourceViewResolver() {
		
		InternalResourceViewResolver intReslover = new InternalResourceViewResolver();
		intReslover.setPrefix("WEB-INF/JSP/");
		intReslover.setSuffix(".jsp");
		
		
		return intReslover;
	}
}

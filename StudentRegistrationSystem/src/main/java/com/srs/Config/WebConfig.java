package com.srs.Config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.srs")
public class WebConfig extends WebMvcConfigurerAdapter{

	
	@Bean
	public InternalResourceViewResolver  getInternalResourceViewResolver() {
		
		InternalResourceViewResolver intReslover = new InternalResourceViewResolver();
		intReslover.setPrefix("WEB-INF/JSP/");
		intReslover.setSuffix(".jsp");
		
		return intReslover;
	}
	
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
		 
		registry.addResourceHandler("/CSS/**").addResourceLocations("/WEB-INF/CSS/");
        registry.addResourceHandler("/JS/**").addResourceLocations("/WEB-INF/JS/");
    }
	@Bean
	public DataSource getDataSource(){
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/srsystem");
		dataSource.setUsername("appuser");
		dataSource.setPassword("appuser");
		
		return dataSource;
		
	}
/*	@Bean
	public User_login getDAO()
	{
		return new User_login(getDataSource());
	}*/
	@Bean
	public DBConnection getDAO()
	{
		return new DBConnection(getDataSource());
	}
}

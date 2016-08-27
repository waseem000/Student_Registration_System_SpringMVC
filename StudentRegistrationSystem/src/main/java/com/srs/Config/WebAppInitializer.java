package com.srs.Config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer implements WebApplicationInitializer  {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		WebApplicationContext context= getContext();
		servletContext.addListener(new ContextLoaderListener(context));
		ServletRegistration.Dynamic Dispatcher =servletContext.addServlet("DispatcherServlet", new DispatcherServlet(context));
		
		Dispatcher.setLoadOnStartup(1);		
		
		Dispatcher.addMapping("*.html");
		Dispatcher.addMapping("*.js");
		Dispatcher.addMapping("*.css");
	}

	private WebApplicationContext getContext() {

		AnnotationConfigWebApplicationContext annoContext = new AnnotationConfigWebApplicationContext();
		annoContext.register(WebConfig.class);
		
		return annoContext;
		
	}
}

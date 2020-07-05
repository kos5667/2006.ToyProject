package com.ToyProject;

import javax.servlet.Filter;
import javax.servlet.FilterRegistration.Dynamic;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.FrameworkServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { SecurityConfig.class };
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		// TODO Auto-generated method stub
		return super.createRootApplicationContext();
	}

	@Override
	protected WebApplicationContext createServletApplicationContext() {
		// TODO Auto-generated method stub
		return super.createServletApplicationContext();
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		super.onStartup(servletContext);
	}

	@Override
	protected void registerDispatcherServlet(ServletContext servletContext) {
		// TODO Auto-generated method stub
		super.registerDispatcherServlet(servletContext);
	}

	@Override
	protected String getServletName() {
		// TODO Auto-generated method stub
		return super.getServletName();
	}

	@Override
	protected FrameworkServlet createDispatcherServlet(WebApplicationContext servletAppContext) {
		// TODO Auto-generated method stub
		return super.createDispatcherServlet(servletAppContext);
	}

	@Override
	protected ApplicationContextInitializer<?>[] getServletApplicationContextInitializers() {
		// TODO Auto-generated method stub
		return super.getServletApplicationContextInitializers();
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Filter[] getServletFilters() {
		// TODO Auto-generated method stub
		return super.getServletFilters();
	}

	@Override
	protected Dynamic registerServletFilter(ServletContext servletContext, Filter filter) {
		// TODO Auto-generated method stub
		return super.registerServletFilter(servletContext, filter);
	}

	@Override
	protected boolean isAsyncSupported() {
		// TODO Auto-generated method stub
		return super.isAsyncSupported();
	}

	@Override
	protected void customizeRegistration(javax.servlet.ServletRegistration.Dynamic registration) {
		// TODO Auto-generated method stub
		super.customizeRegistration(registration);
	}

	@Override
	protected void registerContextLoaderListener(ServletContext servletContext) {
		// TODO Auto-generated method stub
		super.registerContextLoaderListener(servletContext);
	}

	@Override
	protected ApplicationContextInitializer<?>[] getRootApplicationContextInitializers() {
		// TODO Auto-generated method stub
		return super.getRootApplicationContextInitializers();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}

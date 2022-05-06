package com.javabydeveloper.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javabydeveloper.spring.config.ScanMultiplePackageConfig;


public class ScanMultiplePackageConfigDemo {

	 public static void main(String[] args) {
	    	ApplicationContext ctxt = new AnnotationConfigApplicationContext(ScanMultiplePackageConfig.class);
	        
	        String[] springComponents = ctxt.getBeanDefinitionNames();
	        
	        for(String bean : springComponents)
	        	System.out.println(bean);  
	    }
}

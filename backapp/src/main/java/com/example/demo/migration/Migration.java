package com.example.demo.migration;



import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

public @interface Migration {

	
		 String id();
		 
		 String context();
		 
		 int sequence();
		 
		 String executeMethod() default "execute";
		 
	    boolean runAlways() default false;
	  
	    boolean runOnChange() default true;
	    
	    
	    boolean failOnError() default true;
	    
	    String author() default "Unknown";
	
}

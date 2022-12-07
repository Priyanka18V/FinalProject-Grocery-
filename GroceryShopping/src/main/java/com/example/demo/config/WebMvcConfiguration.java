package com.example.demo.config;

import com.example.demo.web.interceptors.GreetingInterceptor;
import com.example.demo.web.interceptors.TitleInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

	    private final TitleInterceptor titleInterceptor;
	    private final GreetingInterceptor greetingInterceptor;

	    @Autowired
	    public WebMvcConfiguration(TitleInterceptor titleInterceptor, GreetingInterceptor greetingInterceptor) {
	        this.titleInterceptor = titleInterceptor;
	        this.greetingInterceptor = greetingInterceptor;
	    }

	    @Override
	    public void addInterceptors(InterceptorRegistry registry) {
	        registry.addInterceptor(this.titleInterceptor);
	        registry.addInterceptor(this.greetingInterceptor);
	    }
}

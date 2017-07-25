package com.lls.springboot.iterceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	// @Bean
	// public AccessTokenVerifyInterceptor tokenVerifyInterceptor() {
	// return new AccessTokenVerifyInterceptor();
	// }

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new AccessTokenVerifyInterceptor())
				.addPathPatterns("/home/**");
		super.addInterceptors(registry);
	}

}

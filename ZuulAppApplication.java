package com.zuulApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.zuulApp.filter.ErrorFilter;
import com.zuulApp.filter.PostFilter;
import com.zuulApp.filter.PreFilter;
import com.zuulApp.filter.RouteFilter;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
class ZuulAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulAppApplication.class, args);
	}

	@Bean
	public PreFilter prefilter() {
		return new PreFilter();
	}
	
	@Bean
	public PostFilter postfilter() {
		return new PostFilter();
	}
	
	@Bean
	public ErrorFilter errorfilter() {
		return new ErrorFilter();
	}
	
	@Bean
	public RouteFilter routefilter() {
		return new RouteFilter();
	}
	
	
	
	
}

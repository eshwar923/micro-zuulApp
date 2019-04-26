package com.zuulApp.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class ErrorFilter extends ZuulFilter {

	@Override
	public Object run() throws ZuulException {
		System.out.println("run() of ErrorFilter");
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public String filterType() {
		return "error";
	}
}

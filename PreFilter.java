package com.zuulApp.filter;

import com.netflix.zuul.ZuulFilter;

public class PreFilter extends ZuulFilter{

	@Override
	public Object run()  {
		System.out.println("run() of PreFilter");
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
		return "pre";
	}

}

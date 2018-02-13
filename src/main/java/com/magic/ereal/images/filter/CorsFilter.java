package com.magic.ereal.images.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Filter - Ajax跨域
 * 
 * 
 * 
 */
@Component
public class CorsFilter implements Filter {
	  public void doFilter(ServletRequest request, ServletResponse res, FilterChain chain) throws IOException, ServletException {
	    HttpServletResponse response = (HttpServletResponse) res;
	    response.setHeader("Access-Control-Allow-Origin", "*");
	    response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
	    response.setHeader("Access-Control-Max-Age", "3600");
	    response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
	    chain.doFilter(request, res);
	  }
	  
	  public void init(FilterConfig filterConfig) {}
	  
	  public void destroy() {}

}

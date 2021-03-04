package com.ivoronline.springboot_filter_create.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.springframework.stereotype.Component;

@Component
public class MyFilter implements Filter {

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
    throws IOException, ServletException {

    //THIS CODE IS EXECUTED DURING HTTP REQUEST
    System.out.println("MyFilter  : Code for HTTP Request");

    //CALLS
    //  - doFilter() METHOD OF THE NEXT   FILTER  IN CHAIN
    //  - Endpoint   IF THERE ARE NO MORE FILTERS IN CHAIN
    //RETURNS FROM THIS METHOD DURING HTTP RESPONSE
    //  - CAUSING SUBSEQUENT CODE TO BE EXECUTED DURING HTTP RESPONSE
    //  - CAUSING FILTERS TO BE EXECUTED IN REVERSE ORDER DURING HTTP RESPONSE (BUT ONLY BELOW CODE)
    chain.doFilter(request, response);  //DIVIDES HTTP REQUEST AND RESPONSE CODE

    //THIS CODE IS EXECUTED DURING HTTP RESPONSE
    System.out.println("MyFilter  : Code for HTTP Response");

  }

}

package com.ivoronline.springboot_filter_create.config;

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
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterchain)
    throws IOException, ServletException {

    //LOG HTTP REQUEST PARAMETERS
    System.out.println(request.getProtocol  ()); //HTTP/1.1
    System.out.println(request.getServerName()); //localhost
    System.out.println(request.getServerPort()); //8080

    filterchain.doFilter(request, response);

  }

}
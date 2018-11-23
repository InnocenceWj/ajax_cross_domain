package com.wj.ajaxserver;

import com.wj.ajaxserver.filter.CrosFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AjaxserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(AjaxserverApplication.class, args);
    }

}

package com.example.vueparentss.config;

import com.example.vueparentss.Listener.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class MyWebConfig implements WebMvcConfigurer {

//    @Autowired
//    LoginInterceptor loginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LoginInterceptor()).excludePathPatterns("/admin/selectOne","/code");
//        registry.addInterceptor(new LoginInterceptor()).addPathPatterns(
//                "/emp/**",
//                "/post/**",
//                "/checks/**",
//                "/dataInfo/**"
//                );
    }

}

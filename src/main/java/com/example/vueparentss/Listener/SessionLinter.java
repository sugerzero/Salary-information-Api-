package com.example.vueparentss.Listener;

import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@Component
public class SessionLinter implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("创建session对象。。。。");

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("销毁session对象。。。");

    }
}

package org.comstudy.myweb.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionListenser implements HttpSessionListener {

    public SessionListenser() {
    	System.out.println("생성자 SessionListenser");
    }

    public void sessionCreated(HttpSessionEvent se)  { 
    	System.out.println("sessionCreated() - SessionListenser");

    }

    public void sessionDestroyed(HttpSessionEvent se)  { 
    	System.out.println("sessionDestroyed() - SessionListenser");

    }
	
}

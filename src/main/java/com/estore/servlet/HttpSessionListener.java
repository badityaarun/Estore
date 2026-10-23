package com.estore.servlet;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;

@WebListener
public class HttpSessionListener implements javax.servlet.http.HttpSessionListener, HttpSessionAttributeListener
{
	public void sessionCreated(HttpSessionEvent hse)
	{
		System.out.println("Session Object Created");
		System.out.println("Application deployed: "+hse.getSession());
	}
	public void sessionDestroyed(HttpSessionEvent hse)
	{
		System.out.println("Request Object destroyed");
	}
	public void attributeAdded(HttpSessionBindingEvent hsbe)
	{
		System.out.println("Attribute added on HttpSession object");
		System.out.println("Attribute Name: "+hsbe.getName());
	}
	public void attributeRemoved(HttpSessionBindingEvent hsbe)
	{
		System.out.println("Attribute removed from theHttpSession");
	}
}

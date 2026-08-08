package com.servlet;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

//@WebListener
public class RequestListener implements ServletRequestListener, ServletRequestAttributeListener {

    @Override
    public void requestInitialized(ServletRequestEvent sre) {

        System.out.println("Request Object Created");
        System.out.println("Server Name : " + sre.getServletRequest().getServerName());

    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {

        System.out.println("Request Object Destroyed");

    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {

        System.out.println("Attribute Added to Request Object");
        System.out.println("Attribute Name : " + srae.getName());
        System.out.println("Attribute Value : " + srae.getValue());

    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {

        System.out.println("Attribute Removed from Request Object");
        System.out.println("Attribute Name : " + srae.getName());

    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {

        System.out.println("Attribute Replaced in Request Object");
        System.out.println("Attribute Name : " + srae.getName());

    }

}
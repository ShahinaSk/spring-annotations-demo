package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside BeanLifeCycleDemoBean: afterPropertiesSet()");

    }

    public void customInit(){
        System.out.println("Inside BeanLifeCycleDemoBean: customInit()");
    }

    public void customDestroy(){
        System.out.println("Inside BeanLifeCycleDemoBean:  customDestroy()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Inside BeanLifeCycleDemoBean: destroy()");
    }
}

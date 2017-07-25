/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.commons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author Jorge
 */
public class BeanFactory {

    private static BeanFactory beanFactory=new BeanFactory();
    private ApplicationContext context;
    
    private BeanFactory() {
        context = new FileSystemXmlApplicationContext("./src/bean.xml");
    }
    
    public static ApplicationContext getApplicationContext(){
        return beanFactory.context;
    }
    
    
    
}

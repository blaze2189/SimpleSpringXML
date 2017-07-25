/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.main;

import com.project.commons.BeanFactory;
import com.project.control.PersonControl;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author Jorge
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = BeanFactory.getApplicationContext();
         
         PersonControl personControl = applicationContext.getBean("personControl", PersonControl.class);
         System.out.println("Person method "+ personControl.getLocalPerson());
         System.out.println("Person class "+ personControl.getPerson());
         
    }
    
}

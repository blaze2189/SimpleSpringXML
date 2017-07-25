/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.control;

import com.project.commons.BeanFactory;
import com.project.entity.Person;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author Jorge
 */
public class PersonControl {
    
    private Person person;
    
    public void setPerson(Person person){
        this.person=person;
    }
    
    public Person getLocalPerson(){
        Person person = BeanFactory.getApplicationContext().getBean("person", Person.class);
        person.setAge(24);
        person.setName("Person");
        person.setLastName("Method");
        return person;
    }
    
    public Person getPerson(){
        this.person.setAge(23);
        this.person.setLastName("Class");
        this.person.setName("Person");
        return this.person;
    }
    
}

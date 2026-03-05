/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.test;

import com.spring.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Abdul Mannan
 */
public class test {
    
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee e = (Employee) context.getBean("e");
        e.showEmployee();
        
        Employee ee = (Employee) context.getBean("e1");
        ee.showEmployee();
        
        Employee eee = (Employee) context.getBean("e2");
        eee.showEmployee();
        
        
    }
    
}

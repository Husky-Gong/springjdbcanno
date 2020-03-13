package com;

import com.zx.controller.PeopleController;
import com.zx.domain.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        PeopleController bean = context.getBean(PeopleController.class);
        System.out.println("----Select all function----");
        bean.showAll();
        System.out.println("----Select one function----");
        bean.showOne(3);
        People people = new People(0,"Blue","f");
        bean.insert(people);
        People people2 = new People(1,"Update","f");
        bean.update(people2);
        bean.delete(1);
    }
}

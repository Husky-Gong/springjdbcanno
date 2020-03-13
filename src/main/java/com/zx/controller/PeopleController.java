package com.zx.controller;


import com.zx.domain.People;
import com.zx.service.IPeopleService;
import com.zx.service.impl.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PeopleController {
    @Autowired
    private IPeopleService peopleService;

    public void showAll(){
        List<People> list = peopleService.queryAll();
        for(People p : list){
            System.out.println(p);
        }
    }

    public void showOne(Integer id){
        People people = peopleService.queryPeople(id);
        System.out.println(people);
    }

    public void insert(People people){
        int i = peopleService.add(people);
        System.out.println(i);
    }

    public void update(People people){
        int i=peopleService.update(people);
        System.out.println(i);
    }

    public void delete(Integer id){
        int i=peopleService.delete(id);
        System.out.println(i);
    }

}

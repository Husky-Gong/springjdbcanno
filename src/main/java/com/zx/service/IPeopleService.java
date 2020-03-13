package com.zx.service;

import com.zx.domain.People;

import java.util.List;

public interface IPeopleService {
    List<People> queryAll();

    People queryPeople(Integer id);

    int add(People people);

    int update(People people);

    int delete(Integer id);
}

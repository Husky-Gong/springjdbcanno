package com.zx.dao;

import com.zx.domain.People;

import java.util.List;

public interface IPeopleDao {
    List<People> selectList();

    People selectOne(Integer id);

    int insert(People people);

    int update(People people);

    int delete(Integer id);
}

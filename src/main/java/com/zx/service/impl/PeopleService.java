package com.zx.service.impl;

import com.zx.dao.IPeopleDao;
import com.zx.dao.impl.PeopleImpl;
import com.zx.domain.People;
import com.zx.service.IPeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleService implements IPeopleService {
    @Autowired
    IPeopleDao peopleDao = new PeopleImpl();

    @Override
    public List<People> queryAll() {
        return peopleDao.selectList();
    }

    @Override
    public People queryPeople(Integer id) {
        return peopleDao.selectOne(id);
    }

    @Override
    public int add(People people) {
        int i = peopleDao.insert(people);
        return i;
    }

    @Override
    public int update(People people) {
        int i = peopleDao.update(people);
        return i;
    }

    @Override
    public int delete(Integer id) {
        int i = peopleDao.delete(id);
        return i;
    }
}

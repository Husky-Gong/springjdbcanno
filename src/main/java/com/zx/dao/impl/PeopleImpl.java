package com.zx.dao.impl;

import com.zx.dao.IPeopleDao;
import com.zx.domain.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class PeopleImpl implements IPeopleDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<People> selectList() {
        String sql = "select id,name,gender from people";
        List<People> list = jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(People.class));
        return list;
    }

    @Override
    public People selectOne(Integer id) {
        String sql = "select id,name,gender from people where id=?";
        People people = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(People.class),id);
        return people;
    }

    @Override
    public int insert(People people) {
        String sql = "INSERT INTO people (id, name, gender) VALUES(0,?,?)";
        int insertPpl = jdbcTemplate.update(sql,people.getName(),people.getGender());
        return insertPpl;
    }

    @Override
    public int update(People people) {
        String sql = "update people set name=?,gender=? where id=?";
        int updatePpl = jdbcTemplate.update(sql,people.getName(),people.getGender(),people.getId());
        return updatePpl;
    }

    @Override
    public int delete(Integer id) {
        String sql = "delete from people where id=?";
        int deletePpl = jdbcTemplate.update(sql,id);
        return deletePpl;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
}

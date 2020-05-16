package com.example.demo.mapper;

import com.example.demo.pojo.Msg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

    @Mapper
    @Repository
    public interface MsgMapper {

        // 获取所有部门信息
        @Select("select * from test")
        List<Msg> getDepartments();

        // 通过id获得部门
        @Select("select * from test where id=")
        Msg getMsg(Integer id);

    }

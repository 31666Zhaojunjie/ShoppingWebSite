package com.yyh.service;

import com.yyh.po.Student;

import java.util.List;

/**
 * @author YanYuHang
 * @create 2019-11-18-14:11
 */
public interface StudentService {

    List<Student> selectAll();


    Student selectOne(int id);

    int insert(Student student);

    int delete(int id);

    int update(Student student);
}

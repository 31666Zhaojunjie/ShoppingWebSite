package com.yyh.dao;

import com.yyh.po.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author YanYuHang
 * @create 2019-11-18-14:03
 */
public interface StudentDao {

    List<Student> selectAll();

    Student selectOne(@Param("id") int id);

    int insert(Student student);

    int delete(@Param("id") int id);

    int update(Student student);
}

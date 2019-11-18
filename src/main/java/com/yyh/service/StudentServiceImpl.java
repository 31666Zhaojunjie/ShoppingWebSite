package com.yyh.service;

import com.yyh.dao.StudentDao;
import com.yyh.po.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author YanYuHang
 * @create 2019-11-18-14:11
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    public List<Student> selectAll() {
        return studentDao.selectAll();
    }


    public Student selectOne(int id) {
        return studentDao.selectOne(id);
    }

    public int insert(Student student) {
        return studentDao.insert(student);
    }

    public int delete(int id) {
        return studentDao.delete(id);
    }

    public int update(Student student) {
        return studentDao.update(student);
    }
}

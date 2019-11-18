package com.yyh.po;

import com.yyh.dao.StudentDao;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author YanYuHang
 * @create 2019-11-18-14:03
 */
@Data
public class Student {
    private int id;
    private String name;
    private String sex;
}

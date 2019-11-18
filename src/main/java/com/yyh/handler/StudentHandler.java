package com.yyh.handler;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yyh.po.Student;
import com.yyh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YanYuHang
 * @create 2019-11-18-14:14
 */
@Controller
@RequestMapping("/stu")
public class StudentHandler {

    @Autowired
    private StudentService ss;


    @RequestMapping("/")
    public String findAll(Model model, Integer pageNum) {
        if (pageNum == null) {
            pageNum = 1;
        }
        //1.设定当前是第几页，每页显示多少条信息
        //(pageNum  第几页  pageSize  每页显示的条数)
        PageHelper.startPage(pageNum, 3);
        //2.正常执行查询操作
        List<Student> students = ss.selectAll();
        //3.分页
        PageInfo<Student> info=new PageInfo<Student>(students);
        //4.传递   getList()分页后的数据
        model.addAttribute("list",info.getList());

        int pages = info.getPages();
        List<Integer> page = new ArrayList<Integer>();
        for (int i = 1; i <= pages; i++) {
            page.add(i);
        }


        // 传递当前页码
        model.addAttribute("pageNum",pageNum);
        // 传递 getPages()  总页数
        model.addAttribute("sumPage",pages);
        //传递页码
        model.addAttribute("page",page);
        return "index";
    }


}

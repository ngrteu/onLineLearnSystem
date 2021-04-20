package com.learn.System.learning.controller;


import com.learn.System.learning.entity.Student_manage;
import com.learn.System.learning.mapper.Student_manageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 学生管理表 前端控制器
 * </p>
 *
 * @author whc
 * @since 2021-04-13
 */
@Controller
@RequestMapping("/student")
public class Student_manageController {
    @Autowired
    Student_manageMapper studentManageMapper;

    @RequestMapping("/getLogin")
    String Login(String username,String password){
        Student_manage stu = studentManageMapper.getNameAndPasswordByLogin(username, password);
        if(stu != null){
            return  "redirect:/dist/data-html/home-page.html";
        }
        return  null;
    }
}


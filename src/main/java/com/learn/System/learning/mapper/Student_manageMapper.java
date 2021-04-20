package com.learn.System.learning.mapper;

import com.learn.System.learning.entity.Student_manage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 * 学生管理表 Mapper 接口
 * </p>
 *
 * @author whc
 * @since 2021-04-13
 */
public interface Student_manageMapper extends BaseMapper<Student_manage> {
    @Select("SELECT * FROM student_manage WHERE stu_LoginName = #{name} AND stu_LoginPassword = #{password}")
    Student_manage getNameAndPasswordByLogin(String name,String password);
}

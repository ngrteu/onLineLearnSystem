package com.learn.System.learning.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 学生管理表
 * </p>
 *
 * @author whc
 * @since 2021-04-13
 */
@Data
public class Student_manage implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("stu_LoginName")
    private String stuLoginname;

    @TableField("stu_LoginPassword")
    private String stuLoginpassword;

    /**
     * 姓名
     */
    @TableField("stu_Name")
    private String stuName;

    /**
     * 性别
     */
    @TableField("stu_Sex")
    private String stuSex;

    /**
     * 电话号码
     */
    private Integer phone;

    /**
     * 学院ID
     */
    @TableField("collage_Id")
    private Integer collageId;

    /**
     * 课程ID
     */
    @TableField("course_Id")
    private Integer courseId;

    /**
     * 身份ID
     */
    @TableField("role_Id")
    private Integer roleId;

    @Version
    private Integer version;


}

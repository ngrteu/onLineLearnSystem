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
 * 教师信息管理表
 * </p>
 *
 * @author whc
 * @since 2021-04-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Teacher_manage implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 登录账户
     */
    @TableField("master_LoginName")
    private String masterLoginname;

    /**
     * 密码
     */
    @TableField("master_LoginPassword")
    private String masterLoginpassword;

    /**
     * 老师名称
     */
    @TableField("master_Name")
    private String masterName;

    /**
     * 性别
     */
    @TableField("master_Sex")
    private String masterSex;

    /**
     * 联系电话
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
    @TableField("courses_Id")
    private Integer coursesId;

    /**
     * 身份ID
     */
    @TableField("role_Id")
    private Integer roleId;

    /**
     * 乐观锁
     */
    @Version
    private Integer version;


}

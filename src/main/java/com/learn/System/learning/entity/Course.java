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
 * 
 * </p>
 *
 * @author whc
 * @since 2021-04-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 课程名称
     */
    @TableField("course_Name")
    private String courseName;

    /**
     * 所属学院编号
     */
    @TableField("collage_Id")
    private Integer collageId;

    /**
     * 课程介绍
     */
    @TableField("course_Desc")
    private String courseDesc;

    @Version
    private Integer version;


}

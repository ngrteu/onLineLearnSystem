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
 * 学院表
 * </p>
 *
 * @author whc
 * @since 2021-04-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Collage implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 学院名称
     */
    @TableField("collage_Name")
    private String collageName;

    /**
     * 学院介绍
     */
    @TableField("collage_Desc")
    private String collageDesc;

    @Version
    private Integer version;


}

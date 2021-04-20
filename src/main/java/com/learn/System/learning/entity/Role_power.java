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
 * 权限分配表
 * </p>
 *
 * @author whc
 * @since 2021-04-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Role_power implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 身份ID
     */
    @TableField("role_Id")
    private Integer roleId;

    /**
     * 权限ID
     */
    @TableField("power_Id")
    private Integer powerId;

    @Version
    private Integer version;


}

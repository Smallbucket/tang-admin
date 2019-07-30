package org.yellowsneakers.business.app.blog.model;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

/**
 *  实体类
 *
 * @author Blade
 * @since 2018-04-30
 */
@Data
@TableName("blade_user")
public class BladeUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 账号
     */
    private String account;
    /**
     * 密码
     */
    private String password;
    /**
     * 昵称
     */
    private String name;
    /**
     * 真名
     */
    @TableField("real_name")
    private String realName;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 手机
     */
    private String phone;
    /**
     * 生日
     */
    private Date birthday;
    /**
     * 性别
     */
    private Integer sex;
    /**
     * 角色id
     */
    @TableField("role_id")
    private String roleId;
    /**
     * 部门id
     */
    @TableField("dept_id")
    private String deptId;
    
    private Integer uid;

}

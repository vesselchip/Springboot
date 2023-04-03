package com.sffj2.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("user")
public class User {
    @TableId(value = "id",type= IdType.AUTO)
    private Long id;
    @TableField("username")
    private String username;
    private String password;
    private Integer role;
    private Integer isdeleted;
}

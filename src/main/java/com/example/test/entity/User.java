package com.example.test.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("user")
public class User implements Serializable {
    @TableId(value="id",type= IdType.UUID)
    private String id;
    @TableField("name")
    private String name;
    @TableField("password")
    private String password;
    @TableField("realname")
    private String realname;
    @TableField("tel")
    private String tel;
    @TableField("address")
    private String address;
    public User(String name,String password){
        this.name=name;
        this.password=password;
    }
}

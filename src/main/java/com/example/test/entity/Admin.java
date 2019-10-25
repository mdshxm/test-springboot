package com.example.test.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("admin")
public class Admin implements Serializable {
    @TableId(value="id",type = IdType.UUID)
    private String id;
    @TableField("t_name")
    private String t_name;
    @TableField("t_tel")
    private String t_tel;
}

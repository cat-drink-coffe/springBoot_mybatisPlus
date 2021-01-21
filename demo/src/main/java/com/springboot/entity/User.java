package com.springboot.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private Integer age;
    private String email;
    @TableField(value = "gmt_create",fill = FieldFill.INSERT)
    private Date gmt_create;
    @TableField(value = "gmt_modified",fill = FieldFill.INSERT_UPDATE)
    private Date gmt_modified;
    public User(String name, int age, String email) {
        this.name=name;
        this.age=age;
        this.email=email;
    }
}

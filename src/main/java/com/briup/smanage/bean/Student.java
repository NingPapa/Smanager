package com.briup.smanage.bean;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class Student implements Serializable {
    @ApiModelProperty(value="学生id",required = true)
    private  int id;
    @ApiModelProperty(value="学生姓名")
    private String name;
    @ApiModelProperty(value="学生成绩")
    private int grade;
}

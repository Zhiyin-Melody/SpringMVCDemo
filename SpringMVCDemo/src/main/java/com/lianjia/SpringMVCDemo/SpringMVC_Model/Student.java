package com.lianjia.SpringMVCDemo.SpringMVC_Model;

import java.io.Serializable;

/**
 * @Aauthor:
 * @Date:2018/5/1417:47
 * @Description:mvc中的m-model，描述数据结构模型；
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    /*设置Student类的成员变量，并且设置get和set方法；*/
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /*这里一定要重写toString方法，返回数据；*/
    public String toString(){
        return "Student [id = " + id +
                ", name = " + name + "]";
    }
}

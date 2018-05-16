package com.lianjia.SpringMVCDemo.SpringMVC_Service;

import com.lianjia.SpringMVCDemo.SpringMVC_Model.Student;

import java.util.List;

/**
 * @Aauthor:
 * @Date:2018/5/14 16:10
 * @Description:提供StudentService接口；
 */
public interface StudentService {
    public List<Student> getAllStudents();
}
